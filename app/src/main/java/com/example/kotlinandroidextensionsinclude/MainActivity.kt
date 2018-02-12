package com.example.kotlinandroidextensionsinclude

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        proceedSomething()
    }

    private fun proceedSomething() {
        progress.visible()
        Handler().postDelayed({
            progress.gone()
            unknownError.visible()
        }, 4000L)
    }
}
