package mobx

import react.RProps
import react.RState
import react.ReactElement
import kotlin.browser.window

@JsModule("mobx-react")
@JsNonModule
external object MobxReact{
    @JsName("observer")
    fun observer(component: dynamic): dynamic

    @JsName("Provider")
    class Provider : react.React.Component<ProviderProps, RState> {
        override fun render(): ReactElement?
    }
}

@JsModule("mobx")
@JsNonModule
external object Mobx{
    @JsName("observable")
    fun observable(value: String): ObservableBox<String>
    @JsName("observable")
    fun observable(value: Int): ObservableBox<Int>
    @JsName("observable")
    fun <T> observable(value: T): ObservableBox<T>
    @JsName("observable")
    fun <A> observable(array: Array<A>): ObservableArray<A>

    @JsName("autorun")
    fun autorun(block: () -> Unit)

    @JsName("extendObservable")
    fun extendObservable(instance: Any, props: dynamic)

    @JsName("action")
    fun action(actionName:String,block: () -> Unit): () -> dynamic
}

inline fun <reified A> observable(list: List<A>): ObservableArray<A> = Mobx.observable(list.toTypedArray())

fun kaction(actionName: String,block: () -> Unit){
    window.setTimeout(Mobx.action(actionName,block), 0)
}

// https://mobxjs.github.io/mobx/refguide/boxed.html
external class ObservableBox <T> {
    fun get(): T
    fun set(newValue: T)
}

@JsName("ObservableArray")
external class ObservableArray <A> {
    // Javascript array methods

    fun push(item: A)
    val length: Int
    fun <B> map(xform: (A) -> B): Array<B>
    fun forEach(process: (A) -> Unit)

    // Mobx's array extensions

    fun remove(value: A): Boolean
}

//这个目前不知道怎么在kt里面用
external interface ProviderProps : RProps {
    var mobxStores: KStore
}

external interface KStore