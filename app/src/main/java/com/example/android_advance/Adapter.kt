package com.example.android_advance

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_advance.databinding.ItemBinding

class Adapter(val list:ArrayList<Info>): RecyclerView.Adapter<Adapter.MyView>() {

    inner class MyView(val itemBinding: ItemBinding): RecyclerView.ViewHolder(itemBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(ItemBinding.inflate(
            LayoutInflater.from(parent
            .context),parent,false
        ))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.image1.setImageResource(list[position].image)
        holder.itemBinding.text1.text = list[position].name
    }




}