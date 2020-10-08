package com.example.testoprosmakafaka

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var x = 0
        val otv: Intent = intent
        val Otv3 = otv.getStringExtra("Otv3").toInt()
        val Otv3_Last = otv.getStringExtra("Otv3_Last").toInt()
        val Otv3_Last1 = otv.getStringExtra("Otv3_Last").toInt()
        text3.append(Otv3_Last1.toString())
        text6.append(Otv3_Last.toString())
        text9.append(Otv3.toString())
        if(Otv3_Last1 == 2){
            x++
            text3.setBackgroundColor(Color.GREEN)
        }else{
            text3.setBackgroundColor(Color.RED)
        }
        if(Otv3_Last == 3){
            x++
            text3.setBackgroundColor(Color.GREEN)
        }else{
            text3.setBackgroundColor(Color.RED)
        }
        if(Otv3 == 4){
            x++
            text3.setBackgroundColor(Color.GREEN)
        }else{
            text3.setBackgroundColor(Color.RED)
        }
text10.append(x.toString())



    }
}
