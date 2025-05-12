package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaMusicas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_musicas)
    }

    fun btnTudo(view: View){
        var intent = Intent(this, AtividadeAppSpotify::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }

    fun btnMusicas(view: View){
        var intent = Intent(this, Musicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}