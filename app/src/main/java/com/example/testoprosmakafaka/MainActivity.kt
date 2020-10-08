package com.example.testoprosmakafaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var ex1: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButNext.setOnClickListener {
            if (But1.isChecked || But2.isChecked || But3.isChecked){
                when{
                    But1.isChecked -> ex1 = "1"
                    But2.isChecked -> ex1 = "2"
                    But3.isChecked -> ex1 = "3"
                }
                val otv = Intent( this, Main2Activity::class.java)
                otv.putExtra("Otv1", ex1)
                startActivity(otv)
            }
        }
    }
}
