package com.example.practica75_listviewlibreria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import com.example.practica75_listviewlibreria.databinding.ActivityLibroBinding

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLibroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtSinopsisLibro.movementMethod = ScrollingMovementMethod()
        val libro=intent.getSerializableExtra("libro") as Libro
        binding.txtNombreLibro.text=libro.nombre
        binding.txtAutorLibro.text=libro.autor
        binding.txtAnoLibro.text=libro.anoPublicacion
        binding.imageView3.setImageResource(libro.imagen)
        binding.txtSinopsisLibro.text=libro.sinopsis
    }
}