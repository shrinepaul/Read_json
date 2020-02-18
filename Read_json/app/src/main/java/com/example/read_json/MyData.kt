package com.example.read_json


data  class BpData(val timestamp: String, val data: String)

data class AcData(val timestamp: String, val data1:String, val data2: String, val data3: String)

data class MgData(val timestamp: String, val data1: String, val data2: String, val data3: String)

data class AtData(val timestamp: String, val data: String)

data class Irdata(val timestamp: String, val data1: String, val data2: String)


data class Hydata(val timestamp: String, val data1: String)


data class GyData(val timestamp: String, val data1: String, val data2: String, val data3: String)

data class Machineid(val data: String)





















   /* var bp1timestamp:String ="2020-02-03T06:22:46.196Z"
    var bp1data :String  = "1016.849976"
}
data class ac1(val timestamp: Timestamp, val data: Double){
    var ac1timestamp:String="2020-02-03T06:22:45.318Z"
    var ac1data1:String = "-0.081787"
    var ac1data2:String = "0.005127"
    var ac1data3:String = "1.017334"
}*/