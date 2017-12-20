package react.route

import react.Configurer
import react.addComponent
import react.createProps

/**
 * Created by danfma on 04/04/17.
 */

fun RouterProps.switch(configurer: Configurer<SwitchProps>) {
    addComponent(Module.SwitchClass, createProps(configurer))
}
