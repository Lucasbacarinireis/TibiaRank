package com.example.tibiarank.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tibiarank.databinding.ItemBinding
import com.example.tibiarank.database.model.ItemsResponse

class TibiaItemAdapter : RecyclerView.Adapter<TibiaItemViewHolder>() {

    private val items = arrayListOf<ItemsResponse>()

//    fun addItems(listItem: List<ItemsResponse>) {
//        items.clear()
//        items.addAll(listItem)
//        notifyDataSetChanged()
//
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TibiaItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return TibiaItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TibiaItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class TibiaItemViewHolder(
    val binding: ItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ItemsResponse){
        binding.tvName2.text = item.name
    }
}