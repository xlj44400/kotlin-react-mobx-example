package react.route

import react.Configurer
import react.ReactProps
import react.addComponent
import react.createProps

/**
 * Created by danfma on 04/04/17.
 */

fun ReactProps.router(configurer: Configurer<RouterProps>) {
    addComponent(Module.RouterClass, createProps(configurer))
}
