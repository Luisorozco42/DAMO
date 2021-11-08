package com.example.rentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        //Mandando a llamar formulario registrar_usuario
        binding.btnRegistrar.setOnClickListener(){
            startActivity(Intent(this, registrar_usuario::class.java))
        }
        binding.btnIniciarSesion.setOnClickListener(){
            startActivity(Intent(this, iniciar_sesion::class.java))
        }
    }
}