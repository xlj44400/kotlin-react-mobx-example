@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("JSX")
package JSX

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

external interface Element : React.ReactElement<Any>
external interface ElementClass : React.Component<Any, Any> {
    override fun render(): JSX.Element
}
external interface ElementAttributesProperty {
    var props: Any
}
external interface IntrinsicAttributes : React.Attributes
external interface IntrinsicClassAttributes<T> : React.ClassAttributes<T>
external interface IntrinsicElements {
    var a: React.HTMLProps<HTMLAnchorElement>
    var abbr: React.HTMLProps<HTMLElement>
    var address: React.HTMLProps<HTMLElement>
    var area: React.HTMLProps<HTMLAreaElement>
    var article: React.HTMLProps<HTMLElement>
    var aside: React.HTMLProps<HTMLElement>
    var audio: React.HTMLProps<HTMLAudioElement>
    var b: React.HTMLProps<HTMLElement>
    var base: React.HTMLProps<HTMLBaseElement>
    var bdi: React.HTMLProps<HTMLElement>
    var bdo: React.HTMLProps<HTMLElement>
    var big: React.HTMLProps<HTMLElement>
    var blockquote: React.HTMLProps<HTMLElement>
    var body: React.HTMLProps<HTMLBodyElement>
    var br: React.HTMLProps<HTMLBRElement>
    var button: React.HTMLProps<HTMLButtonElement>
    var canvas: React.HTMLProps<HTMLCanvasElement>
    var caption: React.HTMLProps<HTMLElement>
    var cite: React.HTMLProps<HTMLElement>
    var code: React.HTMLProps<HTMLElement>
    var col: React.HTMLProps<HTMLTableColElement>
    var colgroup: React.HTMLProps<HTMLTableColElement>
    var data: React.HTMLProps<HTMLElement>
    var datalist: React.HTMLProps<HTMLDataListElement>
    var dd: React.HTMLProps<HTMLElement>
    var del: React.HTMLProps<HTMLElement>
    var details: React.HTMLProps<HTMLElement>
    var dfn: React.HTMLProps<HTMLElement>
    var dialog: React.HTMLProps<HTMLElement>
    var div: React.HTMLProps<HTMLDivElement>
    var dl: React.HTMLProps<HTMLDListElement>
    var dt: React.HTMLProps<HTMLElement>
    var em: React.HTMLProps<HTMLElement>
    var embed: React.HTMLProps<HTMLEmbedElement>
    var fieldset: React.HTMLProps<HTMLFieldSetElement>
    var figcaption: React.HTMLProps<HTMLElement>
    var figure: React.HTMLProps<HTMLElement>
    var footer: React.HTMLProps<HTMLElement>
    var form: React.HTMLProps<HTMLFormElement>
    var h1: React.HTMLProps<HTMLHeadingElement>
    var h2: React.HTMLProps<HTMLHeadingElement>
    var h3: React.HTMLProps<HTMLHeadingElement>
    var h4: React.HTMLProps<HTMLHeadingElement>
    var h5: React.HTMLProps<HTMLHeadingElement>
    var h6: React.HTMLProps<HTMLHeadingElement>
    var head: React.HTMLProps<HTMLHeadElement>
    var header: React.HTMLProps<HTMLElement>
    var hgroup: React.HTMLProps<HTMLElement>
    var hr: React.HTMLProps<HTMLHRElement>
    var html: React.HTMLProps<HTMLHtmlElement>
    var i: React.HTMLProps<HTMLElement>
    var iframe: React.HTMLProps<HTMLIFrameElement>
    var img: React.HTMLProps<HTMLImageElement>
    var input: React.HTMLProps<HTMLInputElement>
    var ins: React.HTMLProps<HTMLModElement>
    var kbd: React.HTMLProps<HTMLElement>
    var keygen: React.HTMLProps<HTMLElement>
    var label: React.HTMLProps<HTMLLabelElement>
    var legend: React.HTMLProps<HTMLLegendElement>
    var li: React.HTMLProps<HTMLLIElement>
    var link: React.HTMLProps<HTMLLinkElement>
    var main: React.HTMLProps<HTMLElement>
    var map: React.HTMLProps<HTMLMapElement>
    var mark: React.HTMLProps<HTMLElement>
    var menu: React.HTMLProps<HTMLElement>
    var menuitem: React.HTMLProps<HTMLElement>
    var meta: React.HTMLProps<HTMLMetaElement>
    var meter: React.HTMLProps<HTMLElement>
    var nav: React.HTMLProps<HTMLElement>
    var noscript: React.HTMLProps<HTMLElement>
    var `object`: React.HTMLProps<HTMLObjectElement>
    var ol: React.HTMLProps<HTMLOListElement>
    var optgroup: React.HTMLProps<HTMLOptGroupElement>
    var option: React.HTMLProps<HTMLOptionElement>
    var output: React.HTMLProps<HTMLElement>
    var p: React.HTMLProps<HTMLParagraphElement>
    var param: React.HTMLProps<HTMLParamElement>
    var picture: React.HTMLProps<HTMLElement>
    var pre: React.HTMLProps<HTMLPreElement>
    var progress: React.HTMLProps<HTMLProgressElement>
    var q: React.HTMLProps<HTMLQuoteElement>
    var rp: React.HTMLProps<HTMLElement>
    var rt: React.HTMLProps<HTMLElement>
    var ruby: React.HTMLProps<HTMLElement>
    var s: React.HTMLProps<HTMLElement>
    var samp: React.HTMLProps<HTMLElement>
    var script: React.HTMLProps<HTMLElement>
    var section: React.HTMLProps<HTMLElement>
    var select: React.HTMLProps<HTMLSelectElement>
    var small: React.HTMLProps<HTMLElement>
    var source: React.HTMLProps<HTMLSourceElement>
    var span: React.HTMLProps<HTMLSpanElement>
    var strong: React.HTMLProps<HTMLElement>
    var style: React.HTMLProps<HTMLStyleElement>
    var sub: React.HTMLProps<HTMLElement>
    var summary: React.HTMLProps<HTMLElement>
    var sup: React.HTMLProps<HTMLElement>
    var table: React.HTMLProps<HTMLTableElement>
    var tbody: React.HTMLProps<HTMLTableSectionElement>
    var td: React.HTMLProps<HTMLTableDataCellElement>
    var textarea: React.HTMLProps<HTMLTextAreaElement>
    var tfoot: React.HTMLProps<HTMLTableSectionElement>
    var th: React.HTMLProps<HTMLTableHeaderCellElement>
    var thead: React.HTMLProps<HTMLTableSectionElement>
    var time: React.HTMLProps<HTMLElement>
    var title: React.HTMLProps<HTMLTitleElement>
    var tr: React.HTMLProps<HTMLTableRowElement>
    var track: React.HTMLProps<HTMLTrackElement>
    var u: React.HTMLProps<HTMLElement>
    var ul: React.HTMLProps<HTMLUListElement>
    var video: React.HTMLProps<HTMLVideoElement>
    var wbr: React.HTMLProps<HTMLElement>
    var svg: React.SVGProps
    var circle: React.SVGProps
    var clipPath: React.SVGProps
    var defs: React.SVGProps
    var ellipse: React.SVGProps
    var feBlend: React.SVGProps
    var feColorMatrix: React.SVGProps
    var feComponentTransfer: React.SVGProps
    var feComposite: React.SVGProps
    var feConvolveMatrix: React.SVGProps
    var feDiffuseLighting: React.SVGProps
    var feDisplacementMap: React.SVGProps
    var feFlood: React.SVGProps
    var feGaussianBlur: React.SVGProps
    var feImage: React.SVGProps
    var feMerge: React.SVGProps
    var feMergeNode: React.SVGProps
    var feMorphology: React.SVGProps
    var feOffset: React.SVGProps
    var feSpecularLighting: React.SVGProps
    var feTile: React.SVGProps
    var feTurbulence: React.SVGProps
    var filter: React.SVGProps
    var foreignObject: React.SVGProps
    var g: React.SVGProps
    var image: React.SVGProps
    var line: React.SVGProps
    var linearGradient: React.SVGProps
    var marker: React.SVGProps
    var mask: React.SVGProps
    var path: React.SVGProps
    var pattern: React.SVGProps
    var polygon: React.SVGProps
    var polyline: React.SVGProps
    var radialGradient: React.SVGProps
    var rect: React.SVGProps
    var stop: React.SVGProps
    var symbol: React.SVGProps
    var text: React.SVGProps
    var tspan: React.SVGProps
    var use: React.SVGProps
}
