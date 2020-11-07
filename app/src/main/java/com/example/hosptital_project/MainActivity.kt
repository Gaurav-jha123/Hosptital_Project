package com.example.hosptital_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Transfer(view: View) {
        val intent = Intent(this, OPD_Activity::class.java)
        startActivity(intent)

    }
}