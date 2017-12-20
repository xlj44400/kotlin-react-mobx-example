package react.route

import react.Configurer
import react.ReactProps
import react.addComponent
import react.createProps

*
 * Created by danfma on 24/04/17.



private inline fun ReactProps.routerLink(configurer: Configurer<LinkProps>) {
    addComponent(Module.LinkClass, createProps(configurer))
}


@JsName("linkToUrl")
fun ReactProps.routerLink(toUrl: String,
                          replace: Boolean? = null,
                          configurer: Configurer<LinkProps>) {

    routerLink {
        this.toUrl = toUrl
        this.replace = replace ?: undefined
        this.configurer()
    }
}


@JsName("linkToLocation")
fun ReactProps.routerLink(toLocation: Location,
                          replace: Boolean? = null,
                          configurer: Configurer<LinkProps>) {

    routerLink {
        this.toLocation = toLocation
        this.replace = replace ?: undefined
        this.configurer()
    }
}

