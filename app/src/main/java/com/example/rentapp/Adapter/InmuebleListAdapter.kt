package com.example.rentapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.rentapp.R

class InmuebleListAdapter (
    private val context: Context
        ) : RecyclerView.Adapter<InmuebleListAdapter.ItemViewHolder>() {

    class ItemViewHolder (private val view : View) : RecyclerView.ViewHolder(view) {
        val imgInmueble : ImageView = view.findViewById(R.id.iv_inmueble)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_inmueble_espera, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.imgInmueble.setImageResource(R.drawable.ic_house)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}