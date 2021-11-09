package com.example.rentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rentapp.Adapter.InmuebleListAdapter
import com.example.rentapp.databinding.ActivityInmueblesEsperaBinding

class InmueblesEsperaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInmueblesEsperaBinding
    private lateinit var layout: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inmuebles_espera)

        binding.inmueblesRecyclerView.adapter = InmuebleListAdapter(this)
        layout = GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL, false)
        binding.inmueblesRecyclerView.layoutManager = layout
    }
}