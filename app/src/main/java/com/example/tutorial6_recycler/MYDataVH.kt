package com.example.tutorial6_recycler

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MYDataVH(itemView: View,parent: ViewGroup): RecyclerView.ViewHolder(itemView) {
    val hSize = parent.measuredWidth/2
    val vSize = parent.measuredHeight/2

    init {
        itemView.layoutParams.height=vSize-16
        itemView.layoutParams.width=hSize-16
    }
    val tvUserName:TextView = itemView.findViewById(R.id.tvUserName)
    val tvDescription:TextView = itemView.findViewById(R.id.tvDescription)
    val btnLike: Button = itemView.findViewById(R.id.btnLike)
}