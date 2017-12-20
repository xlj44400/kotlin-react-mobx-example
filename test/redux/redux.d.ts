export interface Action<T = any> {
    type: T;
}

/* reducers */

export type Reducer<S = any, A extends Action = Action> = (state: S | undefined, action: A) => S;

export type ReducersMapObject<S = any, A extends Action = Action> = any

export function combineReducers<S, A extends Action = Action>(reducers: ReducersMapObject<S, A>): Reducer<S, A>;

/* store */

export interface Dispatch<D = Action> {
    <A extends D>(action: A): A;
}

export interface Unsubscribe {
    (): void;
}

export interface Store<S = any, A extends Action = Action, N = never> {

    dispatch: Dispatch<A | N>;

    getState(): S;

    subscribe(listener: () => void): Unsubscribe;

    replaceReducer(nextReducer: Reducer<S, A>): void;
}

export type DeepPartial<T> = any

export interface StoreCreator {
    <S, A extends Action, N>(reducer: Reducer<S, A>, enhancer?: StoreEnhancer<N>): Store<S, A, N>;
    <S, A extends Action, N>(reducer: Reducer<S, A>, preloadedState: DeepPartial<S>, enhancer?: StoreEnhancer<N>): Store<S, A, N>;
}

export type StoreEnhancer<N = never> = (next: StoreEnhancerStoreCreator<N>) => StoreEnhancerStoreCreator<N>;
export type GenericStoreEnhancer<N = never> = StoreEnhancer<N>;
export type StoreEnhancerStoreCreator<N = never> = <S = any, A extends Action = Action>(reducer: Reducer<S, A>, preloadedState?: DeepPartial<S>) => Store<S, A, N>;

export const createStore: StoreCreator;


/* middleware */

export interface MiddlewareAPI<S = any, D = Action> {
    dispatch: Dispatch<D>;
    getState(): S;
}

export interface Middleware {
    <S = any, D = Action>(api: MiddlewareAPI<S, D>): (next: Dispatch<D>) => Dispatch<D>;
}

export function applyMiddleware(...middlewares: Middleware[]): GenericStoreEnhancer;


/* action creators */

export interface ActionCreator<A> {
    (...args: any[]): A;
}

/**
 * Object whose values are action creator functions.
 */
export interface ActionCreatorsMapObject<A = any> {
   // [key: string]: ActionCreator<A>;
}

export function bindActionCreators<A, C extends ActionCreator<A>>(actionCreator: C, dispatch: Dispatch<A>): C;

export function bindActionCreators<
    A extends ActionCreator<any>,
    B extends ActionCreator<any>
    >(actionCreator: A, dispatch: Dispatch<any>): B;

export function bindActionCreators<A, M extends ActionCreatorsMapObject<A>>(actionCreators: M, dispatch: Dispatch<A>): M;

export function bindActionCreators<
    M extends ActionCreatorsMapObject<any>,
    N extends ActionCreatorsMapObject<any>
    >(actionCreators: M, dispatch: Dispatch<any>): N;


/* compose */

type Func0<R> = () => R;
type Func1<T1, R> = (a1: T1) => R;
type Func2<T1, T2, R> = (a1: T1, a2: T2) => R;
type Func3<T1, T2, T3, R> = (a1: T1, a2: T2, a3: T3, ...args: any[]) => R;

export function compose(): <R>(a: R) => R;

export function compose<F extends Function>(f: F): F;

/* two functions */
export function compose<A, R>(
    f1: (b: A) => R, f2: Func0<A>
): Func0<R>;
export function compose<A, T1, R>(
    f1: (b: A) => R, f2: Func1<T1, A>
): Func1<T1, R>;
export function compose<A, T1, T2, R>(
    f1: (b: A) => R, f2: Func2<T1, T2, A>
): Func2<T1, T2, R>;
export function compose<A, T1, T2, T3, R>(
    f1: (b: A) => R, f2: Func3<T1, T2, T3, A>
): Func3<T1, T2, T3, R>;

/* three functions */
export function compose<A, B, R>(
    f1: (b: B) => R, f2: (a: A) => B, f3: Func0<A>
): Func0<R>;
export function compose<A, B, T1, R>(
    f1: (b: B) => R, f2: (a: A) => B, f3: Func1<T1, A>
): Func1<T1, R>;
export function compose<A, B, T1, T2, R>(
    f1: (b: B) => R, f2: (a: A) => B, f3: Func2<T1, T2, A>
): Func2<T1, T2, R>;
export function compose<A, B, T1, T2, T3, R>(
    f1: (b: B) => R, f2: (a: A) => B, f3: Func3<T1, T2, T3, A>
): Func3<T1, T2, T3, R>;

/* four functions */
export function compose<A, B, C, R>(
    f1: (b: C) => R, f2: (a: B) => C, f3: (a: A) => B, f4: Func0<A>
): Func0<R>;
export function compose<A, B, C, T1, R>(
    f1: (b: C) => R, f2: (a: B) => C, f3: (a: A) => B, f4: Func1<T1, A>
): Func1<T1, R>;
export function compose<A, B, C, T1, T2, R>(
    f1: (b: C) => R, f2: (a: B) => C, f3: (a: A) => B, f4: Func2<T1, T2, A>
): Func2<T1, T2, R>;
export function compose<A, B, C, T1, T2, T3, R>(
    f1: (b: C) => R, f2: (a: B) => C, f3: (a: A) => B, f4: Func3<T1, T2, T3, A>
): Func3<T1, T2, T3, R>;

/* rest */
export function compose<R>(
    f1: (b: any) => R, ...funcs: Function[]
): (...args: any[]) => R;

export function compose<R>(...funcs: Function[]): (...args: any[]) => R;