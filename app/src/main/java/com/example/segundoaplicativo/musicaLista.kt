package com.example.segundoaplicativo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class musicaLista : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musica_lista)

        val arrayAdapter: ArrayAdapter<*>

        val musicas = arrayOf(
            "Stronger",
            "Power",
            "Heartless",
            "Flashing Lights",
            "Gold Digger",
            "Runaway",
            "Can't Tell Me Nothing",
            "All of the Lights",
            "Ultralight Beam",
            "Famous",
            "Black Skinhead",
            "Bound 2"
        )

        var lista_musicas = findViewById<ListView>(R.id.listaMusicas)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,musicas)

        // variavel use a funcao adapter que recebe o arrayAdapter
        lista_musicas.adapter = arrayAdapter

    }

}