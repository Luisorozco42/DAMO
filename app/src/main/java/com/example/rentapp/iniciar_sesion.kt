package com.example.rentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rentapp.arrendatario.arendatario_menu
import com.example.rentapp.databinding.ActivityIniciarSesionBinding


class iniciar_sesion : AppCompatActivity() {
    private lateinit var binding : ActivityIniciarSesionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIniciarSesion.setOnClickListener(){
            startActivity(Intent(this, arendatario_menu::class.java))
        }
    }
}