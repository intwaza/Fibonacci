package com.example.fibonacci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnCheck=findViewById<Button>(R.id.btnCheck)
        var number=findViewById<EditText>(R.id.etNumbers)
        btnCheck.setOnClickListener {
            var nums=number.text.toString().toInt()

            var intent=Intent(baseContext,SecondPage::class.java)
            intent.putExtra("Numbers",nums)
            startActivity(intent)
        }
    }
}