package demo

import kotlinx.html.js.onClickFunction
import mobx.Mobx
import mobx.MobxReact
import mobx.kaction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

enum class Tab(val prettyName: String) { TabA("Tab A"), TabB("Tab B"), TabC("Tab C") }

class TabAContent() : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div { +"TabA Component" }
    }
}

class TabBContent() : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div { +"TabB Component" }
    }
}

class TabCContent() : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div { +"TabC Component" }
    }
}


class Tabs : RComponent<RProps, RState>() {
    init {
        MobxReact.observer(this)
    }

    val selectedTab = Mobx.observable(Tab.TabA)

    override fun RBuilder.render() {
        div {
            h3 {
                +"TabList"
            }
            ul("nav nav-tabs") {
                Tab.values().map { tab ->
                    val isSelected = tab == selectedTab.get()
                    li(if (isSelected) "active" else "") {
                        attrs.attributes["key"] = tab.name
                        a {
                            attrs.onClickFunction = {
                                kaction("tab"){
                                    selectedTab.set(tab)
                                }
                            }
                            attrs.href = "javascript:void(0)"
                        }
                    }
                }
            }
            renderSelectedTabContent(selectedTab.get())
        }


    }

    fun renderSelectedTabContent(selectedTab: Tab): RComponent<RProps, RState> {
        return when (selectedTab) {
            Tab.TabA -> TabAContent()
            Tab.TabB -> TabBContent()
            Tab.TabC -> TabCContent()
        }
    }

}