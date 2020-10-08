package com.example.testoprosmakafaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
var ex2: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val otv: Intent = intent
        var Otv1 = otv.getStringExtra("Otv1").toInt()
        ButNex1.setOnClickListener {
            if(Check1.isChecked || Check2.isChecked || Check3.isChecked){
                ex2 = ""
                if (Check1.isChecked){
                    ex2 += "1"
                }
                if (Check2.isChecked){
                    ex2 += "2"
                }
                if (Check3.isChecked){
                    ex2 += "3"
                }
                val otv2 = Intent(this, Main3Activity::class.java)
                otv2.putExtra("Otv2", ex2)
                otv2.putExtra("Otv2_Last", Otv1.toString())
                startActivity(otv2)
            }
        }
    }
}
