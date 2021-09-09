package com.example.practica75_listviewlibreria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica75_listviewlibreria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val libro1=Libro(
            "Orgullo y prejuicio",
            "Jane Austen",
            "1813" ,
            "La señora Bennet ha criado a sus cinco hijas con el único deseo de encontrar marido. La llegada al vecindario de Charles Bingley, un joven rico y soltero, con algunas amistades despierta el interés de las hermanas Bennet y de las familias vecinas, que verán una excelente oportunidad para cumplir su propósito. Elizabeth, una de las hijas de los Bennet, empezará una singular relación con Darcy, uno de los amigos de Bingley, que desencadenará esta historia de orgullo y prejuicios entre los dos hasta llegar a conocer el verdadero amor.",
            R.drawable.libro1
        )
        val libro2=Libro(
            "Mujercitas",
            "Louisa May Alcott",
            "1869" ,
            "La novela cuenta la historia de las hermanas March, cuatro jovencitas que vivían en un pueblo de Nueva Inglaterra mientras la guerra civil hacía estragos en toda América. Han pasado casi ciento cincuenta años desde aquel lejano 1868, pero la complicidad de Meg, Beth, Amy y Jo con las demás mujeres no ha muerto.",
            R.drawable.libro2
        )
        val libro3=Libro(
            "Jane Eyre",
            "Charlotte Brontë",
            "1847" ,
            "Dueña de un singular temperamento desde su complicada infancia de huérfana, primero a cargo de una tía poco cariñosa y después en la escuela Lowood, Jane Eyre logra el puesto de institutriz en Thornfield Hall para educar a la hija de su atrabiliario y peculiar dueño, el señor Rochester.",
            R.drawable.libro3
        )
        val libro4=Libro(
            "Frankenstein o el moderno Prometeo",
            "Mary Shelley",
            "1818" ,
            "Frankenstein es una historia macabra en la que Víctor, un joven ávido de conocimientos científicos, se obsesiona por lograr el mayor reto posible en el mundo científico: dar vida a un cuerpo muerto.",
            R.drawable.libro4
        )
        val libro5=Libro(
            "Drácula",
            "Bram Stoker",
            "1897" ,
            "Cuando Jonathan Harker viajó a Transilvania por asuntos de negocios, nunca imaginó el peligro que corría. Su cliente, el magnético conde Drácula, lo mantiene prisionero y Harker adivina sus oscuros propósitos: viajar a Londres para sembrar el terror y cosechar víctimas con las que saciar su apetito de sangre.",
            R.drawable.libro5
        )
        val libro6=Libro(
            "Los tres mosqueteros",
            "Alexandre Dumas",
            "1844" ,
            "La novela narra las aventuras de un joven gascón de 18 años, conocido como d'Artagnan, que se va a París para hacerse mosquetero. Los verdaderos mosqueteros son Athos, Porthos y Aramis, amigos inseparables que viven bajo el lema «Uno para todos, todos para uno».",
            R.drawable.libro6
        )
        val libro7=Libro(
            "Los miserables",
            "Victor Hugo",
            "1862" ,
            "Jean Valjean, un ex convicto al que encerraron durante veinte años por robar un pedazo de pan, se convierte en un hombre ejemplar que lucha contra la miseria y la injusticia y que empeña su vida en cuidar a la hija de una mujer que ha debido prostituirse para salvar a la niña.",
            R.drawable.libro7
        )
        val libro8=Libro(
            "Anna Karenina",
            "León Tolstói",
            "1877" ,
            "Su argumento se centra en la vida de Ana Karenina, una mujer casada con un alto funcionario que se enamora de un joven militar y decide dejarlo todo por él, desafiando así las férreas convenciones sociales de la época. ... Finalmente, termina con su vida víctima de una sociedad que la condena.",
            R.drawable.libro8
        )
        val libro9=Libro(
            "Crimen y castigo",
            "Crimen y castigo",
            "1866" ,
            "La historia narra la vida de Rodión Raskólnikov, un estudiante en la capital de la Rusia Imperial, San Petersburgo. Este joven se ve obligado a suspender sus estudios por la miseria en la cual se ve envuelto, a pesar de los esfuerzos realizados por su madre Pulqueria y su hermana Dunia para enviarle dinero.",
            R.drawable.libro9
        )
        val libro10=Libro(
            "Los viajes de Gulliver",
            "Jonathan Swift",
            "1726" ,
            "Gulliver es un apasionado de los viajes. Sus aventuras lo llevan a lugares extraordinarios: Liliput, donde viven personas minúsculas, a Brobdingnag, país habitado por gigantes, de la isla voladora de Laputa a la tierra de los houyhnhnms, los sabios caballos parlantes",
            R.drawable.lobro10
        )

        val listaLibros= listOf<Libro>(libro1,libro2,libro3,libro4,libro5,libro6,libro7,libro8,libro9,libro10)

        val adaptador=LibrosAdapter(this,listaLibros)
        binding.lista.adapter=adaptador

        binding.lista.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, LibroActivity::class.java)
            intent.putExtra("libro",listaLibros[i])
            startActivity(intent)
        }
    }
}