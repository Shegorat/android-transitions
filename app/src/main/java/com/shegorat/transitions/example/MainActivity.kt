package com.shegorat.transitions.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Fade()
        setContentView(R.layout.activity_main)
    }
}
