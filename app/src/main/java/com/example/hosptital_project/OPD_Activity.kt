package com.example.hosptital_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OPD_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o_p_d_)
    }

    fun Next(view: View) {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)


    }
}