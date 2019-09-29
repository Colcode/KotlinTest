package com.example.kotlintest.view.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log

open class SampleActivityBase: FragmentActivity() {

    override fun onStart() {
        super.onStart()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        val TAG = "SampleActivityBase"
    }
}