package com.example.hosptital_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
    }

    fun submit(view: View) {
       val intent = Intent(this , SuccessActivity::class.java)
        startActivity(intent)
        finish()

    }
}