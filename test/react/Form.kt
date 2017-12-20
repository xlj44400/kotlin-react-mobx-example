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

external interface FormCreateOption {
    var onFieldsChange: ((props: Any, fields: Array<Any>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onValuesChange: ((props: Any, values: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var mapPropsToFields: ((props: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var withRef: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface FormProps {
    var layout: dynamic /* Any /* "horizontal" */ | Any /* "inline" */ | Any /* "vertical" */ */ get() = definedExternally; set(value) = definedExternally
    var horizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    var inline: Boolean? get() = definedExternally; set(value) = definedExternally
    var vertical: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: WrappedFormUtils? get() = definedExternally; set(value) = definedExternally
    var onSubmit: React.FormEventHandler? get() = definedExternally; set(value) = definedExternally
    var style: React.CSSProperties? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var hideRequiredMark: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var message: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var whitespace: Boolean? get() = definedExternally; set(value) = definedExternally
    var len: Number? get() = definedExternally; set(value) = definedExternally
    var min: Number? get() = definedExternally; set(value) = definedExternally
    var max: Number? get() = definedExternally; set(value) = definedExternally
    var enum: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var pattern: RegExp? get() = definedExternally; set(value) = definedExternally
    var transform: ((value: Any) -> Any)? get() = definedExternally; set(value) = definedExternally
    var validator: ((rule: Any, value: Any, callback: Any, source: Any? /*= null*/, options: Any? /*= null*/) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    var valuePropName: String? get() = definedExternally; set(value) = definedExternally
    var initialValue: Any? get() = definedExternally; set(value) = definedExternally
    var trigger: String? get() = definedExternally; set(value) = definedExternally
    var getValueFromEvent: ((args: Any) -> Any)? get() = definedExternally; set(value) = definedExternally
    var validateTrigger: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var rules: Array<`T$0`>? get() = definedExternally; set(value) = definedExternally
    var exclusive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    fun getFieldsValue(fieldNames: Array<String>? = definedExternally /* null */): Any
    fun getFieldValue(fieldName: String): Any
    fun setFieldsValue(obj: Any)
    fun setFields(obj: Any)
    fun validateFields(fieldNames: Array<String>, options: Any, callback: (erros: Any, values: Any) -> Unit): Any
    fun validateFields(fieldNames: Array<String>, callback: (erros: Any, values: Any) -> Unit): Any
    fun validateFields(options: Any, callback: (erros: Any, values: Any) -> Unit): Any
    fun validateFields(callback: (erros: Any, values: Any) -> Unit): Any
    fun validateFieldsAndScroll(fieldNames: Array<String>? = definedExternally /* null */, options: Any? = definedExternally /* null */, callback: (erros: Any, values: Any) -> Unit? = definedExternally /* null */)
    fun validateFieldsAndScroll(fieldNames: Array<String>? = definedExternally /* null */, callback: (erros: Any, values: Any) -> Unit? = definedExternally /* null */)
    fun validateFieldsAndScroll(options: Any? = definedExternally /* null */, callback: (erros: Any, values: Any) -> Unit? = definedExternally /* null */)
    fun validateFieldsAndScroll(callback: (erros: Any, values: Any) -> Unit? = definedExternally /* null */)
    fun getFieldError(name: String): Array<Any>
    fun getFieldsError(names: Array<String>? = definedExternally /* null */): Any
    fun isFieldValidating(name: String): Boolean
    fun isFieldTouched(name: String): Boolean
    fun isFieldsTouched(names: Array<String>? = definedExternally /* null */): Boolean
    fun resetFields(names: Array<String>? = definedExternally /* null */)
    fun getFieldDecorator(id: String, options: `T$1`? = definedExternally /* null */): (node: React.ReactNode) -> React.ReactNode
}
external interface FormComponentProps {
    var form: `T$2`
}
external interface ComponentDecorator<TOwnProps> {
    @nativeInvoke
    operator fun invoke(component: React.ComponentClass<FormComponentProps /* FormComponentProps & TOwnProps */>): React.ComponentClass<TOwnProps>
}
external interface `T$3` {
    var prefixCls: String
    var layout: String
    var hideRequiredMark: Boolean
    fun onSubmit(e: Any)
}
external interface `T$4` {
    var prefixCls: Any
    var layout: Any
    var children: Any
    var onSubmit: Any
    var hideRequiredMark: Any
}
external interface `T$5` {
    var vertical: Any
}
external interface `T$6` {
    var vertical: Boolean?
}
