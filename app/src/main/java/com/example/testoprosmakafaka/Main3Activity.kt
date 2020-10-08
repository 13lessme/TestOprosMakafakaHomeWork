package com.example.testoprosmakafaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
var ex3: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val otv: Intent = intent
        var Otv2 = otv.getStringExtra("Otv2")
        var Ovt2_Last = otv.getStringExtra("Otv1_Last").toInt()
        ButNex2.setOnClickListener {
            if(Check1.isChecked || Check2.isChecked || Check3.isChecked){
                ex3 = ""
                if(Check1.isChecked){
                    ex3 += "1"
                }
                if(Check2.isChecked){
                    ex3 += "2"
                }
                if(Check3.isChecked){
                    ex3 += "3"
                }
                val otv3 = Intent(this, Main4Activity::class.java)
                otv3.putExtra("Otv3", ex3)
                otv3.putExtra("Otv3_Last", Otv2.toString())
                otv3.putExtra("Otv3_Last1", Ovt2_Last.toString())
                startActivity(otv3)
            }
        }
    }
}
