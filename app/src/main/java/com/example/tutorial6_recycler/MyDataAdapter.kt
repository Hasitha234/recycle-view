package com.example.tutorial6_recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyDataAdapter(private val data:List<Post>):RecyclerView.Adapter<MYDataVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MYDataVH {
        val layoutInflater:LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater
            .inflate(R.layout.list_item_layout,parent,false)
        return MYDataVH(view)
    }

    private fun MYDataVH(itemView: View) {

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MYDataVH, position: Int) {
        val singleData = data[position]
        var toggle=true

        holder.tvUserName.text=singleData.userName
        holder.tvDescription.text=singleData.description
        holder.btnLike.text="${singleData.likes}"

        holder.btnLike.setOnClickListener {
            if(toggle){
                holder.btnLike.text="${singleData.likes+1}"
                toggle=false
            }else{
                holder.btnLike.text="${singleData.likes}"
                toggle= true
            }
        }
    }

}