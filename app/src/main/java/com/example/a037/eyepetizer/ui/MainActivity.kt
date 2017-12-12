package com.example.a037.eyepetizer.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a037.eyepetizer.R
import com.example.a037.eyepetizer.util.DisplayManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DisplayManager.init(this)
    }
}
