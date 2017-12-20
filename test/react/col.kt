@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface ColSize {
    var span: Number? get() = definedExternally; set(value) = definedExternally
    var order: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var push: Number? get() = definedExternally; set(value) = definedExternally
    var pull: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ColProps {
    var className: String? get() = definedExternally; set(value) = definedExternally
    var span: Number? get() = definedExternally; set(value) = definedExternally
    var order: Number? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var push: Number? get() = definedExternally; set(value) = definedExternally
    var pull: Number? get() = definedExternally; set(value) = definedExternally
    var xs: dynamic /* Number | ColSize */ get() = definedExternally; set(value) = definedExternally
    var sm: dynamic /* Number | ColSize */ get() = definedExternally; set(value) = definedExternally
    var md: dynamic /* Number | ColSize */ get() = definedExternally; set(value) = definedExternally
    var lg: dynamic /* Number | ColSize */ get() = definedExternally; set(value) = definedExternally
    var xl: dynamic /* Number | ColSize */ get() = definedExternally; set(value) = definedExternally
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var style: React.CSSProperties? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var span: Any
    var order: Any
    var offset: Any
    var push: Any
    var pull: Any
    var className: Any
    var children: Any
    var xs: Any
    var sm: Any
    var md: Any
    var lg: Any
    var xl: Any
}
