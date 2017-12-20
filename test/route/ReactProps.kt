package react

import kotlin.js.Json

external interface ReactProps : Json,RProps {
    var key: String?
    var children: ReactChildren?

    @JsName("ref")
    var refByName: String?

    @JsName("ref")
    var ref: (Any) -> Unit
}

