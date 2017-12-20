package app

import kotlinx.html.js.onClickFunction
import logo.logo
import mobx.Observable
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import ticker.ticker
import kotlin.js.Date

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload xxx."
        }
        p("App-ticker") {
            ticker()
        }
        span("ttt"){
            attrs.onClickFunction = {
                //jq(".ttt").html("nininini")
                //jQuery("#area", window).hover { window.alert("Hello!") }
            }
            +"xxjtestst"
        }
    }
}

fun RBuilder.app() = child(App::class) {}

