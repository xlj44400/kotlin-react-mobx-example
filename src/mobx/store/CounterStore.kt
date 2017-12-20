package mobx.store

import mobx.Mobx
import mobx.Observable

class CounterStore : Observable {
    // @observable properties
    var name : String = "xlj"
    var age : Int = 24
    var page : Int = 1
    var pageSize : Int = 10

    var result : Any? = null

    init {
        activate()
        Mobx.autorun {
            console.log("autorun CounterStore ${name} backgroundColor ${age}")
        }
    }
}

data class IpInfo(val ip: String,
                  val country_code:String,
                  val country_name:String,
                  val region_code:String,
                  val region_name:String,
                  val city:String,
                  val zip_code:String,
                  val time_zone:String,
                  val latitude:Float,
                  val longitude:Float,
                  val metro_code:Int
                )