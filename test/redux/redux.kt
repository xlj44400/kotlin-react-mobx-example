@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

external interface Action<T, any> {
    var type: T
}

typealias Reducer<S,A> = (state:S,action:A) -> S

external interface ReducersMapObject<S,A>

external fun <S,A> combineReducers(reducers:ReducersMapObject<S,A>) : Reducer<S, A>

external interface Dispatch<A> {
    @nativeInvoke
    operator fun <A> invoke(action: A): A
}
external interface Unsubscribe {
    @nativeInvoke
    operator fun invoke()
}
external interface Store<S,A> {
    var dispatch: Dispatch<A>
    fun getState(): S
    fun subscribe(listener: () -> Unit): Unsubscribe
    fun replaceReducer(nextReducer: (state: S?, action: A) -> S)
}

external interface DeepPartial<T>

typealias StoreEnhancer<S,A> = (next: StoreEnhancerStoreCreator<S,A>) -> StoreEnhancerStoreCreator<S,A>
typealias GenericStoreEnhancer<S,A> = StoreEnhancer<S,A>;
typealias StoreEnhancerStoreCreator<S,A> =  (reducer: Reducer<S, A>, preloadedState : DeepPartial<S>) -> Store<S, A>;

external interface StoreCreator {
    @nativeInvoke
    operator fun <S, A> invoke(reducer: (state: S?, action: A) -> S): Store<S, A>
    @nativeInvoke
    operator fun <S, A> invoke(reducer: (state: S?, action: A) -> S, enhancer: StoreEnhancer<S,A>? = definedExternally /* null */): Store<S, A>
    @nativeInvoke
    operator fun <S, A> invoke(reducer: (state: S?, action: A) -> S, preloadedState: Any, enhancer: StoreEnhancer<S,A>? = definedExternally /* null */): Store<S,A>
}

external val createStore: StoreCreator;

external interface MiddlewareAPI<S,A> {
    var dispatch: Dispatch<A>
    fun getState(): S
}
external interface Middleware {
    @nativeInvoke
    operator fun <S,A> invoke(api: MiddlewareAPI<S, A>): (next: Dispatch<A>) -> Dispatch<A>
}
external interface ActionCreator<A> {
    @nativeInvoke
    operator fun invoke(vararg args: Any): A
}
external interface ActionCreatorsMapObject<A>

typealias C<A> = ActionCreator<A>

external fun <A, C> bindActionCreators(actionCreator: C, dispatch: Dispatch<A>): C;
