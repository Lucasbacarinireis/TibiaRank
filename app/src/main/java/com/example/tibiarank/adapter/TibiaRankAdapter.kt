package com.example.tibiarank.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tibiarank.databinding.ItemCharacterBinding
import com.example.tibiarank.model.HighscoreListItem

class TibiaRankAdapter : RecyclerView.Adapter<TibiaRankViewHolder>() {

    private val items = arrayListOf<HighscoreListItem>()

    fun addItems(list: List<HighscoreListItem>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TibiaRankViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCharacterBinding.inflate(inflater, parent, false)
        return TibiaRankViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TibiaRankViewHolder, position: Int) {
        val item = items[position]

        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class TibiaRankViewHolder(val binding: ItemCharacterBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: HighscoreListItem) {
        binding.tvName.text = item.name
        binding.tvLvl.text = item.level.toString()
        binding.tvVocation.text = item.vocation
        binding.tvWorld.text = item.world
        binding.tvRank.text = "#${item.rank.toString().padStart(3, '0')}"
    }

}