@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsQualifier("__React"), JsModule("react")]
package __React

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

external interface Attributes {
    var key: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface ClassAttributes<T> : Attributes {
    var ref: dynamic /* String | (instance: T) -> Any */ get() = definedExternally; set(value) = definedExternally
}
external interface ReactElement<P> {
    var type: dynamic /* String | ComponentClass<P> | SFC<P> */
    var props: P
    var key: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface SFCElement<P> : ReactElement<P> {
    override var type: SFC<P>
}
external interface ComponentElement<P, T : Component<P, dynamic /* Any | Unit */>> : ReactElement<P> {
    override var type: ComponentClass<P>
    var ref: dynamic /* String | (instance: T) -> Any */ get() = definedExternally; set(value) = definedExternally
}
external interface DOMElement<P : DOMAttributes, T : Element> : ReactElement<P> {
    override var type: String
    var ref: dynamic /* String | (instance: T) -> Any */
}
external interface ReactHTMLElement<T : HTMLElement> : DOMElement<HTMLAttributes, T>
external interface ReactSVGElement : DOMElement<SVGAttributes, SVGElement>
external interface Factory<P> {
    @nativeInvoke
    operator fun invoke(props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: ReactNode): ReactElement<P>
}
external interface SFCFactory<P> {
    @nativeInvoke
    operator fun invoke(props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: ReactNode): SFCElement<P>
}
external interface ComponentFactory<P, T : Component<P, dynamic /* Any | Unit */>> {
    @nativeInvoke
    operator fun invoke(props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: ReactNode): ComponentElement<P, T>
}
external interface DOMFactory<P : DOMAttributes, T : Element> {
    @nativeInvoke
    operator fun invoke(props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: ReactNode): DOMElement<P, T>
}
external interface HTMLFactory<T : HTMLElement> : DOMFactory<HTMLAttributes, T>
external interface SVGFactory : DOMFactory<SVGAttributes, SVGElement>
external fun <P, S> createClass(spec: ComponentSpec<P, S>): ClassicComponentClass<P> = definedExternally
external fun <P : DOMAttributes, T : Element> createFactory(type: String): DOMFactory<P, T> = definedExternally
external fun <P> createFactory(type: SFC<P>): SFCFactory<P> = definedExternally
external fun <P> createFactory(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>): ComponentFactory<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createFactory(type: ClassType<P, T, C>): ComponentFactory<P, T> = definedExternally
external fun <P> createFactory(type: ComponentClass<P>): Factory<P> = definedExternally
external fun <P> createFactory(type: SFC<P>): Factory<P> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: ReactElement<Any>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: String): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Number): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Any): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> createElement(type: String, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Boolean): DOMElement<P, T> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: ReactElement<Any>): SFCElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: String): SFCElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: Number): SFCElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: Any): SFCElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): SFCElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: Boolean): SFCElement<P> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: String): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: Number): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: Any): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P> createElement(type: ClassType<P, ClassicComponent<P, dynamic /* Any | Unit */>, ClassicComponentClass<P>>, props: P? /* P & ClassAttributes<ClassicComponent<P, dynamic /* Any | Unit */>> */ = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, ClassicComponent<P, dynamic /* Any | Unit */>> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: String): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Number): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Any): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): ComponentElement<P, T> = definedExternally
external fun <P, T : Component<P, dynamic /* Any | Unit */>, C : ComponentClass<P>> createElement(type: ClassType<P, T, C>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, T> = definedExternally
external fun <P> createElement(type: ComponentClass<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: dynamic /* ReactElement<Any> | String | Number | Any | Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */> | Boolean */): ReactElement<P> = definedExternally
external fun <P> createElement(type: SFC<P>, props: P? /* P & Attributes */ = definedExternally /* null */, vararg children: dynamic /* ReactElement<Any> | String | Number | Any | Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */> | Boolean */): ReactElement<P> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: ReactElement<Any>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: String): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Number): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Any): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): DOMElement<P, T> = definedExternally
external fun <P : DOMAttributes, T : Element> cloneElement(element: DOMElement<P, T>, props: P? /* P & ClassAttributes<T> */ = definedExternally /* null */, vararg children: Boolean): DOMElement<P, T> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: String): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Number): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Any): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): SFCElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: SFCElement<P>, props: Q? = definedExternally /* null */, vararg children: Boolean): SFCElement<P> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: String): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Number): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Any): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q, T : Component<P, dynamic /* Any | Unit */>> cloneElement(element: ComponentElement<P, T>, props: Q? = definedExternally /* null */, vararg children: Boolean): ComponentElement<P, T> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: ReactElement<Any>): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: String): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Number): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Any): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): ReactElement<P> = definedExternally
external fun <P : Q, Q> cloneElement(element: ReactElement<P>, props: Q? = definedExternally /* null */, vararg children: Boolean): ReactElement<P> = definedExternally
external fun <P> isValidElement(`object`: Any): Boolean = definedExternally
external var DOM: ReactDOM = definedExternally
external var PropTypes: ReactPropTypes = definedExternally
external var Children: ReactChildren = definedExternally
external var version: String = definedExternally
external interface `T$0` {
    var children: dynamic /* ReactElement<Any> | String | Number | Any | Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */> | Boolean */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): dynamic /* Component<Any, Any> | Element */
    @nativeSetter
    operator fun set(key: String, value: Component<Any, Any>)
    @nativeSetter
    operator fun set(key: String, value: Element)
}
external open class Component<P, S>(props: P? = definedExternally /* null */, context: Any? = definedExternally /* null */) : ComponentLifecycle<P, S> {
    open fun setState(f: (prevState: S, props: P) -> S, callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun setState(state: S, callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun forceUpdate(callback: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun render(): JSX.Element = definedExternally
    open var props: P /* P & `T$0` */ = definedExternally
    open var state: S = definedExternally
    open var context: Any = definedExternally
    open var refs: `T$1` = definedExternally
}
external interface ClassicComponent<P, S> : Component<P, S> {
    fun replaceState(nextState: S, callback: (() -> Any)? = definedExternally /* null */)
    fun isMounted(): Boolean
    val getInitialState: (() -> S)? get() = definedExternally
}
external interface ChildContextProvider<CC> {
    fun getChildContext(): CC
}
external interface StatelessComponent<P> {
    @nativeInvoke
    operator fun invoke(props: P? = definedExternally /* null */, context: Any? = definedExternally /* null */): ReactElement<Any>
    var propTypes: ValidationMap<P>? get() = definedExternally; set(value) = definedExternally
    var contextTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    var defaultProps: P? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
}
external interface ComponentClass<P> {
    var propTypes: ValidationMap<P>? get() = definedExternally; set(value) = definedExternally
    var contextTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    var childContextTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    var defaultProps: P? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
}
external interface ClassicComponentClass<P> : ComponentClass<P> {
    val getDefaultProps: (() -> P)? get() = definedExternally
}
external interface `T$2`<P> {
    var props: P
}
external interface ComponentLifecycle<P, S> {
    val componentWillMount: (() -> Unit)? get() = definedExternally
    val componentDidMount: (() -> Unit)? get() = definedExternally
    val componentWillReceiveProps: ((nextProps: P, nextContext: Any) -> Unit)? get() = definedExternally
    val shouldComponentUpdate: ((nextProps: P, nextState: S, nextContext: Any) -> Boolean)? get() = definedExternally
    val componentWillUpdate: ((nextProps: P, nextState: S, nextContext: Any) -> Unit)? get() = definedExternally
    val componentDidUpdate: ((prevProps: P, prevState: S, prevContext: Any) -> Unit)? get() = definedExternally
    val componentWillUnmount: (() -> Unit)? get() = definedExternally
}
external interface Mixin<P, S> : ComponentLifecycle<P, S> {
    var mixins: Mixin<P, S>? get() = definedExternally; set(value) = definedExternally
    var statics: Json? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var propTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    var contextTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    var childContextTypes: ValidationMap<Any>? get() = definedExternally; set(value) = definedExternally
    val getDefaultProps: (() -> P)? get() = definedExternally
    val getInitialState: (() -> S)? get() = definedExternally
}
external interface ComponentSpec<P, S> : Mixin<P, S> {
    fun render(): ReactElement<Any>
    @nativeGetter
    operator fun get(propertyName: String): Any?
    @nativeSetter
    operator fun set(propertyName: String, value: Any)
}
external interface SyntheticEvent {
    var bubbles: Boolean
    var cancelable: Boolean
    var currentTarget: EventTarget
    var defaultPrevented: Boolean
    var eventPhase: Number
    var isTrusted: Boolean
    var nativeEvent: Event
    fun preventDefault()
    fun stopPropagation()
    var target: EventTarget
    var timeStamp: Date
    var type: String
}
external interface ClipboardEvent : SyntheticEvent {
    var clipboardData: DataTransfer
}
external interface CompositionEvent : SyntheticEvent {
    var data: String
}
external interface DragEvent : MouseEvent {
    var dataTransfer: DataTransfer
}
external interface FocusEvent : SyntheticEvent {
    var relatedTarget: EventTarget
}
external interface FormEvent : SyntheticEvent
external interface KeyboardEvent : SyntheticEvent {
    var altKey: Boolean
    var charCode: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var key: String
    var keyCode: Number
    var locale: String
    var location: Number
    var metaKey: Boolean
    var repeat: Boolean
    var shiftKey: Boolean
    var which: Number
}
external interface MouseEvent : SyntheticEvent {
    var altKey: Boolean
    var button: Number
    var buttons: Number
    var clientX: Number
    var clientY: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean
    var pageX: Number
    var pageY: Number
    var relatedTarget: EventTarget
    var screenX: Number
    var screenY: Number
    var shiftKey: Boolean
}
external interface TouchEvent : SyntheticEvent {
    var altKey: Boolean
    var changedTouches: TouchList
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean
    var shiftKey: Boolean
    var targetTouches: TouchList
    var touches: TouchList
}
external interface UIEvent : SyntheticEvent {
    var detail: Number
    var view: AbstractView
}
external interface WheelEvent : MouseEvent {
    var deltaMode: Number
    var deltaX: Number
    var deltaY: Number
    var deltaZ: Number
}
external interface AnimationEvent : SyntheticEvent {
    var animationName: String
    var pseudoElement: String
    var elapsedTime: Number
}
external interface TransitionEvent : SyntheticEvent {
    var propertyName: String
    var pseudoElement: String
    var elapsedTime: Number
}
external interface EventHandler<E : SyntheticEvent> {
    @nativeInvoke
    operator fun invoke(event: E)
}
external interface Props<T> {
    var children: dynamic /* ReactElement<Any> | String | Number | Any | Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */> | Boolean */ get() = definedExternally; set(value) = definedExternally
    var key: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var ref: dynamic /* String | (instance: T) -> Any */ get() = definedExternally; set(value) = definedExternally
}
external interface HTMLProps<T> : HTMLAttributes, ClassAttributes<T>
external interface SVGProps : SVGAttributes, ClassAttributes<SVGElement>
external interface `T$3` {
    var __html: String
}
external interface DOMAttributes {
    var children: dynamic /* ReactElement<Any> | String | Number | Any | Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */> | Boolean */ get() = definedExternally; set(value) = definedExternally
    var dangerouslySetInnerHTML: `T$3`? get() = definedExternally; set(value) = definedExternally
    var onCopy: EventHandler<ClipboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onCut: EventHandler<ClipboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onPaste: EventHandler<ClipboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onCompositionEnd: EventHandler<CompositionEvent>? get() = definedExternally; set(value) = definedExternally
    var onCompositionStart: EventHandler<CompositionEvent>? get() = definedExternally; set(value) = definedExternally
    var onCompositionUpdate: EventHandler<CompositionEvent>? get() = definedExternally; set(value) = definedExternally
    var onFocus: EventHandler<FocusEvent>? get() = definedExternally; set(value) = definedExternally
    var onBlur: EventHandler<FocusEvent>? get() = definedExternally; set(value) = definedExternally
    var onChange: EventHandler<FormEvent>? get() = definedExternally; set(value) = definedExternally
    var onInput: EventHandler<FormEvent>? get() = definedExternally; set(value) = definedExternally
    var onSubmit: EventHandler<FormEvent>? get() = definedExternally; set(value) = definedExternally
    var onLoad: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onError: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onKeyDown: EventHandler<KeyboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onKeyPress: EventHandler<KeyboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onKeyUp: EventHandler<KeyboardEvent>? get() = definedExternally; set(value) = definedExternally
    var onAbort: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onCanPlay: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onCanPlayThrough: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onDurationChange: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onEmptied: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onEncrypted: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onEnded: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onLoadedData: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onLoadedMetadata: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onLoadStart: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onPause: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onPlay: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onPlaying: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onProgress: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onRateChange: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onSeeked: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onSeeking: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onStalled: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onSuspend: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onTimeUpdate: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onVolumeChange: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onWaiting: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onClick: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onContextMenu: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onDoubleClick: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onDrag: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragEnd: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragEnter: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragExit: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragLeave: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragOver: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDragStart: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onDrop: EventHandler<DragEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseDown: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseEnter: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseLeave: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseMove: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseOut: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseOver: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onMouseUp: EventHandler<MouseEvent>? get() = definedExternally; set(value) = definedExternally
    var onSelect: EventHandler<SyntheticEvent>? get() = definedExternally; set(value) = definedExternally
    var onTouchCancel: EventHandler<TouchEvent>? get() = definedExternally; set(value) = definedExternally
    var onTouchEnd: EventHandler<TouchEvent>? get() = definedExternally; set(value) = definedExternally
    var onTouchMove: EventHandler<TouchEvent>? get() = definedExternally; set(value) = definedExternally
    var onTouchStart: EventHandler<TouchEvent>? get() = definedExternally; set(value) = definedExternally
    var onScroll: EventHandler<UIEvent>? get() = definedExternally; set(value) = definedExternally
    var onWheel: EventHandler<WheelEvent>? get() = definedExternally; set(value) = definedExternally
    var onAnimationStart: EventHandler<AnimationEvent>? get() = definedExternally; set(value) = definedExternally
    var onAnimationEnd: EventHandler<AnimationEvent>? get() = definedExternally; set(value) = definedExternally
    var onAnimationIteration: EventHandler<AnimationEvent>? get() = definedExternally; set(value) = definedExternally
    var onTransitionEnd: EventHandler<TransitionEvent>? get() = definedExternally; set(value) = definedExternally
}
external interface CSSProperties {
    var alignContent: Any? get() = definedExternally; set(value) = definedExternally
    var alignItems: Any? get() = definedExternally; set(value) = definedExternally
    var alignSelf: Any? get() = definedExternally; set(value) = definedExternally
    var alignmentAdjust: Any? get() = definedExternally; set(value) = definedExternally
    var alignmentBaseline: Any? get() = definedExternally; set(value) = definedExternally
    var animationDelay: Any? get() = definedExternally; set(value) = definedExternally
    var animationDirection: Any? get() = definedExternally; set(value) = definedExternally
    var animationIterationCount: Any? get() = definedExternally; set(value) = definedExternally
    var animationName: Any? get() = definedExternally; set(value) = definedExternally
    var animationPlayState: Any? get() = definedExternally; set(value) = definedExternally
    var appearance: Any? get() = definedExternally; set(value) = definedExternally
    var backfaceVisibility: Any? get() = definedExternally; set(value) = definedExternally
    var background: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundAttachment: dynamic /* Any /* "scroll" */ | Any /* "fixed" */ | Any /* "local" */ */ get() = definedExternally; set(value) = definedExternally
    var backgroundBlendMode: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundComposite: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundImage: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundOrigin: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundPosition: Any? get() = definedExternally; set(value) = definedExternally
    var backgroundRepeat: Any? get() = definedExternally; set(value) = definedExternally
    var baselineShift: Any? get() = definedExternally; set(value) = definedExternally
    var behavior: Any? get() = definedExternally; set(value) = definedExternally
    var border: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottom: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottomColor: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottomLeftRadius: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottomRightRadius: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottomStyle: Any? get() = definedExternally; set(value) = definedExternally
    var borderBottomWidth: Any? get() = definedExternally; set(value) = definedExternally
    var borderCollapse: Any? get() = definedExternally; set(value) = definedExternally
    var borderColor: Any? get() = definedExternally; set(value) = definedExternally
    var borderCornerShape: Any? get() = definedExternally; set(value) = definedExternally
    var borderImageSource: Any? get() = definedExternally; set(value) = definedExternally
    var borderImageWidth: Any? get() = definedExternally; set(value) = definedExternally
    var borderLeft: Any? get() = definedExternally; set(value) = definedExternally
    var borderLeftColor: Any? get() = definedExternally; set(value) = definedExternally
    var borderLeftStyle: Any? get() = definedExternally; set(value) = definedExternally
    var borderLeftWidth: Any? get() = definedExternally; set(value) = definedExternally
    var borderRight: Any? get() = definedExternally; set(value) = definedExternally
    var borderRightColor: Any? get() = definedExternally; set(value) = definedExternally
    var borderRightStyle: Any? get() = definedExternally; set(value) = definedExternally
    var borderRightWidth: Any? get() = definedExternally; set(value) = definedExternally
    var borderSpacing: Any? get() = definedExternally; set(value) = definedExternally
    var borderStyle: Any? get() = definedExternally; set(value) = definedExternally
    var borderTop: Any? get() = definedExternally; set(value) = definedExternally
    var borderTopColor: Any? get() = definedExternally; set(value) = definedExternally
    var borderTopLeftRadius: Any? get() = definedExternally; set(value) = definedExternally
    var borderTopRightRadius: Any? get() = definedExternally; set(value) = definedExternally
    var borderTopStyle: Any? get() = definedExternally; set(value) = definedExternally
    var borderTopWidth: Any? get() = definedExternally; set(value) = definedExternally
    var borderWidth: Any? get() = definedExternally; set(value) = definedExternally
    var bottom: Any? get() = definedExternally; set(value) = definedExternally
    var boxAlign: Any? get() = definedExternally; set(value) = definedExternally
    var boxDecorationBreak: Any? get() = definedExternally; set(value) = definedExternally
    var boxDirection: Any? get() = definedExternally; set(value) = definedExternally
    var boxLineProgression: Any? get() = definedExternally; set(value) = definedExternally
    var boxLines: Any? get() = definedExternally; set(value) = definedExternally
    var boxOrdinalGroup: Any? get() = definedExternally; set(value) = definedExternally
    var boxFlex: Number? get() = definedExternally; set(value) = definedExternally
    var boxFlexGroup: Number? get() = definedExternally; set(value) = definedExternally
    var breakAfter: Any? get() = definedExternally; set(value) = definedExternally
    var breakBefore: Any? get() = definedExternally; set(value) = definedExternally
    var breakInside: Any? get() = definedExternally; set(value) = definedExternally
    var clear: Any? get() = definedExternally; set(value) = definedExternally
    var clip: Any? get() = definedExternally; set(value) = definedExternally
    var clipRule: Any? get() = definedExternally; set(value) = definedExternally
    var color: Any? get() = definedExternally; set(value) = definedExternally
    var columnCount: Number? get() = definedExternally; set(value) = definedExternally
    var columnFill: Any? get() = definedExternally; set(value) = definedExternally
    var columnGap: Any? get() = definedExternally; set(value) = definedExternally
    var columnRule: Any? get() = definedExternally; set(value) = definedExternally
    var columnRuleColor: Any? get() = definedExternally; set(value) = definedExternally
    var columnRuleWidth: Any? get() = definedExternally; set(value) = definedExternally
    var columnSpan: Any? get() = definedExternally; set(value) = definedExternally
    var columnWidth: Any? get() = definedExternally; set(value) = definedExternally
    var columns: Any? get() = definedExternally; set(value) = definedExternally
    var counterIncrement: Any? get() = definedExternally; set(value) = definedExternally
    var counterReset: Any? get() = definedExternally; set(value) = definedExternally
    var cue: Any? get() = definedExternally; set(value) = definedExternally
    var cueAfter: Any? get() = definedExternally; set(value) = definedExternally
    var cursor: Any? get() = definedExternally; set(value) = definedExternally
    var direction: Any? get() = definedExternally; set(value) = definedExternally
    var display: Any? get() = definedExternally; set(value) = definedExternally
    var fill: Any? get() = definedExternally; set(value) = definedExternally
    var fillOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var fillRule: Any? get() = definedExternally; set(value) = definedExternally
    var filter: Any? get() = definedExternally; set(value) = definedExternally
    var flex: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var flexAlign: Any? get() = definedExternally; set(value) = definedExternally
    var flexBasis: Any? get() = definedExternally; set(value) = definedExternally
    var flexDirection: Any? get() = definedExternally; set(value) = definedExternally
    var flexFlow: Any? get() = definedExternally; set(value) = definedExternally
    var flexGrow: Number? get() = definedExternally; set(value) = definedExternally
    var flexItemAlign: Any? get() = definedExternally; set(value) = definedExternally
    var flexLinePack: Any? get() = definedExternally; set(value) = definedExternally
    var flexOrder: Any? get() = definedExternally; set(value) = definedExternally
    var flexShrink: Number? get() = definedExternally; set(value) = definedExternally
    var float: Any? get() = definedExternally; set(value) = definedExternally
    var flowFrom: Any? get() = definedExternally; set(value) = definedExternally
    var font: Any? get() = definedExternally; set(value) = definedExternally
    var fontFamily: Any? get() = definedExternally; set(value) = definedExternally
    var fontKerning: Any? get() = definedExternally; set(value) = definedExternally
    var fontSize: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var fontSizeAdjust: Any? get() = definedExternally; set(value) = definedExternally
    var fontStretch: Any? get() = definedExternally; set(value) = definedExternally
    var fontStyle: Any? get() = definedExternally; set(value) = definedExternally
    var fontSynthesis: Any? get() = definedExternally; set(value) = definedExternally
    var fontVariant: Any? get() = definedExternally; set(value) = definedExternally
    var fontVariantAlternates: Any? get() = definedExternally; set(value) = definedExternally
    var fontWeight: dynamic /* Any /* "normal" */ | Any /* "bold" */ | Any /* "lighter" */ | Any /* "bolder" */ | Number */ get() = definedExternally; set(value) = definedExternally
    var gridArea: Any? get() = definedExternally; set(value) = definedExternally
    var gridColumn: Any? get() = definedExternally; set(value) = definedExternally
    var gridColumnEnd: Any? get() = definedExternally; set(value) = definedExternally
    var gridColumnStart: Any? get() = definedExternally; set(value) = definedExternally
    var gridRow: Any? get() = definedExternally; set(value) = definedExternally
    var gridRowEnd: Any? get() = definedExternally; set(value) = definedExternally
    var gridRowPosition: Any? get() = definedExternally; set(value) = definedExternally
    var gridRowSpan: Any? get() = definedExternally; set(value) = definedExternally
    var gridTemplateAreas: Any? get() = definedExternally; set(value) = definedExternally
    var gridTemplateColumns: Any? get() = definedExternally; set(value) = definedExternally
    var gridTemplateRows: Any? get() = definedExternally; set(value) = definedExternally
    var height: Any? get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitChars: Any? get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitLines: Any? get() = definedExternally; set(value) = definedExternally
    var hyphenateLimitZone: Any? get() = definedExternally; set(value) = definedExternally
    var hyphens: Any? get() = definedExternally; set(value) = definedExternally
    var imeMode: Any? get() = definedExternally; set(value) = definedExternally
    var layoutGrid: Any? get() = definedExternally; set(value) = definedExternally
    var layoutGridChar: Any? get() = definedExternally; set(value) = definedExternally
    var layoutGridLine: Any? get() = definedExternally; set(value) = definedExternally
    var layoutGridMode: Any? get() = definedExternally; set(value) = definedExternally
    var layoutGridType: Any? get() = definedExternally; set(value) = definedExternally
    var left: Any? get() = definedExternally; set(value) = definedExternally
    var letterSpacing: Any? get() = definedExternally; set(value) = definedExternally
    var lineBreak: Any? get() = definedExternally; set(value) = definedExternally
    var lineClamp: Number? get() = definedExternally; set(value) = definedExternally
    var lineHeight: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var listStyle: Any? get() = definedExternally; set(value) = definedExternally
    var listStyleImage: Any? get() = definedExternally; set(value) = definedExternally
    var listStylePosition: Any? get() = definedExternally; set(value) = definedExternally
    var listStyleType: Any? get() = definedExternally; set(value) = definedExternally
    var margin: Any? get() = definedExternally; set(value) = definedExternally
    var marginBottom: Any? get() = definedExternally; set(value) = definedExternally
    var marginLeft: Any? get() = definedExternally; set(value) = definedExternally
    var marginRight: Any? get() = definedExternally; set(value) = definedExternally
    var marginTop: Any? get() = definedExternally; set(value) = definedExternally
    var marqueeDirection: Any? get() = definedExternally; set(value) = definedExternally
    var marqueeStyle: Any? get() = definedExternally; set(value) = definedExternally
    var mask: Any? get() = definedExternally; set(value) = definedExternally
    var maskBorder: Any? get() = definedExternally; set(value) = definedExternally
    var maskBorderRepeat: Any? get() = definedExternally; set(value) = definedExternally
    var maskBorderSlice: Any? get() = definedExternally; set(value) = definedExternally
    var maskBorderSource: Any? get() = definedExternally; set(value) = definedExternally
    var maskBorderWidth: Any? get() = definedExternally; set(value) = definedExternally
    var maskClip: Any? get() = definedExternally; set(value) = definedExternally
    var maskOrigin: Any? get() = definedExternally; set(value) = definedExternally
    var maxFontSize: Any? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Any? get() = definedExternally; set(value) = definedExternally
    var maxWidth: Any? get() = definedExternally; set(value) = definedExternally
    var minHeight: Any? get() = definedExternally; set(value) = definedExternally
    var minWidth: Any? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    var order: Number? get() = definedExternally; set(value) = definedExternally
    var orphans: Number? get() = definedExternally; set(value) = definedExternally
    var outline: Any? get() = definedExternally; set(value) = definedExternally
    var outlineColor: Any? get() = definedExternally; set(value) = definedExternally
    var outlineOffset: Any? get() = definedExternally; set(value) = definedExternally
    var overflow: Any? get() = definedExternally; set(value) = definedExternally
    var overflowStyle: Any? get() = definedExternally; set(value) = definedExternally
    var overflowX: Any? get() = definedExternally; set(value) = definedExternally
    var overflowY: Any? get() = definedExternally; set(value) = definedExternally
    var padding: Any? get() = definedExternally; set(value) = definedExternally
    var paddingBottom: Any? get() = definedExternally; set(value) = definedExternally
    var paddingLeft: Any? get() = definedExternally; set(value) = definedExternally
    var paddingRight: Any? get() = definedExternally; set(value) = definedExternally
    var paddingTop: Any? get() = definedExternally; set(value) = definedExternally
    var pageBreakAfter: Any? get() = definedExternally; set(value) = definedExternally
    var pageBreakBefore: Any? get() = definedExternally; set(value) = definedExternally
    var pageBreakInside: Any? get() = definedExternally; set(value) = definedExternally
    var pause: Any? get() = definedExternally; set(value) = definedExternally
    var pauseAfter: Any? get() = definedExternally; set(value) = definedExternally
    var pauseBefore: Any? get() = definedExternally; set(value) = definedExternally
    var perspective: Any? get() = definedExternally; set(value) = definedExternally
    var perspectiveOrigin: Any? get() = definedExternally; set(value) = definedExternally
    var pointerEvents: Any? get() = definedExternally; set(value) = definedExternally
    var position: Any? get() = definedExternally; set(value) = definedExternally
    var punctuationTrim: Any? get() = definedExternally; set(value) = definedExternally
    var quotes: Any? get() = definedExternally; set(value) = definedExternally
    var regionFragment: Any? get() = definedExternally; set(value) = definedExternally
    var restAfter: Any? get() = definedExternally; set(value) = definedExternally
    var restBefore: Any? get() = definedExternally; set(value) = definedExternally
    var right: Any? get() = definedExternally; set(value) = definedExternally
    var rubyAlign: Any? get() = definedExternally; set(value) = definedExternally
    var rubyPosition: Any? get() = definedExternally; set(value) = definedExternally
    var shapeImageThreshold: Any? get() = definedExternally; set(value) = definedExternally
    var shapeInside: Any? get() = definedExternally; set(value) = definedExternally
    var shapeMargin: Any? get() = definedExternally; set(value) = definedExternally
    var shapeOutside: Any? get() = definedExternally; set(value) = definedExternally
    var speak: Any? get() = definedExternally; set(value) = definedExternally
    var speakAs: Any? get() = definedExternally; set(value) = definedExternally
    var strokeOpacity: Number? get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var tabSize: Any? get() = definedExternally; set(value) = definedExternally
    var tableLayout: Any? get() = definedExternally; set(value) = definedExternally
    var textAlign: Any? get() = definedExternally; set(value) = definedExternally
    var textAlignLast: Any? get() = definedExternally; set(value) = definedExternally
    var textDecoration: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationColor: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationLine: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationLineThrough: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationNone: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationOverline: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationSkip: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationStyle: Any? get() = definedExternally; set(value) = definedExternally
    var textDecorationUnderline: Any? get() = definedExternally; set(value) = definedExternally
    var textEmphasis: Any? get() = definedExternally; set(value) = definedExternally
    var textEmphasisColor: Any? get() = definedExternally; set(value) = definedExternally
    var textEmphasisStyle: Any? get() = definedExternally; set(value) = definedExternally
    var textHeight: Any? get() = definedExternally; set(value) = definedExternally
    var textIndent: Any? get() = definedExternally; set(value) = definedExternally
    var textJustifyTrim: Any? get() = definedExternally; set(value) = definedExternally
    var textKashidaSpace: Any? get() = definedExternally; set(value) = definedExternally
    var textLineThrough: Any? get() = definedExternally; set(value) = definedExternally
    var textLineThroughColor: Any? get() = definedExternally; set(value) = definedExternally
    var textLineThroughMode: Any? get() = definedExternally; set(value) = definedExternally
    var textLineThroughStyle: Any? get() = definedExternally; set(value) = definedExternally
    var textLineThroughWidth: Any? get() = definedExternally; set(value) = definedExternally
    var textOverflow: Any? get() = definedExternally; set(value) = definedExternally
    var textOverline: Any? get() = definedExternally; set(value) = definedExternally
    var textOverlineColor: Any? get() = definedExternally; set(value) = definedExternally
    var textOverlineMode: Any? get() = definedExternally; set(value) = definedExternally
    var textOverlineStyle: Any? get() = definedExternally; set(value) = definedExternally
    var textOverlineWidth: Any? get() = definedExternally; set(value) = definedExternally
    var textRendering: Any? get() = definedExternally; set(value) = definedExternally
    var textScript: Any? get() = definedExternally; set(value) = definedExternally
    var textShadow: Any? get() = definedExternally; set(value) = definedExternally
    var textTransform: Any? get() = definedExternally; set(value) = definedExternally
    var textUnderlinePosition: Any? get() = definedExternally; set(value) = definedExternally
    var textUnderlineStyle: Any? get() = definedExternally; set(value) = definedExternally
    var top: Any? get() = definedExternally; set(value) = definedExternally
    var touchAction: Any? get() = definedExternally; set(value) = definedExternally
    var transform: Any? get() = definedExternally; set(value) = definedExternally
    var transformOrigin: Any? get() = definedExternally; set(value) = definedExternally
    var transformOriginZ: Any? get() = definedExternally; set(value) = definedExternally
    var transformStyle: Any? get() = definedExternally; set(value) = definedExternally
    var transition: Any? get() = definedExternally; set(value) = definedExternally
    var transitionDelay: Any? get() = definedExternally; set(value) = definedExternally
    var transitionDuration: Any? get() = definedExternally; set(value) = definedExternally
    var transitionProperty: Any? get() = definedExternally; set(value) = definedExternally
    var transitionTimingFunction: Any? get() = definedExternally; set(value) = definedExternally
    var unicodeBidi: Any? get() = definedExternally; set(value) = definedExternally
    var unicodeRange: Any? get() = definedExternally; set(value) = definedExternally
    var userFocus: Any? get() = definedExternally; set(value) = definedExternally
    var userInput: Any? get() = definedExternally; set(value) = definedExternally
    var verticalAlign: Any? get() = definedExternally; set(value) = definedExternally
    var visibility: Any? get() = definedExternally; set(value) = definedExternally
    var voiceBalance: Any? get() = definedExternally; set(value) = definedExternally
    var voiceDuration: Any? get() = definedExternally; set(value) = definedExternally
    var voiceFamily: Any? get() = definedExternally; set(value) = definedExternally
    var voicePitch: Any? get() = definedExternally; set(value) = definedExternally
    var voiceRange: Any? get() = definedExternally; set(value) = definedExternally
    var voiceRate: Any? get() = definedExternally; set(value) = definedExternally
    var voiceStress: Any? get() = definedExternally; set(value) = definedExternally
    var voiceVolume: Any? get() = definedExternally; set(value) = definedExternally
    var whiteSpace: Any? get() = definedExternally; set(value) = definedExternally
    var whiteSpaceTreatment: Any? get() = definedExternally; set(value) = definedExternally
    var widows: Number? get() = definedExternally; set(value) = definedExternally
    var width: Any? get() = definedExternally; set(value) = definedExternally
    var wordBreak: Any? get() = definedExternally; set(value) = definedExternally
    var wordSpacing: Any? get() = definedExternally; set(value) = definedExternally
    var wordWrap: Any? get() = definedExternally; set(value) = definedExternally
    var wrapFlow: Any? get() = definedExternally; set(value) = definedExternally
    var wrapMargin: Any? get() = definedExternally; set(value) = definedExternally
    var wrapOption: Any? get() = definedExternally; set(value) = definedExternally
    var writingMode: Any? get() = definedExternally; set(value) = definedExternally
    var zIndex: dynamic /* Any /* "auto" */ | Number */ get() = definedExternally; set(value) = definedExternally
    var zoom: dynamic /* Any /* "auto" */ | Number */ get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(propertyName: String): Any?
    @nativeSetter
    operator fun set(propertyName: String, value: Any)
}
external interface HTMLAttributes : DOMAttributes {
    var defaultChecked: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultValue: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var accept: String? get() = definedExternally; set(value) = definedExternally
    var acceptCharset: String? get() = definedExternally; set(value) = definedExternally
    var accessKey: String? get() = definedExternally; set(value) = definedExternally
    var action: String? get() = definedExternally; set(value) = definedExternally
    var allowFullScreen: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowTransparency: Boolean? get() = definedExternally; set(value) = definedExternally
    var alt: String? get() = definedExternally; set(value) = definedExternally
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoComplete: String? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoPlay: Boolean? get() = definedExternally; set(value) = definedExternally
    var capture: Boolean? get() = definedExternally; set(value) = definedExternally
    var cellPadding: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var cellSpacing: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var charSet: String? get() = definedExternally; set(value) = definedExternally
    var challenge: String? get() = definedExternally; set(value) = definedExternally
    var checked: Boolean? get() = definedExternally; set(value) = definedExternally
    var classID: String? get() = definedExternally; set(value) = definedExternally
    var className: String? get() = definedExternally; set(value) = definedExternally
    var cols: Number? get() = definedExternally; set(value) = definedExternally
    var colSpan: Number? get() = definedExternally; set(value) = definedExternally
    var content: String? get() = definedExternally; set(value) = definedExternally
    var contentEditable: Boolean? get() = definedExternally; set(value) = definedExternally
    var contextMenu: String? get() = definedExternally; set(value) = definedExternally
    var controls: Boolean? get() = definedExternally; set(value) = definedExternally
    var coords: String? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var data: String? get() = definedExternally; set(value) = definedExternally
    var dateTime: String? get() = definedExternally; set(value) = definedExternally
    var default: Boolean? get() = definedExternally; set(value) = definedExternally
    var defer: Boolean? get() = definedExternally; set(value) = definedExternally
    var dir: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var download: Any? get() = definedExternally; set(value) = definedExternally
    var draggable: Boolean? get() = definedExternally; set(value) = definedExternally
    var encType: String? get() = definedExternally; set(value) = definedExternally
    var form: String? get() = definedExternally; set(value) = definedExternally
    var formAction: String? get() = definedExternally; set(value) = definedExternally
    var formEncType: String? get() = definedExternally; set(value) = definedExternally
    var formMethod: String? get() = definedExternally; set(value) = definedExternally
    var formNoValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var formTarget: String? get() = definedExternally; set(value) = definedExternally
    var frameBorder: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var headers: String? get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var hidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var high: Number? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var hrefLang: String? get() = definedExternally; set(value) = definedExternally
    var htmlFor: String? get() = definedExternally; set(value) = definedExternally
    var httpEquiv: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var id: String? get() = definedExternally; set(value) = definedExternally
    var inputMode: String? get() = definedExternally; set(value) = definedExternally
    var integrity: String? get() = definedExternally; set(value) = definedExternally
    var `is`: String? get() = definedExternally; set(value) = definedExternally
    var keyParams: String? get() = definedExternally; set(value) = definedExternally
    var keyType: String? get() = definedExternally; set(value) = definedExternally
    var kind: String? get() = definedExternally; set(value) = definedExternally
    var label: String? get() = definedExternally; set(value) = definedExternally
    var lang: String? get() = definedExternally; set(value) = definedExternally
    var list: String? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var low: Number? get() = definedExternally; set(value) = definedExternally
    var manifest: String? get() = definedExternally; set(value) = definedExternally
    var marginHeight: Number? get() = definedExternally; set(value) = definedExternally
    var marginWidth: Number? get() = definedExternally; set(value) = definedExternally
    var max: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var maxLength: Number? get() = definedExternally; set(value) = definedExternally
    var media: String? get() = definedExternally; set(value) = definedExternally
    var mediaGroup: String? get() = definedExternally; set(value) = definedExternally
    var method: String? get() = definedExternally; set(value) = definedExternally
    var min: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var minLength: Number? get() = definedExternally; set(value) = definedExternally
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var nonce: String? get() = definedExternally; set(value) = definedExternally
    var noValidate: Boolean? get() = definedExternally; set(value) = definedExternally
    var open: Boolean? get() = definedExternally; set(value) = definedExternally
    var optimum: Number? get() = definedExternally; set(value) = definedExternally
    var pattern: String? get() = definedExternally; set(value) = definedExternally
    var placeholder: String? get() = definedExternally; set(value) = definedExternally
    var poster: String? get() = definedExternally; set(value) = definedExternally
    var preload: String? get() = definedExternally; set(value) = definedExternally
    var radioGroup: String? get() = definedExternally; set(value) = definedExternally
    var readOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var rel: String? get() = definedExternally; set(value) = definedExternally
    var required: Boolean? get() = definedExternally; set(value) = definedExternally
    var reversed: Boolean? get() = definedExternally; set(value) = definedExternally
    var role: String? get() = definedExternally; set(value) = definedExternally
    var rows: Number? get() = definedExternally; set(value) = definedExternally
    var rowSpan: Number? get() = definedExternally; set(value) = definedExternally
    var sandbox: String? get() = definedExternally; set(value) = definedExternally
    var scope: String? get() = definedExternally; set(value) = definedExternally
    var scoped: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrolling: String? get() = definedExternally; set(value) = definedExternally
    var seamless: Boolean? get() = definedExternally; set(value) = definedExternally
    var selected: Boolean? get() = definedExternally; set(value) = definedExternally
    var shape: String? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var sizes: String? get() = definedExternally; set(value) = definedExternally
    var span: Number? get() = definedExternally; set(value) = definedExternally
    var spellCheck: Boolean? get() = definedExternally; set(value) = definedExternally
    var src: String? get() = definedExternally; set(value) = definedExternally
    var srcDoc: String? get() = definedExternally; set(value) = definedExternally
    var srcLang: String? get() = definedExternally; set(value) = definedExternally
    var srcSet: String? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var step: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var style: CSSProperties? get() = definedExternally; set(value) = definedExternally
    var summary: String? get() = definedExternally; set(value) = definedExternally
    var tabIndex: Number? get() = definedExternally; set(value) = definedExternally
    var target: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var useMap: String? get() = definedExternally; set(value) = definedExternally
    var value: dynamic /* String | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var width: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var wmode: String? get() = definedExternally; set(value) = definedExternally
    var wrap: String? get() = definedExternally; set(value) = definedExternally
    var about: String? get() = definedExternally; set(value) = definedExternally
    var datatype: String? get() = definedExternally; set(value) = definedExternally
    var inlist: Any? get() = definedExternally; set(value) = definedExternally
    var prefix: String? get() = definedExternally; set(value) = definedExternally
    var property: String? get() = definedExternally; set(value) = definedExternally
    var resource: String? get() = definedExternally; set(value) = definedExternally
    var `typeof`: String? get() = definedExternally; set(value) = definedExternally
    var vocab: String? get() = definedExternally; set(value) = definedExternally
    var autoCapitalize: String? get() = definedExternally; set(value) = definedExternally
    var autoCorrect: String? get() = definedExternally; set(value) = definedExternally
    var autoSave: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var itemProp: String? get() = definedExternally; set(value) = definedExternally
    var itemScope: Boolean? get() = definedExternally; set(value) = definedExternally
    var itemType: String? get() = definedExternally; set(value) = definedExternally
    var itemID: String? get() = definedExternally; set(value) = definedExternally
    var itemRef: String? get() = definedExternally; set(value) = definedExternally
    var results: Number? get() = definedExternally; set(value) = definedExternally
    var security: String? get() = definedExternally; set(value) = definedExternally
    var unselectable: Boolean? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface SVGAttributes : HTMLAttributes {
    var clipPath: String? get() = definedExternally; set(value) = definedExternally
    var cx: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var cy: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var d: String? get() = definedExternally; set(value) = definedExternally
    var dx: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var dy: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var fill: String? get() = definedExternally; set(value) = definedExternally
    var fillOpacity: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var fontFamily: String? get() = definedExternally; set(value) = definedExternally
    var fontSize: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var fx: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var fy: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var gradientTransform: String? get() = definedExternally; set(value) = definedExternally
    var gradientUnits: String? get() = definedExternally; set(value) = definedExternally
    var markerEnd: String? get() = definedExternally; set(value) = definedExternally
    var markerMid: String? get() = definedExternally; set(value) = definedExternally
    var markerStart: String? get() = definedExternally; set(value) = definedExternally
    var offset: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var opacity: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var patternContentUnits: String? get() = definedExternally; set(value) = definedExternally
    var patternUnits: String? get() = definedExternally; set(value) = definedExternally
    var points: String? get() = definedExternally; set(value) = definedExternally
    var preserveAspectRatio: String? get() = definedExternally; set(value) = definedExternally
    var r: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var rx: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var ry: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var spreadMethod: String? get() = definedExternally; set(value) = definedExternally
    var stopColor: String? get() = definedExternally; set(value) = definedExternally
    var stopOpacity: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var stroke: String? get() = definedExternally; set(value) = definedExternally
    var strokeDasharray: String? get() = definedExternally; set(value) = definedExternally
    var strokeLinecap: String? get() = definedExternally; set(value) = definedExternally
    var strokeMiterlimit: String? get() = definedExternally; set(value) = definedExternally
    var strokeOpacity: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var strokeWidth: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var textAnchor: String? get() = definedExternally; set(value) = definedExternally
    var transform: String? get() = definedExternally; set(value) = definedExternally
    var version: String? get() = definedExternally; set(value) = definedExternally
    var viewBox: String? get() = definedExternally; set(value) = definedExternally
    var x1: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var x2: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var x: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var xlinkActuate: String? get() = definedExternally; set(value) = definedExternally
    var xlinkArcrole: String? get() = definedExternally; set(value) = definedExternally
    var xlinkHref: String? get() = definedExternally; set(value) = definedExternally
    var xlinkRole: String? get() = definedExternally; set(value) = definedExternally
    var xlinkShow: String? get() = definedExternally; set(value) = definedExternally
    var xlinkTitle: String? get() = definedExternally; set(value) = definedExternally
    var xlinkType: String? get() = definedExternally; set(value) = definedExternally
    var xmlBase: String? get() = definedExternally; set(value) = definedExternally
    var xmlLang: String? get() = definedExternally; set(value) = definedExternally
    var xmlSpace: String? get() = definedExternally; set(value) = definedExternally
    var y1: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var y2: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
    var y: dynamic /* Number | String */ get() = definedExternally; set(value) = definedExternally
}
external interface ReactDOM {
    var a: HTMLFactory<HTMLAnchorElement>
    var abbr: HTMLFactory<HTMLElement>
    var address: HTMLFactory<HTMLElement>
    var area: HTMLFactory<HTMLAreaElement>
    var article: HTMLFactory<HTMLElement>
    var aside: HTMLFactory<HTMLElement>
    var audio: HTMLFactory<HTMLAudioElement>
    var b: HTMLFactory<HTMLElement>
    var base: HTMLFactory<HTMLBaseElement>
    var bdi: HTMLFactory<HTMLElement>
    var bdo: HTMLFactory<HTMLElement>
    var big: HTMLFactory<HTMLElement>
    var blockquote: HTMLFactory<HTMLElement>
    var body: HTMLFactory<HTMLBodyElement>
    var br: HTMLFactory<HTMLBRElement>
    var button: HTMLFactory<HTMLButtonElement>
    var canvas: HTMLFactory<HTMLCanvasElement>
    var caption: HTMLFactory<HTMLElement>
    var cite: HTMLFactory<HTMLElement>
    var code: HTMLFactory<HTMLElement>
    var col: HTMLFactory<HTMLTableColElement>
    var colgroup: HTMLFactory<HTMLTableColElement>
    var data: HTMLFactory<HTMLElement>
    var datalist: HTMLFactory<HTMLDataListElement>
    var dd: HTMLFactory<HTMLElement>
    var del: HTMLFactory<HTMLElement>
    var details: HTMLFactory<HTMLElement>
    var dfn: HTMLFactory<HTMLElement>
    var dialog: HTMLFactory<HTMLElement>
    var div: HTMLFactory<HTMLDivElement>
    var dl: HTMLFactory<HTMLDListElement>
    var dt: HTMLFactory<HTMLElement>
    var em: HTMLFactory<HTMLElement>
    var embed: HTMLFactory<HTMLEmbedElement>
    var fieldset: HTMLFactory<HTMLFieldSetElement>
    var figcaption: HTMLFactory<HTMLElement>
    var figure: HTMLFactory<HTMLElement>
    var footer: HTMLFactory<HTMLElement>
    var form: HTMLFactory<HTMLFormElement>
    var h1: HTMLFactory<HTMLHeadingElement>
    var h2: HTMLFactory<HTMLHeadingElement>
    var h3: HTMLFactory<HTMLHeadingElement>
    var h4: HTMLFactory<HTMLHeadingElement>
    var h5: HTMLFactory<HTMLHeadingElement>
    var h6: HTMLFactory<HTMLHeadingElement>
    var head: HTMLFactory<HTMLHeadElement>
    var header: HTMLFactory<HTMLElement>
    var hgroup: HTMLFactory<HTMLElement>
    var hr: HTMLFactory<HTMLHRElement>
    var html: HTMLFactory<HTMLHtmlElement>
    var i: HTMLFactory<HTMLElement>
    var iframe: HTMLFactory<HTMLIFrameElement>
    var img: HTMLFactory<HTMLImageElement>
    var input: HTMLFactory<HTMLInputElement>
    var ins: HTMLFactory<HTMLModElement>
    var kbd: HTMLFactory<HTMLElement>
    var keygen: HTMLFactory<HTMLElement>
    var label: HTMLFactory<HTMLLabelElement>
    var legend: HTMLFactory<HTMLLegendElement>
    var li: HTMLFactory<HTMLLIElement>
    var link: HTMLFactory<HTMLLinkElement>
    var main: HTMLFactory<HTMLElement>
    var map: HTMLFactory<HTMLMapElement>
    var mark: HTMLFactory<HTMLElement>
    var menu: HTMLFactory<HTMLElement>
    var menuitem: HTMLFactory<HTMLElement>
    var meta: HTMLFactory<HTMLMetaElement>
    var meter: HTMLFactory<HTMLElement>
    var nav: HTMLFactory<HTMLElement>
    var noscript: HTMLFactory<HTMLElement>
    var `object`: HTMLFactory<HTMLObjectElement>
    var ol: HTMLFactory<HTMLOListElement>
    var optgroup: HTMLFactory<HTMLOptGroupElement>
    var option: HTMLFactory<HTMLOptionElement>
    var output: HTMLFactory<HTMLElement>
    var p: HTMLFactory<HTMLParagraphElement>
    var param: HTMLFactory<HTMLParamElement>
    var picture: HTMLFactory<HTMLElement>
    var pre: HTMLFactory<HTMLPreElement>
    var progress: HTMLFactory<HTMLProgressElement>
    var q: HTMLFactory<HTMLQuoteElement>
    var rp: HTMLFactory<HTMLElement>
    var rt: HTMLFactory<HTMLElement>
    var ruby: HTMLFactory<HTMLElement>
    var s: HTMLFactory<HTMLElement>
    var samp: HTMLFactory<HTMLElement>
    var script: HTMLFactory<HTMLElement>
    var section: HTMLFactory<HTMLElement>
    var select: HTMLFactory<HTMLSelectElement>
    var small: HTMLFactory<HTMLElement>
    var source: HTMLFactory<HTMLSourceElement>
    var span: HTMLFactory<HTMLSpanElement>
    var strong: HTMLFactory<HTMLElement>
    var style: HTMLFactory<HTMLStyleElement>
    var sub: HTMLFactory<HTMLElement>
    var summary: HTMLFactory<HTMLElement>
    var sup: HTMLFactory<HTMLElement>
    var table: HTMLFactory<HTMLTableElement>
    var tbody: HTMLFactory<HTMLTableSectionElement>
    var td: HTMLFactory<HTMLTableDataCellElement>
    var textarea: HTMLFactory<HTMLTextAreaElement>
    var tfoot: HTMLFactory<HTMLTableSectionElement>
    var th: HTMLFactory<HTMLTableHeaderCellElement>
    var thead: HTMLFactory<HTMLTableSectionElement>
    var time: HTMLFactory<HTMLElement>
    var title: HTMLFactory<HTMLTitleElement>
    var tr: HTMLFactory<HTMLTableRowElement>
    var track: HTMLFactory<HTMLTrackElement>
    var u: HTMLFactory<HTMLElement>
    var ul: HTMLFactory<HTMLUListElement>
    var video: HTMLFactory<HTMLVideoElement>
    var wbr: HTMLFactory<HTMLElement>
    var svg: SVGFactory
    var circle: SVGFactory
    var defs: SVGFactory
    var ellipse: SVGFactory
    var g: SVGFactory
    var image: SVGFactory
    var line: SVGFactory
    var linearGradient: SVGFactory
    var mask: SVGFactory
    var path: SVGFactory
    var pattern: SVGFactory
    var polygon: SVGFactory
    var polyline: SVGFactory
    var radialGradient: SVGFactory
    var rect: SVGFactory
    var stop: SVGFactory
    var symbol: SVGFactory
    var text: SVGFactory
    var tspan: SVGFactory
    var use: SVGFactory
}
external interface Validator<T> {
    @nativeInvoke
    operator fun invoke(`object`: T, key: String, componentName: String): Error
}
external interface Requireable<T> : Validator<T> {
    var isRequired: Validator<T>
}
external interface ValidationMap<T> {
    @nativeGetter
    operator fun get(key: String): Validator<T>?
    @nativeSetter
    operator fun set(key: String, value: Validator<T>)
}
external interface ReactPropTypes {
    var any: Requireable<Any>
    var array: Requireable<Any>
    var bool: Requireable<Any>
    var func: Requireable<Any>
    var number: Requireable<Any>
    var `object`: Requireable<Any>
    var string: Requireable<Any>
    var node: Requireable<Any>
    var element: Requireable<Any>
    fun instanceOf(expectedClass: Any): Requireable<Any>
    fun oneOf(types: Array<Any>): Requireable<Any>
    fun oneOfType(types: Array<Validator<Any>>): Requireable<Any>
    fun arrayOf(type: Validator<Any>): Requireable<Any>
    fun objectOf(type: Validator<Any>): Requireable<Any>
    fun shape(type: ValidationMap<Any>): Requireable<Any>
}
external interface ReactChildren {
    fun <T> map(children: ReactElement<Any>, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun <T> map(children: String, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun <T> map(children: Number, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun <T> map(children: Any, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun <T> map(children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun <T> map(children: Boolean, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> T | (child: String, index: Number) -> T | (child: Number, index: Number) -> T */): Array<T>
    fun forEach(children: ReactElement<Any>, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun forEach(children: String, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun forEach(children: Number, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun forEach(children: Any, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun forEach(children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun forEach(children: Boolean, fn: dynamic /* (child: ReactElement<Any>, index: Number) -> Any | (child: String, index: Number) -> Any | (child: Number, index: Number) -> Any */)
    fun count(children: ReactElement<Any>): Number
    fun count(children: String): Number
    fun count(children: Number): Number
    fun count(children: Any): Number
    fun count(children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): Number
    fun count(children: Boolean): Number
    fun only(children: ReactElement<Any>): ReactElement<Any>
    fun only(children: String): ReactElement<Any>
    fun only(children: Number): ReactElement<Any>
    fun only(children: Any): ReactElement<Any>
    fun only(children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): ReactElement<Any>
    fun only(children: Boolean): ReactElement<Any>
    fun toArray(children: ReactElement<Any>): Array<dynamic /* ReactElement<Any> | String | Number */>
    fun toArray(children: String): Array<dynamic /* ReactElement<Any> | String | Number */>
    fun toArray(children: Number): Array<dynamic /* ReactElement<Any> | String | Number */>
    fun toArray(children: Any): Array<dynamic /* ReactElement<Any> | String | Number */>
    fun toArray(children: Array<dynamic /* ReactElement<Any> | String | Number | Array<Any> | Boolean */>): Array<dynamic /* ReactElement<Any> | String | Number */>
    fun toArray(children: Boolean): Array<dynamic /* ReactElement<Any> | String | Number */>
}
external interface AbstractView {
    var styleMedia: StyleMedia
    var document: Document
}
external interface Touch {
    var identifier: Number
    var target: EventTarget
    var screenX: Number
    var screenY: Number
    var clientX: Number
    var clientY: Number
    var pageX: Number
    var pageY: Number
}
external interface TouchList {
    @nativeGetter
    operator fun get(index: Number): Touch?
    @nativeSetter
    operator fun set(index: Number, value: Touch)
    var length: Number
    fun item(index: Number): Touch
    fun identifiedTouch(identifier: Number): Touch
}
