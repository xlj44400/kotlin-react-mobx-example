@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsQualifier("Antd"), JsModule("antd")]
package Antd

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

external interface AffixProps {
    var offset: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Affix : React.Component<AffixProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface AlertProps {
    var type: String
    var closable: Boolean? get() = definedExternally; set(value) = definedExternally
    var closeText: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var message: React.ReactNode
    var description: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var onClose: Function<*>? get() = definedExternally; set(value) = definedExternally
    var showIcon: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Alert : React.Component<AlertProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external open class Badge : React.Component<BadgeProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface BadgeProps {
    var count: Number
    var overflowCount: Number? get() = definedExternally; set(value) = definedExternally
    var dot: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ButtonProps {
    var type: dynamic /* ButtonType | String */ get() = definedExternally; set(value) = definedExternally
    var shape: String? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var htmlType: String? get() = definedExternally; set(value) = definedExternally
    var onClick: Function<*>? get() = definedExternally; set(value) = definedExternally
    var loading: Boolean? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
}
external enum class ButtonType {
    primary,
    ghost,
    dashed
}
external interface ButtonGroupProps {
    var size: String? get() = definedExternally; set(value) = definedExternally
}
external open class ButtonGroup : React.Component<ButtonGroupProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external open class Button : React.Component<ButtonProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Group: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:137:22 to 137:41) */ = definedExternally
    }
}
external interface BreadcrumbItemProps {
    var href: String? get() = definedExternally; set(value) = definedExternally
}
external open class BreadcrumbItem : React.Component<BreadcrumbItemProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface BreadcrumbProps {
    var routes: Array<React.ReactNode>? get() = definedExternally; set(value) = definedExternally
    var params: Any? get() = definedExternally; set(value) = definedExternally
    var separator: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
}
external open class Breadcrumb : React.Component<BreadcrumbProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Item: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:171:21 to 171:43) */ = definedExternally
    }
}
external interface CalendarProps {
    var monthCellRender: Function<*>? get() = definedExternally; set(value) = definedExternally
    var dateCellRender: Function<*>? get() = definedExternally; set(value) = definedExternally
    var fullscreen: Boolean? get() = definedExternally; set(value) = definedExternally
    var locale: Any? get() = definedExternally; set(value) = definedExternally
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var style: Any? get() = definedExternally; set(value) = definedExternally
    var onPanelChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var value: Date? get() = definedExternally; set(value) = definedExternally
    var defaultValue: Date? get() = definedExternally; set(value) = definedExternally
    var mode: String? get() = definedExternally; set(value) = definedExternally
}
external open class Calendar : React.Component<CalendarProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface CarouselProps {
    var effect: String? get() = definedExternally; set(value) = definedExternally
    var dots: Boolean? get() = definedExternally; set(value) = definedExternally
    var vertical: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoplay: Boolean? get() = definedExternally; set(value) = definedExternally
    var easing: String? get() = definedExternally; set(value) = definedExternally
    var beforeChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var afterChange: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class Carousel : React.Component<CarouselProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface CascaderProps {
    var options: Any
    var defaultValue: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var value: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var displayRender: Function<*>? get() = definedExternally; set(value) = definedExternally
    var style: Any? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var popupClassName: String? get() = definedExternally; set(value) = definedExternally
    var popupPlacement: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowClear: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Cascader : React.Component<CascaderProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface CheckboxProps {
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external interface CheckboxGroupProps {
    var defaultValue: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var value: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var options: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class CheckboxGroup : React.Component<CheckboxGroupProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external open class Checkbox : React.Component<CheckboxProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Group: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:325:22 to 325:43) */ = definedExternally
    }
}
external interface CollapseProps {
    var activeKey: dynamic /* Array<Any> | String */ get() = definedExternally; set(value) = definedExternally
    var defaultActiveKey: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var key: String
    var header: dynamic /* React.ReactNode | String */
}
external open class CollapsePanel : `React.Component<`T$0`, Any>` {
    override fun render()(): JSX.Element = definedExternally
}
external open class Collapse : React.Component<CollapseProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Panel: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:359:22 to 359:43) */ = definedExternally
    }
}
external interface DatePickerProps<T> {
    var value: dynamic /* String | Date */ get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Date */ get() = definedExternally; set(value) = definedExternally
    var format: String? get() = definedExternally; set(value) = definedExternally
    var disabledDate: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: Any? get() = definedExternally; set(value) = definedExternally
    var popupStyle: Any? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var locale: Any? get() = definedExternally; set(value) = definedExternally
    var showTime: Boolean? get() = definedExternally; set(value) = definedExternally
    var onOk: Function<*>? get() = definedExternally; set(value) = definedExternally
    var getCalendarContainer: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external interface RangePickProps : DatePickerProps<RangePicker>
external open class RangePicker : React.Component<RangePickProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external open class MonthPicker : React.Component<RangePickProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external open class DatePicker : React.Component<DatePickerProps<Any>, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var RangePicker: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:410:28 to 410:47) */ = definedExternally
        var MonthPicker: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:411:28 to 411:47) */ = definedExternally
    }
}
external interface DropdownProps {
    var trigger: Array<String>? get() = definedExternally; set(value) = definedExternally
    var overlay: React.ReactNode
}
external interface `T$1` {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var onClick: Function<*>? get() = definedExternally; set(value) = definedExternally
    var trigger: String? get() = definedExternally; set(value) = definedExternally
    var overlay: React.ReactNode
}
external open class DropdownButton : `React.Component<`T$1`, Any>` {
    override fun render()(): JSX.Element = definedExternally
}
external open class Dropdown : React.Component<DropdownProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Button: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:449:23 to 449:45) */ = definedExternally
    }
}
external interface FormItemProps {
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var label: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var labelCol: Any? get() = definedExternally; set(value) = definedExternally
    var help: dynamic /* React.ReactNode | Boolean */ get() = definedExternally; set(value) = definedExternally
    var extra: String? get() = definedExternally; set(value) = definedExternally
    var validateStatus: String? get() = definedExternally; set(value) = definedExternally
    var hasFeedback: Boolean? get() = definedExternally; set(value) = definedExternally
    var wrapperCol: Any? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external open class FormItem : React.Component<FormItemProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface FormComponentProps {
    var form: CreateFormOptions
}
external open class FormComponent : React.Component<FormComponentProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface `T$2` {
    var valuePropName: String? get() = definedExternally; set(value) = definedExternally
    var initialValue: Any? get() = definedExternally; set(value) = definedExternally
    var trigger: String? get() = definedExternally; set(value) = definedExternally
    var validateTrigger: String? get() = definedExternally; set(value) = definedExternally
    var rules: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    fun getFieldsValue(): (fieldNames: Array<String>? /*= null*/) -> Any
    fun getFieldValue(): (fieldName: String) -> Any
    fun setFieldsValue(): (obj: Any) -> Unit
    fun setFields(): (obj: Any) -> Unit
    fun validateFields(): (fieldNames: Array<String>? /*= null*/, options: Any? /*= null*/, callback: ((erros: Any, values: Any) -> Unit)? /*= null*/) -> Any
    fun validateFieldsAndScroll(): (fieldNames: Array<String>? /*= null*/, options: Any? /*= null*/, callback: ((erros: Any, values: Any) -> Unit)? /*= null*/) -> Any
    fun getFieldError(): (name: String) -> Any
    fun isFieldValidating(): (name: String) -> Any
    fun resetFields(): (names: Array<String>? /*= null*/) -> Unit
    fun getFieldsValue(): `(id: String, options: `T$2`) -> Array<Any>`
}
external interface ComponentDecorator {
    @nativeInvoke
    operator fun <T : dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:531:21 to 531:41) */> invoke(component: T): T
}
external interface FormProps {
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var horizontal: Boolean? get() = definedExternally; set(value) = definedExternally
    var inline: Boolean? get() = definedExternally; set(value) = definedExternally
    var form: Any? get() = definedExternally; set(value) = definedExternally
    var onSubmit: ((e: React.FormEvent) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface `T$4` {
    var onFieldsChange: ((props: Any, fields: Array<Any>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var mapPropsToFields: ((props: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external open class Form : React.Component<FormProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Item: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:556:21 to 556:37) */ = definedExternally
        fun create(options: `T$4`? = definedExternally /* null */): ComponentDecorator = definedExternally
    }
}
external interface IconProps {
    var type: String
}
external open class Icon : React.Component<IconProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface InputProps {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var id: dynamic /* String | Number */
    var size: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var value: Any? get() = definedExternally; set(value) = definedExternally
    var defaultValue: Any? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var addonBefore: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var addonAfter: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
}
external open class Input : React.Component<InputProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface InputNumberProps {
    var min: Number
    var max: Number
    var value: Number? get() = definedExternally; set(value) = definedExternally
    var step: Number? get() = definedExternally; set(value) = definedExternally
    var defaultValue: Number? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
}
external open class InputNumber : React.Component<InputNumberProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface RowProps {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var align: String? get() = definedExternally; set(value) = definedExternally
    var justify: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
}
external open class Row : React.Component<RowProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface ColProps {
    var span: String? get() = definedExternally; set(value) = definedExternally
    var order: String? get() = definedExternally; set(value) = definedExternally
    var offset: String? get() = definedExternally; set(value) = definedExternally
    var push: String? get() = definedExternally; set(value) = definedExternally
    var pull: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
}
external open class Col : React.Component<ColProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface MenuItemProps {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var key: String
}
external open class MenuItem : React.Component<MenuItemProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface MenuSubMenuProps {
    var title: dynamic /* String | React.ReactNode */
    var children: Array<JSX.Element>? get() = definedExternally; set(value) = definedExternally
}
external open class MenuSubMenu : React.Component<MenuSubMenuProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface MenuItemGroupProps {
    var title: dynamic /* String | React.ReactNode */
    var children: Array<JSX.Element>? get() = definedExternally; set(value) = definedExternally
}
external open class MenuItemGroup : React.Component<MenuItemGroupProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class MenuTheme {
    light,
    dark
}
external enum class MenuMode {
    vertical,
    horizontal,
    inline
}
external interface MenuProps {
    var theme: dynamic /* MenuTheme | String */ get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* MenuMode | String */ get() = definedExternally; set(value) = definedExternally
    var selectedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var defaultSelectedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var openKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var defaultOpenKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onSelect: ((item: Any, key: String, selectedKeys: Array<String>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDeselect: ((item: Any, key: String, selectedKeys: Array<String>) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onClick: ((item: Any, key: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var style: Any? get() = definedExternally; set(value) = definedExternally
}
external open class Menu : React.Component<MenuProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Item: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:812:21 to 812:37) */ = definedExternally
        var SubMenu: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:813:24 to 813:43) */ = definedExternally
        var ItemGroup: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:814:26 to 814:47) */ = definedExternally
        var Divider: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:815:24 to 815:47) */ = definedExternally
    }
}
external interface `T$5` {
    var top: Number
}
external interface `T$6` {
    var success: (content: String, duration: Number? /*= null*/) -> Unit
    var error: (content: String, duration: Number? /*= null*/) -> Unit
    var info: (content: String, duration: Number? /*= null*/) -> Unit
    var loading: (content: String, duration: Number? /*= null*/) -> Unit
    var config: `(options: `T$5`) -> Unit`
    var destroy: () -> Unit
}
external var message: `T$6` = definedExternally
external interface `T$7` {
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var onOk: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onCancel: Function<*>? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var iconClassName: String? get() = definedExternally; set(value) = definedExternally
    var okText: String? get() = definedExternally; set(value) = definedExternally
    var cancelText: String? get() = definedExternally; set(value) = definedExternally
}
external interface ModalProps {
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var confirmLoading: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var closable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onOk: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onCancel: Function<*>? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var footer: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var okText: String? get() = definedExternally; set(value) = definedExternally
    var cancelText: String? get() = definedExternally; set(value) = definedExternally
    var maskClosable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Modal : React.Component<ModalProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var info: `(options: `T$7`) -> Unit` = definedExternally
        var success: `(options: `T$7`) -> Unit` = definedExternally
        var error: `(options: `T$7`) -> Unit` = definedExternally
        var confirm: `(options: `T$7`) -> Unit` = definedExternally
    }
}
external interface `T$8` {
    var message: dynamic /* React.ReactNode | String */
    var description: dynamic /* React.ReactNode | String */
    var btn: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var onClose: Function<*>? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$9` {
    var success: `(config: `T$8`) -> Unit`
    var error: `(config: `T$8`) -> Unit`
    var info: `(config: `T$8`) -> Unit`
    var warn: `(config: `T$8`) -> Unit`
    var close: (key: String) -> Unit
    var destroy: () -> Unit
    var config: `(options: `T$5`) -> Unit`
}
external var notification: `T$9` = definedExternally
external interface PaginationProps {
    var current: Number? get() = definedExternally; set(value) = definedExternally
    var defaultCurrent: Number? get() = definedExternally; set(value) = definedExternally
    var total: Number
    var defaultPageSize: Number? get() = definedExternally; set(value) = definedExternally
    var pageSize: Number? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var showSizeChanger: Boolean? get() = definedExternally; set(value) = definedExternally
    var pageSizeOptions: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var onShowSizeChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var showQuickJumper: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var simple: Any? get() = definedExternally; set(value) = definedExternally
    var showTotal: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class Pagination : React.Component<PaginationProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class Placement {
    top,
    left,
    right,
    bottom
}
external interface PopconfirmProps {
    var placement: dynamic /* Placement | String */ get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var onConfirm: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onCancel: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onVisibleChange: ((visible: Boolean) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var okText: String? get() = definedExternally; set(value) = definedExternally
    var cancelText: String? get() = definedExternally; set(value) = definedExternally
}
external open class Popconfirm : React.Component<PopconfirmProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class Trigger {
    hover,
    focus,
    click
}
external enum class PopoverPlacement {
    top,
    left,
    right,
    bottom,
    topLeft,
    topRight,
    bottomLeft,
    bottomRight,
    leftTop,
    leftBottom,
    rightTop,
    rightBottom
}
external interface PopoverProps {
    var trigger: dynamic /* Trigger | String */ get() = definedExternally; set(value) = definedExternally
    var placement: dynamic /* PopoverPlacement | String */ get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var overlay: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var prefixCls: String? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var onVisibleChange: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class Popover : React.Component<PopoverProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class ProgressStatus {
    normal,
    exception,
    active
}
external interface LineProps {
    var percent: Number
    var format: ((percent: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var status: dynamic /* ProgressStatus | String */ get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var showInfo: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Line : React.Component<LineProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface CircleProps {
    var percent: Number
    var format: ((percent: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var status: dynamic /* ProgressStatus | String */ get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Circle : React.Component<CircleProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface `T$10` {
    var Line: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1129:14 to 1129:26) */
    var Circle: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1130:16 to 1130:30) */
}
external var Progress: `T$10` = definedExternally
external interface QueueAnimProps {
    var type: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var animConfig: dynamic /* Any | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var delay: dynamic /* Number | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var duration: dynamic /* Number | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var interval: dynamic /* Number | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var leaveReverse: Boolean? get() = definedExternally; set(value) = definedExternally
    var ease: dynamic /* String | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var animatingClassName: Array<String>? get() = definedExternally; set(value) = definedExternally
    var component: String? get() = definedExternally; set(value) = definedExternally
}
external open class QueueAnim : React.Component<QueueAnimProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class RadioGroupSize {
    large,
    default,
    small
}
external interface RadioGroupProps {
    var onChange: ((e: Event) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var value: String? get() = definedExternally; set(value) = definedExternally
    var defaultValue: String? get() = definedExternally; set(value) = definedExternally
    var size: dynamic /* RadioGroupSize | String */ get() = definedExternally; set(value) = definedExternally
}
external open class RadioGroup : React.Component<RadioGroupProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface RadioProps {
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var value: Any? get() = definedExternally; set(value) = definedExternally
}
external open class Radio : React.Component<RadioProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Group: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1213:22 to 1213:40) */ = definedExternally
        var Button: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1214:23 to 1214:37) */ = definedExternally
    }
}
external interface SelectOptionProps {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var value: String
}
external open class SelectOption : React.Component<SelectOptionProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface SelectOptGroupProps {
    var label: dynamic /* String | React.ReactNode */
    var key: String? get() = definedExternally; set(value) = definedExternally
}
external open class SelectOptGroup : React.Component<SelectOptGroupProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface SelectProps {
    var value: dynamic /* String | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowClear: Boolean? get() = definedExternally; set(value) = definedExternally
    var filterOption: dynamic /* Boolean | Function<*> */ get() = definedExternally; set(value) = definedExternally
    var tags: Boolean? get() = definedExternally; set(value) = definedExternally
    var onSelect: ((value: Any, option: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onDeselect: ((value: Any, option: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onChange: ((value: Any, label: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onSearch: ((value: String) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var searchPlaceholder: String? get() = definedExternally; set(value) = definedExternally
    var notFoundContent: String? get() = definedExternally; set(value) = definedExternally
    var dropdownMatchSelectWidth: Boolean? get() = definedExternally; set(value) = definedExternally
    var optionFilterProp: String? get() = definedExternally; set(value) = definedExternally
    var combobox: SVGSymbolElement? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var showSearch: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var style: Any? get() = definedExternally; set(value) = definedExternally
}
external open class Select : React.Component<SelectProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Option: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1291:23 to 1291:43) */ = definedExternally
        var OptGroup: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1292:25 to 1292:47) */ = definedExternally
    }
}
external interface `T$11` {
    var key: Number
    var value: Any
}
external interface SliderProps {
    var min: Number? get() = definedExternally; set(value) = definedExternally
    var max: Number? get() = definedExternally; set(value) = definedExternally
    var step: Number? get() = definedExternally; set(value) = definedExternally
    var marks: `T$11`? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* Number | Array<Number> */ get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* Number | Array<Number> */ get() = definedExternally; set(value) = definedExternally
    var included: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowCross: Boolean? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onAfterChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var tipFormatter: dynamic /* Function<*> | Any */ get() = definedExternally; set(value) = definedExternally
    var range: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Slider : React.Component<SliderProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface SpinProps {
    var size: String? get() = definedExternally; set(value) = definedExternally
    var spining: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class Spin : React.Component<SpinProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class StepStatus {
    wait,
    process,
    finish
}
external interface StepProps {
    var status: dynamic /* StepStatus | String */ get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* String | React.ReactNode */
    var description: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
    var icon: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
}
external open class Step : React.Component<StepProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface StepsProps {
    var current: Number? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var direction: String? get() = definedExternally; set(value) = definedExternally
    var maxDescriptionWidth: Number? get() = definedExternally; set(value) = definedExternally
}
external open class Steps : React.Component<StepsProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Step: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1399:21 to 1399:33) */ = definedExternally
    }
}
external interface SwitchProps {
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var onChange: ((checked: Boolean) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var checkedChildren: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var unCheckedChildren: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
}
external open class Switch : React.Component<SwitchProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class RowSelectionType {
    checkbox,
    radio
}
external interface RowSelection {
    var type: dynamic /* RowSelectionType | String */ get() = definedExternally; set(value) = definedExternally
    var selectedRowKeys: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var onChange: ((selectedRowKeys: Array<Any>, selectedRows: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var getCheckboxProps: ((record: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onSelect: ((record: Any, selected: Any, selectedRows: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onSelectAll: ((rselectedecord: Any, selectedRows: Any, changeRows: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface Columns {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
    var dataIndex: String? get() = definedExternally; set(value) = definedExternally
    var render: ((text: Any? /*= null*/, record: Any? /*= null*/, index: Number? /*= null*/) -> React.ReactNode)? get() = definedExternally; set(value) = definedExternally
    var filters: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var onFilter: Function<*>? get() = definedExternally; set(value) = definedExternally
    var filterMultiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var sorter: dynamic /* Boolean | Function<*> */ get() = definedExternally; set(value) = definedExternally
    var colSpan: Number? get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
}
external interface TableProps {
    var rowSelection: RowSelection? get() = definedExternally; set(value) = definedExternally
    var pagination: Any? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var dataSource: Array<Any>
    var columns: Columns
    var rowKey: ((record: Any, index: Number) -> String)? get() = definedExternally; set(value) = definedExternally
    var expandedRowRender: Function<*>? get() = definedExternally; set(value) = definedExternally
    var defaultExpandedRowKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onChange: ((pagination: Any, filters: Any, sorter: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var loading: Boolean? get() = definedExternally; set(value) = definedExternally
    var locale: Any? get() = definedExternally; set(value) = definedExternally
    var indentSize: Number? get() = definedExternally; set(value) = definedExternally
    var onRowClick: ((record: Any, index: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var useFixedHeader: Boolean? get() = definedExternally; set(value) = definedExternally
    var bordered: Boolean? get() = definedExternally; set(value) = definedExternally
    var showHeader: Boolean? get() = definedExternally; set(value) = definedExternally
    var footer: ((currentPageData: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external open class Table : React.Component<TableProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TabPaneProps {
    var tab: dynamic /* React.ReactNode | String */
}
external open class TabPane : React.Component<TabPaneProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external enum class TabsType {
    line,
    card,
    editable-card
}
external enum class TabsPosition {
    top,
    right,
    bottom,
    left
}
external interface TabsProps {
    var activeKey: String? get() = definedExternally; set(value) = definedExternally
    var defaultActiveKey: String? get() = definedExternally; set(value) = definedExternally
    var onChange: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onTabClick: Function<*>? get() = definedExternally; set(value) = definedExternally
    var tabBarExtraContent: React.ReactNode? get() = definedExternally; set(value) = definedExternally
    var type: dynamic /* TabsType | String */ get() = definedExternally; set(value) = definedExternally
    var tabPosition: dynamic /* TabsPosition | String */ get() = definedExternally; set(value) = definedExternally
    var onEdit: ((targetKey: String, action: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external open class Tabs : React.Component<TabsProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var TabPane: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1575:24 to 1575:39) */ = definedExternally
    }
}
external interface TagProps {
    var closable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onClose: Function<*>? get() = definedExternally; set(value) = definedExternally
    var afterClose: Function<*>? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
}
external open class Tag : React.Component<TagProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TimePickerProps {
    var value: dynamic /* String | Date */ get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Date */ get() = definedExternally; set(value) = definedExternally
    var format: String? get() = definedExternally; set(value) = definedExternally
    var onChange: ((Date: Date) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var locale: Any? get() = definedExternally; set(value) = definedExternally
    var hideDisabledOptions: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabledHours: Function<*>? get() = definedExternally; set(value) = definedExternally
    var disabledMinutes: Function<*>? get() = definedExternally; set(value) = definedExternally
    var disabledSeconds: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class TimePicker : React.Component<TimePickerProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TimeLineItemProps {
    var color: String? get() = definedExternally; set(value) = definedExternally
}
external open class TimeLineItem : React.Component<TimeLineItemProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TimelineProps {
    var pending: dynamic /* Boolean | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
}
external open class Timeline : React.Component<TimelineProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var Item: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1674:21 to 1674:41) */ = definedExternally
    }
}
external interface TooltipProps {
    var placement: dynamic /* PopoverPlacement | String */ get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
}
external open class Tooltip : React.Component<TooltipProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TransferProps {
    var dataSource: Array<Any>
    var render: ((record: Any) -> Any)? get() = definedExternally; set(value) = definedExternally
    var targetKeys: Array<String>
    var onChange: ((targetKeys: Any, direction: String, moveKeys: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var listStyle: Any? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var titles: Array<String>? get() = definedExternally; set(value) = definedExternally
    var operations: Array<String>? get() = definedExternally; set(value) = definedExternally
    var showSearch: Boolean? get() = definedExternally; set(value) = definedExternally
    var searchPlaceholder: String? get() = definedExternally; set(value) = definedExternally
    var notFoundContent: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var footer: ((props: Any) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external open class Transfer : React.Component<TransferProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface TreeNodeProps {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var disableCheckbox: Boolean? get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* String | React.ReactNode */ get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var isLeaf: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class TreeNode : React.Component<TreeNodeProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface `T$12` {
    var checked: Boolean
    var checkedNodes: Any
    var node: Any
    var event: Event
}
external interface `T$13` {
    var selected: Boolean
    var selectedNodes: Any
    var node: Any
    var event: Event
}
external interface `T$14` {
    var event: Event
    var node: Any
}
external interface `T$15` {
    var event: Event
    var node: Any
    var expandedKeys: Any
}
external interface `T$16` {
    var event: Event
    var node: Any
    var dragNode: Any
    var dragNodesKeys: Any
}
external interface TreeProps {
    var showLine: Boolean? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var checkable: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultExpandAll: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultExpandedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var expandedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var checkedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var defaultCheckedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var selectedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var defaultSelectedKeys: Array<String>? get() = definedExternally; set(value) = definedExternally
    var onExpand: ((node: Any, expanded: Any, expandedKeys: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onCheck: (`(checkedKeys: Any, e: `T$12`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var onSelect: (`(selectedKeys: Any, e: `T$13`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var filterTreeNode: ((node: Any) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var loadData: ((node: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onRightClick: (`(options: `T$14`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var draggable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onDragStart: (`(options: `T$14`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var onDragEnter: (`(options: `T$15`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var onDragOver: (`(options: `T$14`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var onDragLeave: (`(options: `T$14`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
    var onDrop: (`(options: `T$16`) -> Unit`)? get() = definedExternally; set(value) = definedExternally
}
external open class Tree : React.Component<TreeProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var TreeNode: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1811:25 to 1811:41) */ = definedExternally
    }
}
external interface TreeSelectTreeNodeProps {
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var key: String
    var value: String? get() = definedExternally; set(value) = definedExternally
    var title: dynamic /* React.ReactNode | String */ get() = definedExternally; set(value) = definedExternally
    var isLeaf: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class TreeSelectTreeNode : React.Component<TreeSelectTreeNodeProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
external interface `T$17` {
    var value: Any
    var label: String
    var children: TreeData
}
external interface TreeSelectProps {
    var style: Any? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Array<Any> */ get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var tags: Boolean? get() = definedExternally; set(value) = definedExternally
    var onSelect: ((value: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onChange: ((value: Any, label: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var allowClear: Boolean? get() = definedExternally; set(value) = definedExternally
    var onSearch: ((value: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var searchPlaceholder: String? get() = definedExternally; set(value) = definedExternally
    var dropdownStyle: Any? get() = definedExternally; set(value) = definedExternally
    var dropdownMatchSelectWidth: Boolean? get() = definedExternally; set(value) = definedExternally
    var combobox: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: String? get() = definedExternally; set(value) = definedExternally
    var showSearch: Boolean? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var treeDefaultExpandAll: Boolean? get() = definedExternally; set(value) = definedExternally
    var treeCheckable: Boolean? get() = definedExternally; set(value) = definedExternally
    var filterTreeNode: ((treeNode: Any) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var treeNodeFilterProp: String? get() = definedExternally; set(value) = definedExternally
    var treeNodeLabelProp: String? get() = definedExternally; set(value) = definedExternally
    var treeData: Array<`T$17`>? get() = definedExternally; set(value) = definedExternally
    var loadData: ((node: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external open class TreeSelect : React.Component<TreeSelectProps, Any> {
    override fun render()(): JSX.Element = definedExternally
    companion object {
        var TreeNode: dynamic /* "TypeQuery" kind unsupported yet here! (antd.d.ts:1894:25 to 1894:51) */ = definedExternally
    }
}
external interface UploadProps {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var action: String
    var data: Any? get() = definedExternally; set(value) = definedExternally
    var headers: Any? get() = definedExternally; set(value) = definedExternally
    var showUploadList: Boolean? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var accept: String? get() = definedExternally; set(value) = definedExternally
    var beforeUpload: Function<*>? get() = definedExternally; set(value) = definedExternally
    var onChange: ((info: Any) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var listType: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
}
external open class Upload : React.Component<UploadProps, Any> {
    override fun render()(): JSX.Element = definedExternally
}
