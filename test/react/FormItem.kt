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

external interface FormItemProps {
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var label: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var labelCol: ColProps? get() = definedExternally; set(value) = definedExternally
    var wrapperCol: ColProps? get() = definedExternally; set(value) = definedExternally
    var help: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var extra: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var validateStatus: dynamic /* Any /* "success" */ | Any /* "warning" */ | Any /* "error" */ | Any /* "validating" */ */ get() = definedExternally; set(value) = definedExternally
    var hasFeedback: Boolean? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: React.CSSProperties? get() = definedExternally; set(value) = definedExternally
    var colon: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface FormItemContext {
    var form: WrappedFormUtils
    var vertical: Boolean
}
external interface `T$0` {
    var hasFeedback: Boolean
    var prefixCls: String
    var colon: Boolean
}
external interface `T$1` {
    var prefixCls: Any
    var label: Any
    var labelCol: Any
    var help: Any
    var validateStatus: Any
    var hasFeedback: Any
    var wrapperCol: Any
    var className: Any
    var id: Any
    var children: Any
    var colon: Any
}
external interface `T$2` {
    var form: Any
    var vertical: Any
}
