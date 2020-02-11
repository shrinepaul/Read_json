package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sin

class ScintificActivity : AppCompatActivity() {
    var addition: Boolean = false
    var subtraction: Boolean = false
    var multiplication: Boolean = false
    var division: Boolean = false
    var sin: Boolean = false
    var cos: Boolean = false
    var tan: Boolean = false
    var pi: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scintific)

        val text1 = findViewById<TextView>(R.id.text)
        val text2 = findViewById<TextView>(R.id.text)
        val btnadd = findViewById<Button>(R.id.btn_add)
        val btnsub = findViewById<Button>(R.id.btn_sub)
        val btndiv = findViewById<Button>(R.id.btn_div)
        val btnmul = findViewById<Button>(R.id.btn_multiplication)
        val btnroot = findViewById<Button>(R.id.btn_root)
        val btnsin = findViewById<Button>(R.id.btn_sin)
        val btncos = findViewById<Button>(R.id.btn_cos)
        val btntan = findViewById<Button>(R.id.btn_tan)
        val btnlog = findViewById<Button>(R.id.btn_log)
        val btnparentheses1 = findViewById<Button>(R.id.btn_parentheses1)
        val btncloseparentheses = findViewById<Button>(R.id.btn_closeparentheses)
        val btndeg = findViewById<Button>(R.id.btn_deg)
        val btnin = findViewById<Button>(R.id.btn_in)
        val btnpi = findViewById<Button>(R.id.btn_pi)
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
        val btnAC = findViewById<Button>(R.id.btn_AC)

        //Button-function


        val btnswap_click_me = findViewById(R.id.btn_swap)as ImageButton
        btnswap_click_me.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_AC.setOnClickListener(View.OnClickListener { text1.text = ("") })

        val btn7_click_me = findViewById(R.id.btn_7) as Button
// set on-click listener

        btn7_click_me.setOnClickListener(View.OnClickListener() {
            //val btn7 = toString().toInt()
            text1.text = text1.text.toString() + "7"
        })

        val btn8_click_me = findViewById(R.id.btn_8) as Button
// set on-click listener
        btn8_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "8"
        }

        val btn9_click_me = findViewById(R.id.btn_9) as Button
// set on-click listener
        btn9_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "9"
        }

        val btn0_click_me = findViewById(R.id.btn_0) as Button
// set on-click listener
        btn0_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "0"
        }

        val btn4_click_me = findViewById(R.id.btn_4) as Button
// set on-click listener
        btn4_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "4"
        }

        val btn5_click_me = findViewById(R.id.btn_5) as Button
// set on-click listener
        btn5_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "5"
        }

        val btn6_click_me = findViewById(R.id.btn_6) as Button
// set on-click listener
        btn6_click_me.setOnClickListener {

            text1.text = text1.text.toString() + "6"
        }

        val btn1_click_me = findViewById(R.id.btn_1) as Button
// set on-click listener
        btn1_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "1"
        }

        val btn2_click_me = findViewById(R.id.btn_2) as Button
// set on-click listener
        btn2_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "2"
        }

        val btn3_click_me = findViewById(R.id.btn_3) as Button
// set on-click listener
        btn3_click_me.setOnClickListener {

            text1.text = text1.text.toString() + "3"
        }

        val btnpoint_click_me = findViewById(R.id.btn_point) as Button
// set on-click listener
        btnpoint_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "."
        }

        val btnsin_click_me = findViewById(R.id.btn_sin) as Button
// set on-click listener
        btnsin_click_me.setOnClickListener {
            val sin = text1.text.toString().toFloat()
            val result = sin(sin)

            text1.text = result.toString()

        }

        val btntan_click_me = findViewById(R.id.btn_tan) as Button
// set on-click listener
        btntan_click_me.setOnClickListener {
            val tan= text1.text.toString().toFloat()
            val result = kotlin.math.tan(tan)
            text1.text = result.toString()

        }
        val btnpi_click_me = findViewById(R.id.btn_pi) as Button
// set on-click listener
        btnpi_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "π"
        }

        val btncos_click_me = findViewById(R.id.btn_cos) as Button
// set on-click listener
        btncos_click_me.setOnClickListener {
            val cos = text1.text.toString().toFloat()
            val result = kotlin.math.cos(cos)
            text1.text = result.toString()
        }

        val btndeg_click_me = findViewById(R.id.btn_deg) as Button
// set on-click listener
        btndeg_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "deg"
        }

        val btnin_click_me = findViewById(R.id.btn_in) as Button
// set on-click listener
        btnin_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "in"
        }

        val btnparentheses1_click_me = findViewById(R.id.btn_parentheses1) as Button
// set on-click listener
        btnparentheses1_click_me.setOnClickListener {
            text1.text = text1.text.toString() + "("
        }

        val btncloseparentheses_click_me = findViewById(R.id.btn_closeparentheses) as Button
// set on-click listener
        btncloseparentheses_click_me.setOnClickListener {
            text1.text = text1.text.toString() + ")"
        }
        val btnroot_click_me = findViewById(R.id.btn_root) as Button
        btnroot_click_me.setOnClickListener{
            text1.text = text1.text.toString() + "√"
        }
        /*val btnlog_click_me = findViewById(R.id.btn_log) as Button
        btnlog_click_me.setOnClickListener{ 
            val log = text1.text.toString().toFloat()
            val result = kotlin.math.log10(log)
            text1.text = result.toString()
            //text1.text = text1.text.toString() + "lg("
        }*/
        val btnlog_click_me = findViewById(R.id.btn_log) as Button
        btnlog_click_me.setOnClickListener{
            text1.text = text1.text.toString() + "lg("
        }


        //operation
        val btnadd_click_me = findViewById(R.id.btn_add) as Button
// set on-click listener
        var a = 0

        btnadd_click_me.setOnClickListener {

            a  =text1.text.toString().toInt()

            addition = true
            text1.text=null


        }
        val btnsub_click_me = findViewById(R.id.btn_sub) as Button
        //set on-click listener

        btnsub_click_me.setOnClickListener {
            a = text1.text.toString().toInt()
            subtraction = true
            text1.text=null
            //text1.text ="-"

        }
        val btnmul_click_me = findViewById(R.id.btn_multiplication) as Button
        //set on-click listener
        btnmul_click_me.setOnClickListener {
            a = text1.text.toString().toInt()
            multiplication = true

            text1.text = null

        }
        val btndiv_click_me = findViewById(R.id.btn_div) as Button
        //set on-click listener
        btndiv_click_me.setOnClickListener {
            division = true
            text1.text = null
        }


        //---------------------------------------------------

        val CURRENT_ACTION = true
        btnequal.setOnClickListener{

            val b: Int = text2.text.toString().toInt()

            if ( addition == true){

                val c =  a.toInt()
                val d = b.toInt()
                val e = c + d
                text.text = e.toString()
                addition = false
            }
            if (subtraction == true ) {
                val c = a.toInt()
                val d = b.toInt()

                val e = c - d
                text.text = e.toString()
                subtraction = false

            }
            if (multiplication == true){
                val c = a.toInt()
                val d = b.toInt()
                val e = c * d
                text1.text = e.toString()
                multiplication = false
            }

            if (division == true){
                val c = a.toInt()
                val d = b.toInt()
                val e = c / d
                text1.text = e.toString()
                division = false
            }
        }

    }
}