package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class wishadapter(private val wishes: List<Wish>) : RecyclerView.Adapter<wishadapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wish_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val wish = wishes.get(position)
        // Set item views based on views and data model
        holder.itemTVTextView.text = wish.item
        holder.linkTVTextView.text = wish.link
        holder.priceTVTextView.text = wish.price
    }

    override fun getItemCount(): Int {
        return wishes.size
    }

}