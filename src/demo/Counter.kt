package demo

import kotlinx.html.js.onClickFunction
import mobx.Mobx
import mobx.MobxReact
import mobx.kaction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.button
import react.dom.div
import react.dom.jsStyle

class Counter : RComponent<RProps, RState>() {
    init {
        MobxReact.observer(this)
    }

    override fun RBuilder.render() {
        println("[Counter#render] count = ${count.get()}, key = $key")
        val value = count.get()

        div {
            attrs.jsStyle = kotlinext.js.js {
                display = "inline-block"
            }

            button {
                attrs.jsStyle = kotlinext.js.js {
                    width = "50px"
                }
                attrs.attributes["className"] = "btn btn-xs btn-default"
                attrs.onClickFunction = {
                    kaction("decrement"){
                        decrement()
                    }
                }
                +"-1"
            }
            +" $value "
            button {
                attrs.jsStyle = kotlinext.js.js {
                    width = "50px"
                }
                attrs.attributes["className"] = "btn btn-xs btn-default"
                attrs.onClickFunction = {
                    kaction("increment"){
                        increment()
                    }
                }
                +"+1"
            }
        }
    }

    val count = Mobx.observable(0)
    val key = ++Companion.key

    private fun increment() {
        count.set(count.get() + 1)
    }

    private fun decrement() {
        count.set(count.get() - 1)
    }

    override fun componentDidMount() = println("Counter $key did mount")

    companion object {
        private var key = 0
        fun nextKey() = ++key
    }
}