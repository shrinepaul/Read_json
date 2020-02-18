package com.example.read_json

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.nio.charset.Charset


class MainActivity : AppCompatActivity() {
    val TAG = "MyActivity"
    private val JSON_STRING : String =
        ("{\"subassemblies\":{\"attr1\":\"one value\" ,\"attr2\":\"two value\","
                + "\"componentAnalyzer1\": { \"sub1\":[ {\"sub1_attr\":\"sub1_attr_value\" },{\"sub1_attr\":\"sub2_attr_value\"," + "\"collectors\","
                    + "\"bp1\" }]}}}")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        read_json()
    }

    fun read_json() {
        var json = ""
        resources.openRawResource(R.raw.demo).bufferedReader().use {
            json = it.readText()
        }
        Log.e("json", json)

        // data holding lists
        val bpList = mutableListOf<BpData>()
        val acList = mutableListOf<AcData>()
        val mgList = mutableListOf<MgData>()
        val atList = mutableListOf<AtData>()
        val irList = mutableListOf<Irdata>()
        val hyList = mutableListOf<Hydata>()
        val gyList = mutableListOf<GyData>()
        val machineidList = mutableListOf<Machineid>()

        try {
// get JSONObject from JSON file
            val obj = JSONObject(json)
// fetch JSONObject name
            val subassemblies: JSONObject = obj.getJSONObject("subassemblies")
            val componentAnalyzer1: JSONObject = subassemblies.getJSONObject("componentAnalyzer1")
            val collectors: JSONObject = componentAnalyzer1.getJSONObject("collectors")
            val bp1: JSONObject = collectors.getJSONObject("bp1")
            var csvArray = bp1.getJSONArray("CSV")
            for (i in 0 until csvArray.length()) {
                val bpArray = csvArray.getJSONArray(i)
                Log.e("timestamp", bpArray.getString(0))
                Log.e("value", bpArray.getString(1))

                bpList.add(BpData(
                    timestamp = bpArray.getString(0),
                    data = bpArray.getString(1)
                ))
            }

                val ac1 = collectors.getJSONObject("ac1")
                csvArray = ac1.getJSONArray("CSV")
                for (i in 0 until csvArray.length()) {
                    val acArray = csvArray.getJSONArray(i)
                    for (j in 0 until acArray.length()) {
                        val exampleArray = acArray[j]
                        Log.e("timestamp", acArray.getString(0))
                        Log.e("value", acArray.getString(1))
                        Log.e("value", acArray.getString(2))
                        Log.e("value", acArray.getString(3))

                        acList.add(
                            AcData(
                            timestamp = acArray.getString(0),
                                data1 = acArray.getString(1),
                                data2 = acArray.getString(2),
                                data3 = acArray.getString(3)

                        ))

                    }
                }
                        val mg1 = collectors.getJSONObject("mg1")
                        csvArray = mg1.getJSONArray("CSV")
                        for (i in 0 until csvArray.length()) {
                            val mgArray = csvArray.getJSONArray(i)
                            for (j in 0 until mgArray.length()) {
                                val exampleArray = mgArray[j]
                                Log.e("timestamp", mgArray.getString(0))
                                Log.e("value", mgArray.getString(1))
                                Log.e("value", mgArray.getString(2))
                                Log.e("value", mgArray.getString(3))

                                mgList.add(
                                    MgData(
                                        timestamp = mgArray.getString(0),
                                        data1 = mgArray.getString(1),
                                        data2 = mgArray.getString(2),
                                        data3 = mgArray.getString(3)
                                    )
                                )

                            }
                        }

                                /* val at1 = collectors.getJSONObject("at1")
                                 csvArray = at1.getJSONArray("CSV")
                                for (i in 0 until csvArray.length()){
                                    val atArray = csvArray.getJSONArray(i)
                                    Log.e("timestamp", atArray.getString(0))
                                    Log.e("value", atArray.getString(1))

                                    atList.add(
                                    AtData(
                                            timestamp = atArray.getString(0),
                                            data = atArray.getString(1)
                                         )
                                       )
                                     }



                                    */

                                val ir1 = collectors.getJSONObject("ir1")
                                csvArray = ir1.getJSONArray("CSV")
                                for (i in 0 until csvArray.length()) {
                                    val irArray = csvArray.getJSONArray(i)
                                    for (j in 0 until irArray.length()) {
                                        val exampleArray = irArray[j]
                                        Log.e("timestamp", irArray.getString(0))
                                        Log.e("value", irArray.getString(1))
                                        Log.e("value", irArray.getString(2))

                                        irList.add(
                                            Irdata(
                                                timestamp = irArray.getString(0),
                                                data1 = irArray.getString(1),
                                                data2 = irArray.getString(2)

                                            )
                                        )

                                    }
                                }

                                        val hy1 = collectors.getJSONObject("hy1")
                                        csvArray = hy1.getJSONArray("CSV")
                                        for (i in 0 until csvArray.length()) {
                                            val hyArray = csvArray.getJSONArray(i)
                                            for (j in 0 until hyArray.length()) {
                                                val exampleArray = hyArray[j]
                                                Log.e("timestamp", hyArray.getString(0))
                                                Log.e("value", hyArray.getString(1))


                                                hyList.add(
                                                    Hydata(
                                                        timestamp = hyArray.getString(0),
                                                        data1 = hyArray.getString(1)
                                                    )
                                                )

                                            }
                                        }

                                                val gy1 = collectors.getJSONObject("gy1")
                                                csvArray = gy1.getJSONArray("CSV")
                                                for (i in 0 until csvArray.length()) {
                                                    val gyArray = csvArray.getJSONArray(i)
                                                    for (j in 0 until gyArray.length()) {
                                                        val exampleArray = gyArray[j]
                                                        Log.e("timestamp", gyArray.getString(0))
                                                        Log.e("value", gyArray.getString(1))
                                                        Log.e("value", gyArray.getString(2))
                                                        Log.e("value", gyArray.getString(3))

                                                        gyList.add(
                                                            GyData(
                                                                timestamp = gyArray.getString(0),
                                                                data1 = gyArray.getString(1),
                                                                data2 = gyArray.getString(2),
                                                                data3 = gyArray.getString(3)
                                                            )
                                                        )

                                                    }
                                                }



                                 val header: JSONObject = obj.getJSONObject("header")
                                 val machineId  = header.getString("machineId")
                                 val machineName = header.getString("machineName")
                                 Log.e("machineId" , "machineId" +machineId)
                                 Log.e("machineName" , "machineName" +machineName)

                                   /* machineidList.add(
                                        Machineid(
                                            data = header.getString("machineId")
                                        )
                                    )*/

                                }catch (e: JSONException) {
                                                            Log.d(TAG, "Error : ${e.message}")
                                                            e.printStackTrace()
                                }
                        }

                }





