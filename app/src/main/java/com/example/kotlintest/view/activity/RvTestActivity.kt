package com.example.kotlintest.view.activity

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.kotlintest.R
import com.example.kotlintest.view.adapter.RvTestAdapter
import kotlinx.android.synthetic.main.activity_rv_test.*

/**
 * RecyclerView
 */
class RvTestActivity: SampleActivityBase() {
    private val SPAN_COUNT = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_test)

//        val data = listOf("1","2","3","4","5","6","7","8","9","10")

        val data = ArrayList<String>()
        // for 循环还有其它方式
        for (index in 1..100) {
            data.add("" + index)
        }

        val layoutManager = LinearLayoutManager(this)
        val gridLayoutManager = GridLayoutManager(this, this.SPAN_COUNT)

        val testAdapter = RvTestAdapter(data)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = testAdapter

        bt_linear.setOnClickListener {
            recyclerView.layoutManager = layoutManager
        }

        bt_grid.setOnClickListener {
            recyclerView.layoutManager = gridLayoutManager
        }
    }
}