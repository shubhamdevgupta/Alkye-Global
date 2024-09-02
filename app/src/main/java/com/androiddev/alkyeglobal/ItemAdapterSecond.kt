package com.androiddev.alkyeglobal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapterSecond(
    private val items: List<ItemModel>,
    private val onItemClickListener: ItemAdapterSecond.OnItemClickListener
) :
    RecyclerView.Adapter<ItemAdapterSecond.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carIcon: ImageView = itemView.findViewById(R.id.carImageView)
        val dotsText: TextView = itemView.findViewById(R.id.categoryTextView)
        val dateText: TextView =
            itemView.findViewById(R.id.dateTextView) // Ensure this ID matches your layout

        init {
            itemView.setOnClickListener {
                onItemClickListener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_list, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.carIcon.setImageResource(item.imageResId)
        holder.dotsText.text = item.dotsText
        holder.dateText.text = item.dateText
    }

    override fun getItemCount(): Int = items.size

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
