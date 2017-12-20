package demo

import index.store
import kotlinx.html.js.onClickFunction
import mobx.MobxReact
import mobx.kaction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import kotlin.js.Date

class Clock : RComponent<RProps, RState>() {
    init {
        MobxReact.observer(this)
    }

    override fun RBuilder.render() {
        div {
            h3 {
                +"Clock"
            }
            p {
                +"Milliseconds since epoch: "
                code {
                    +store.millisSinceEpoch.toString()
                    +" (@computed property)"
                }
            }
            span {
                +"The time is "
                code {
                    +store.now.toString()
                    +" (@observable property) "
                }
            }
            button(classes = "btn btn-default") {
                attrs.onClickFunction = {
                    kaction("clock"){
                        store.now = Date()
                    }
                }
                +"Update to now"
            }
        }
    }
}