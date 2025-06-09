package com.example.segundoaplicativo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.spotify.navbar

class musicaLista : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musica_lista)

        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, ListaMusicas::class.java)
            startActivity(intent)
            finish()
        }

        val musicas = arrayOf(
            "Stronger", "Power", "Heartless", "Flashing Lights",
            "Gold Digger", "Runaway", "Can't Tell Me Nothing",
            "All of the Lights", "Ultralight Beam", "Famous",
            "Black Skinhead", "Bound 2"
        )

        val listaMusicas = findViewById<ListView>(R.id.listaMusicas)
        listaMusicas.adapter = MusicaAdapter(this, musicas)
    }

    class MusicaAdapter(private val context: Context, private val data: Array<String>) :
        ArrayAdapter<String>(context, R.layout.item_musica, data) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_musica, parent, false)
            val nomeMusica = view.findViewById<TextView>(R.id.musica_nome)
            nomeMusica.text = data[position]
            return view
        }
    }
}

