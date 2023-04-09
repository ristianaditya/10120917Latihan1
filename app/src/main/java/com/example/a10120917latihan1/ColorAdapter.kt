// 9 April,
// 10120917 Ristian Aditya,
// IF10K

package com.example.a10120917latihan1

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter

class ColorAdapter(private val colors: List<String>) : BaseAdapter() {
    override fun getCount(): Int = colors.size
    override fun getItem(position: Int): Any = colors[position]
    override fun getItemId(position: Int): Long = 0
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val colorView = View(parent?.context)
        colorView.setBackgroundColor(Color.parseColor(colors[position]))
        colorView.layoutParams = AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75)
        return colorView
    }
}