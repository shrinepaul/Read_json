package com.example.myapplication

import android.app.Activity
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.Message
import android.os.PersistableBundle
import android.provider.Settings
import android.renderscript.Int3
import android.util.IntProperty
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.View.X
import android.view.View.generateViewId
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.jar.Attributes
import kotlin.math.log
import kotlin.math.max
//import org.w3c.dom.events.MutationEvent.ADDITION



class MainActivity : AppCompatActivity() {


    var addition: Boolean = false
    var subtraction: Boolean = false
    var multiplication: Boolean = false
    var division: Boolean = false
    //val CURRENT_ACTION: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = findViewById<TextView>(R.id.text)
        val text2 = findViewById<TextView>(R.id.text)
        val text3 = findViewById<TextView>(R.id.text3)
        val text4 = findViewById<TextView>(R.id.text4)
        val btndelete = findViewById<ImageButton>(R.id.btn_del)
        val btnAllclear = findViewById<Button>(R.id.btn_AC)
        val btnadd = findViewById<Button>(R.id.btn_add)
        val btnsub = findViewById<Button>(R.id.btn_sub)
        val btndiv = findViewById<Button>(R.id.btn_div)
        val btnmul = findViewById<Button>(R.id.btn_multiplication)
        val btn7 = findViewById<Button>(R.id.btn_7)
        val btn8 = findViewById<Button>(R.id.btn_8)
        val btn9 = findViewById<Button>(R.id.btn_9)
        val btn4 = findViewById<Button>(R.id.btn_4)
        val btn5 = findViewById<Button>(R.id.btn_5)
        val btn6 = findViewById<Button>(R.id.btn_6)
        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)
        val btn0 = findViewById<Button>(R.id.btn_0)
        val btnpoint = findViewById<Button>(R.id.btn_point)
        val btnequal = findViewById<Button>(R.id.btn_equal)
        val btnswap = findViewById<ImageButton>(R.id.btn_swap)

//Button-function
        val btnswap_click_me = findViewById(R.id.btn_swap) as ImageButton
        btnswap_click_me.setOnClickListener {
            val intent = Intent(this, ScintificActivity::class.java)
            startActivity(intent)
            finish()
        }


        val btn7_click_me = findViewById(R.id.btn_7) as Button
// set on-click listener

        btn7_click_me.setOnClickListener(View.OnClickListener() {
            //val btn7 = toString().toInt()

            var a = 7
            text1.text = text1.text.toString() + "$a"
        })

        val btn8_click_me = findViewById(R.id.btn_8) as Button
// set on-click listener
        btn8_click_me.setOnClickListener {

            var a = 8
            text1.text = text1.text.toString() + "$a"
        }

        val btn9_click_me = findViewById(R.id.btn_9) as Button
// set on-click listener
        btn9_click_me.setOnClickListener {

            var a = 9
            text1.text = text1.text.toString() + "$a"
        }

        val btn0_click_me = findViewById(R.id.btn_0) as Button
// set on-click listener
        btn0_click_me.setOnClickListener {
            var a = 0
            text1.text = text1.text.toString() + "$a"
        }

        val btn4_click_me = findViewById(R.id.btn_4) as Button
// set on-click listener
        btn4_click_me.setOnClickListener {
            var a = 4
            text1.text = text1.text.toString() + "$a"
        }

        val btn5_click_me = findViewById(R.id.btn_5) as Button
// set on-click listener
        btn5_click_me.setOnClickListener {
            var a = 5
            text1.text = text1.text.toString() + "$a"
        }

        val btn6_click_me = findViewById(R.id.btn_6) as Button
// set on-click listener
        btn6_click_me.setOnClickListener {
            var a = 6
            text1.text = text1.text.toString() + "$a"
        }

        val btn1_click_me = findViewById(R.id.btn_1) as Button
// set on-click listener
        btn1_click_me.setOnClickListener {
            var a = 1
            text1.text = text1.text.toString() + "$a"
        }

        val btn2_click_me = findViewById(R.id.btn_2) as Button
// set on-click listener
        /*var n = 2*/


        btn2_click_me.setOnClickListener {
            var a = 2
            text1.text = text1.text.toString() + "$a"
        }

        val btn3_click_me = findViewById(R.id.btn_3) as Button
// set on-click listener


        btn3_click_me.setOnClickListener {
            var a = 3
            text1.text = text1.text.toString() + "$a"
        }

        val btnpoint_click_me = findViewById(R.id.btn_point) as Button
// set on-click listener
        btnpoint_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "."
        }



        btn_AC.setOnClickListener(View.OnClickListener { text3.text = ("")
        text2.text = ("")
        text1.text = ("")
        text4.text = ("")})






        //operation------------------------

        val btnadd_click_me = findViewById(R.id.btn_add) as Button
// set on-click listener
        var first_value = 0

        btnadd_click_me.setOnClickListener {

            first_value = text1.text.toString().toInt()

            addition = true
            text1.text = null
            text4.text = "$first_value" + "+"
        }
        val btnsub_click_me = findViewById(R.id.btn_sub) as Button
        //set on-click listener
        btnsub_click_me.setOnClickListener {
            first_value = text1.text.toString().toInt()
            subtraction = true
            text1.text = null
            text4.text = "-"
        }
        val btnmul_click_me = findViewById(R.id.btn_multiplication) as Button
        //set on-click listener
        btnmul_click_me.setOnClickListener {
            first_value = text1.text.toString().toInt()
            multiplication = true
            text1.text = null
            text1.text = "*"

        }
        val btndiv_click_me = findViewById(R.id.btn_div) as Button
        //set on-click listener
        btndiv_click_me.setOnClickListener {
            first_value = text1.text.toString().toInt()
            division = true
            text1.text = null
            text1.text = "/"
        }
        val btndelete_click_me = findViewById(R.id.btn_del) as ImageButton
        //set on-click listener
        btndelete_click_me.setOnClickListener {

            val string = text1.text.toString()
            if (string.isNotEmpty()) {
                text1.text = string.substring(0, string.length - 1)
                text2.text = string.substring(0,string.length - 1)
                text3.text = string.substring(0,string.length - 1)
                text4.text = string.substring(0,string.length - 1)
            }
            text1.text = ""
            text2.text = ""
            text3.text = ""
            text4.text = ""
        }

        //---------------------------------------------------
        val CURRENT_ACTION = true
       // val result = toString().toInt()
        btnequal.setOnClickListener {
            val second_value: Int = text2.text.toString().toInt()
            val d = second_value.toInt()
            val c = first_value.toInt()
            var result = 0
            if (addition == true) {
               // val d = b.toInt()
               // val c = a.toInt()
                 result = c + d

                text3.text = "=" + result.toString()



                addition = false
            }
 //val result= toString().toInt()

    //val result  = true
            val current_value: Int = text3.text.toString().toInt()
            val k = current_value.toInt()

            val e = result + k
            if (CURRENT_ACTION == addition) {

                 result = k + e
               text3.text = result.toString()
                addition = false

            }

             // val c = a.toInt()
              //  val d = b.toInt()
            if (subtraction == true) {
               // val c = a.toInt()
               // val d = b.toInt()
                val e = c - d
                text3.text = "=" + e.toString()

            }
              val CURRENT_ACTION = true
                 if (CURRENT_ACTION == subtraction) {
                    val e = c - d
                    text3.text = e.toString()
                    subtraction = false
                }
                if (multiplication == true) {
                   // val c = a.toInt()
                   // val d = b.toInt()
                    val e = c * d
                    text1.text = e.toString()
                    multiplication = false

                }
            if (CURRENT_ACTION == multiplication) {
                val e = c * d
                text3.text = e.toString()
                multiplication = false

            }
                if (division == true) {
                    //val c = a.toInt()
                    //val d = b.toInt()
                    val e = c / d
                    text1.text = e.toString()
                    division = false
                }
            if (CURRENT_ACTION == division) {
                val e = c / d
                text3.text = e.toString()
                division = false

            }

            }
        }
    }

