package demo

import index.store
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class BackgroundPickerIndex:RComponent<RProps,RState>(){

    override fun RBuilder.render() {
        fuck(store)
    }
}