package react.route

import react.RProps
import react.RState
import react.ReactElement
import react.ReactProps
import kotlin.js.*
import react.history.History
/**
 * Created by danfma on 04/04/17.
 */

typealias Callback = (allowTransition: Boolean) -> Unit


external interface RouterProps : ReactProps {
    var basename: String?
    var history: dynamic?;
    var getUserConfirmation: ((message: String, callback: Callback) -> Unit)?
}


external interface BrowserRouterProps : RouterProps {
    var forceRefresh: Boolean?
    var keyLength: Int?
}


external interface HashRouterProps : RouterProps {
    var hashType: String?
}


external interface RouteTo {
    var to: Any?
}


external interface LinkProps : RouteTo,RProps{
    var replace: Boolean?
}


external interface NavLinkProps : ReactProps {
    var activeClassName: String?
    var activeStyle: Any?
    var exact: Boolean?
    var strict: Boolean?
    var isActive: ((Match?, Location) -> Boolean)?
}

data class Location(
        val pathname: String,
        var search: String? = null,
        var hash: String? = null,
        var state: Any? = null
)

external interface PromptProps : ReactProps {
    var message: Any?

    @JsName("when")
    var matched: Boolean?
}


external interface RedirectProps : ReactProps, RouteTo {
    var push: Boolean?
    var from: String?
    override var to: Any?
}


external interface Routeable : ReactProps {
    var match: Match
    var location: Location
    var history: History
}


external interface RouteProps : ReactProps {
    var component: react.React.Component<Routeable, *>?
    var render: (Routeable) -> ReactElement?
    var path: String?
    var exact: Boolean?
    var strict: Boolean?
}


external interface SwitchProps : ReactProps


external interface Match {
    var params: Json
}


@JsModule("react-router-dom")
@JsNonModule
external object Module {

    @JsName("Router")
    val RouterClass: JsClass<Router>

    @JsName("BrowserRouter")
    val BrowserRouterClass: JsClass<BrowserRouter>

    @JsName("HashRouter")
    val HashRouterClass: JsClass<HashRouter>

    @JsName("Prompt")
    val PromptClass: JsClass<Prompt>

    @JsName("Redirect")
    val RedirectClass: JsClass<Redirect>

    @JsName("Route")
    val RouteClass: JsClass<Route>

    @JsName("Link")
    val LinkClass: JsClass<Link>

    @JsName("Switch")
    val SwitchClass: JsClass<Switch>


    @JsName("Router")
    class Router : react.React.Component<RouterProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("BrowserRouter")
    class BrowserRouter : react.React.Component<BrowserRouterProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("HashRouter")
    class HashRouter : react.React.Component<HashRouterProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("Prompt")
    class Prompt : react.React.Component<PromptProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("Redirect")
    class Redirect : react.React.Component<RedirectProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("Route")
    class Route : react.React.Component<RouteProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("Link")
    class Link : react.React.Component<LinkProps, RState> {
        override fun render(): ReactElement?
    }

    @JsName("Switch")
    class Switch : react.React.Component<SwitchProps, RState> {
        override fun render(): ReactElement?
    }

}
