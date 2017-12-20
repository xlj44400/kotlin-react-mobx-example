package demo

import index.Store
import index.counterStore
import index.store
import jQuery
import kotlinext.js.Object
import kotlinx.html.js.onClickFunction
import mobx.MobxReact
import mobx.kaction
import mobx.store.IpInfo
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import kotlin.js.Date

interface BackgroundPickerProps : RProps {
    var store: Store
}

class BackgroundPicker(props:BackgroundPickerProps): RComponent<BackgroundPickerProps, RState>(props) {
    init {
        MobxReact.observer(this)
        console.log("init")
    }

    val colors = listOf("red", "orange", "yellow", "green", "blue", "violet", "white")
    override fun RBuilder.render() {
        val r = JSON.stringify(counterStore.result)
        console.log("store ${props.store.backgroundColor} ${props.store.now} ${r}")

        val style = Css(backgroundColor = props.store.backgroundColor, padding = "20px")
        div {
            attrs.onClickFunction = {
                kaction("test"){
                    store.now = Date()
                    counterStore.name = "xlj5555"

                    jQuery.get("http://freegeoip.net/json/",{
                        commits, status, jqXHR ->
                         //counterStore.result = commits
                        val s = JSON.stringify(commits);
                        val ip = JSON.parse<IpInfo>(s)

                        console.log("${ip.city} ${ip.country_code}")

                        val a = Object.getOwnPropertyNames(commits)

                        console.log(commits.toString())
                    })
                }
            }
            +"ceshidsfsdfsdf"
        }
        div {
            h3 {
                +"BackgroundPicker"
            }
            ul("list-inline") {
                colors.map { mycolor ->
                    val isSelected = props.store.backgroundColor == mycolor

                    li {
                        attrs["key"] = mycolor
                        if (isSelected) {
                            span {
                                // attrs["dangerouslySetInnerHTML"] = "&rarr;"
                                +"dangerouslySetInnerHTML"
                            }
                        } else null
                        button(classes = "btn btn-default") {
                            attrs.jsStyle = kotlinext.js.js {

                                if (isSelected) {
                                    border = 0
                                    backgroundColor = "inherit"
                                    color = "black"
                                } else {
                                    cursor = "pointer"
                                    backgroundColor = mycolor
                                }
                            }

                            attrs.onClickFunction = {
                                console.log(mycolor)
                                kaction("mycolor"){
                                    props.store.backgroundColor = mycolor
                                }
                            }
                            attrs.disabled = isSelected
                            +mycolor
                        }
                    }

                }
            }
        }
    }
}

fun RBuilder.fuck(store: Store) = child(BackgroundPicker::class) {
    attrs.store = store
}