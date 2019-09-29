package com.example.kotlintest.view.activity

import android.content.Intent
import android.os.Bundle
import com.example.kotlintest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : SampleActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_recyclerView.setOnClickListener {
            val intent = Intent(this, RvTestActivity::class.java)
            startActivity(intent)
        }
    }
}