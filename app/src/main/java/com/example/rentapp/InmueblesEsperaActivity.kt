package com.example.rentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.rentapp.Adapter.InmuebleListAdapter
import com.example.rentapp.databinding.ActivityInmueblesEsperaBinding

class InmueblesEsperaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInmueblesEsperaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inmuebles_espera)

        binding.inmueblesRecyclerView.adapter = InmuebleListAdapter(this)
        binding.inmueblesRecyclerView
    }
}