package com.example.rentapp.ui.arrendador

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rentapp.R
import com.example.rentapp.ui.arrendador.alquiler.ArrendadorEdicionViewModel

class arrendador_edicion : Fragment() {

    companion object {
        fun newInstance() = arrendador_edicion()
    }

    private lateinit var viewModel: ArrendadorEdicionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.arrendador_edicion_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArrendadorEdicionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}