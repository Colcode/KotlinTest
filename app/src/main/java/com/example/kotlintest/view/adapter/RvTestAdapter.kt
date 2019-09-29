package com.example.kotlintest.view.adapter

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.kotlintest.R

class RvTestAdapter(private val data : List<String>): RecyclerView.Adapter<RvTestAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_test_rv, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if (position % 2 == 0) {
            viewHolder.llItem.setBackgroundColor(Color.parseColor("#FFEBCD"))
        } else {
            viewHolder.llItem.setBackgroundColor(Color.parseColor("#FFF0F5"))
        }
        viewHolder.tvName.text = "行数"
        viewHolder.tvNum.text = data.get(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tv_name)
        val tvNum: TextView = view.findViewById(R.id.tv_num)
        val llItem: LinearLayout = view.findViewById(R.id.ll_item)
        init {
            // item 点击事件
            view.setOnClickListener {
                Toast.makeText(view.context, "第 $adapterPosition 个被点击了", Toast.LENGTH_SHORT).show()
            }
        }
    }

}