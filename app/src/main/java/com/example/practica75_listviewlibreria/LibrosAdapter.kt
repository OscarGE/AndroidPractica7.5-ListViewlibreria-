package com.example.practica75_listviewlibreria

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.practica75_listviewlibreria.databinding.ItemLibroBinding

class LibrosAdapter(private val mContext: Context, private val listaLibros: List<Libro>) : ArrayAdapter<Libro>(mContext,0,listaLibros) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding  = ItemLibroBinding.inflate(LayoutInflater.from(mContext),parent,false)

        val libro = listaLibros[position]

        binding.txtNombre.text = libro.nombre
        binding.txtAutor.text= libro.autor
        binding.txtAno.text= libro.anoPublicacion
        binding.imageView.setImageResource(libro.imagen)

        return binding.root
    }
}