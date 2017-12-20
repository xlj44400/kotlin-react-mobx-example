package react

import kotlin.reflect.KClass

typealias Configurer<T> = T.() -> Unit

@JsName("createProps")
inline fun <T : ReactProps> createProps(): T {
    return js("({children:[]})").unsafeCast<T>()
}

@JsName("createPropsAndConfigure")
inline fun <T : ReactProps> createProps(configure: Configurer<T>): T {
    return createProps<T>().apply(configure)
}

@JsName("configureBy")
fun <T : ReactProps> T.configureBy(configure: Configurer<T>?): T {
    if (configure != null) {
        this.configure()
    }

    return this
}

private inline fun asReactChildren(child: Any?) =
    child.unsafeCast<ReactChildren?>()


@JsName("addChild")
fun addChild(target: ReactProps, child: Any?) {
    val children = target.children

    when (children) {
        undefined -> target.children = asReactChildren(child)
        is Array<*> -> target.children = asReactChildren(children + child)
        else -> target.children = asReactChildren(arrayOf(children, child))
    }
}

private val noChildren = arrayOf<Any?>()

private fun extractChildren(props: ReactProps): Array<Any?> {
    val children = props.children

    js("delete props.children")

    return when (children) {
        undefined -> noChildren
        is Array<*> -> children.unsafeCast<Array<Any?>>()
        else -> arrayOf(children)
    }
}

@JsName("createElement")
fun createElement(tagName: String, props: ReactProps): ReactElement? {
    return React.createElement(tagName, props, *extractChildren(props))
}

@JsName("createComponent")
fun <TProps : ReactProps> createComponent(componentType: JsClass<out react.React.Component<TProps, *>>, props: TProps): ReactElement? {
    return React.createElement(componentType, props, *extractChildren(props))
}

@JsName("root")
fun root(configure: Configurer<ReactProps>): ReactElement? {
    return createProps<ReactProps>()
        .apply(configure)
        .firstChild()
}

@JsName("firstChild")
fun ReactProps.firstChild(): ReactElement? {
    val children = children

    return when (children) {
        undefined, null -> null
        is Array<*> -> children.firstOrNull().unsafeCast<ReactElement?>()
        else -> children.unsafeCast<ReactElement?>()
    }
}

@JsName("addNode")
fun ReactProps.add(child: ReactElement?) {
    addChild(this, child)
}

@JsName("addText")
fun ReactProps.add(text: String) {
    addChild(this, text)
}

@JsName("addNumber")
fun ReactProps.add(number: Number) {
    addChild(this, number)
}

@JsName("addNodes")
fun ReactProps.add(children: Array<out ReactElement?>) {
    addChild(this, children)
}

@JsName("addChildren")
fun ReactProps.add(children: ReactChildren?) {
    addChild(this, children)
}

@JsName("addComponent")
fun <TProps : ReactProps> ReactProps.addComponent(
    componentType: JsClass<out react.React.Component<TProps, *>>,
    props: TProps = createProps(),
    configure: Configurer<TProps>? = null) {

    if (configure != null) {
        props.configure()
    }

    addChild(this, createComponent(componentType, props))
}

@JsName("addKComponent")
fun <TProps : ReactProps> ReactProps.addComponent(
    componentType: KClass<out react.React.Component<TProps, *>>,
    props: TProps = createProps(),
    configure: Configurer<TProps>? = null) {

    addComponent(componentType.js, props, configure)
}
