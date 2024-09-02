package com.androiddev.alkyeglobal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val items: List<ItemModel>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carIcon: ImageView = itemView.findViewById(R.id.carImage)
        val dotsText: TextView = itemView.findViewById(R.id.categoryText)
        val dateText: TextView = itemView.findViewById(R.id.dateText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.carIcon.setImageResource(item.imageResId)
        holder.dotsText.text = item.dotsText
        holder.dateText.text = item.dateText
    }

    override fun getItemCount(): Int = items.size
}
