package com.example.rentapp.ui.arrendador.venta

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rentapp.ArrentarioVentaViewModel
import com.example.rentapp.R

class arrentario_venta : Fragment() {

    companion object {
        fun newInstance() = arrentario_venta()
    }

    private lateinit var viewModel: ArrentarioVentaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.arrentario_venta_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArrentarioVentaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}