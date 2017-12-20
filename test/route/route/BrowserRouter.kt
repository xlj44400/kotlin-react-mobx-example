package react.route

import react.*

/**
 * Created by danfma on 24/04/17.
 */

fun ReactProps.browserRouter(props: BrowserRouterProps = createProps(),
                             configure: Configurer<BrowserRouterProps>? = null) {
    addComponent(Module.BrowserRouterClass, props.configureBy(configure))
}
