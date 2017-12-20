package index

import app.App
import demo.BackgroundPickerIndex
import demo.Clock
import demo.Counter
import demo.Tabs
import kotlinext.js.invoke
import kotlinext.js.require
import kroute.route
import kroute.router
import kroute.switch
import mobx.Mobx.autorun
import mobx.Observable
import mobx.store.CounterStore
import react.dom.render
import react.history.History
import kotlin.browser.document
import kotlin.js.Date

class Store : Observable{
    // @observable properties
    var backgroundColor = "white"
    var now = Date()
    var count = 0

    // @computed properties
    val millisSinceEpoch: Double
        get() = now.getTime() + 2000

    val bbb : String
    get() = backgroundColor + "computed"

    init {
        activate()
        autorun {
           console.log("autorun ${now} backgroundColor ${backgroundColor} $bbb")
        }
    }
}

val store = Store()

val counterStore = CounterStore()

fun main(args: Array<String>) {
    require("src/index/index.css")
    require("src/app/App.css")
    require("src/logo/Logo.css")

    /*window.setInterval(action("showNow"){
        store.now = Date()
    }, 10000)*/

    render(document.getElementById("root")) {
        router {
            attrs.history = History.createBrowserHistory()
            switch {
                route("/",  App::class, exact = true)
                route("/test1", BackgroundPickerIndex::class, exact = true)
                route("/Counter", Counter::class, exact = true)
                route("/Clock", Clock::class, exact = true)
                route("/tab", Tabs::class, exact = true)
            }
        }
    }
}