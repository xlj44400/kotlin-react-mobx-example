@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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

external interface History {
    fun listenBefore(hook: TransitionHook): () -> Unit
    fun listen(listener: LocationListener): () -> Unit
    fun transitionTo(location: Location)
    fun push(path: LocationDescriptor)
    fun replace(path: LocationDescriptor)
    fun go(n: Number)
    fun goBack()
    fun goForward()
    fun createKey(): LocationKey
    fun createPath(path: LocationDescriptor): Path
    fun createHref(path: LocationDescriptor): Href
    fun createLocation(path: LocationDescriptor? = definedExternally /* null */, action: Any? /* "POP" */ = definedExternally /* null */, key: LocationKey? = definedExternally /* null */): Location
    fun createLocation(path: LocationDescriptor? = definedExternally /* null */, action: Any? /* "PUSH" */ = definedExternally /* null */, key: LocationKey? = definedExternally /* null */): Location
    fun createLocation(path: LocationDescriptor? = definedExternally /* null */, action: Any? /* "REPLACE" */ = definedExternally /* null */, key: LocationKey? = definedExternally /* null */): Location
    fun getCurrentLocation(): Location
}
external interface HistoryOptions {
    var getUserConfirmation: ((message: String, callback: (result: Boolean) -> Unit) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var keyLength: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Location {
    var pathname: Pathname
    var search: Search
    var query: Query
    var state: LocationState
    var action: dynamic /* Any /* "POP" */ | Any /* "PUSH" */ | Any /* "REPLACE" */ */
    var key: LocationKey
}
external interface LocationDescriptorObject {
    var pathname: Pathname? get() = definedExternally; set(value) = definedExternally
    var search: Search? get() = definedExternally; set(value) = definedExternally
    var query: Query? get() = definedExternally; set(value) = definedExternally
    var state: LocationState? get() = definedExternally; set(value) = definedExternally
}
