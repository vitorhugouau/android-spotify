package com.example.segundoaplicativo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spotify.Premium
import com.example.spotify.buscar
import com.example.spotify.playlist
import com.google.android.material.bottomnavigation.BottomNavigationView

class ListaMusicas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_musicas)

        val btnBack = findViewById<ImageView>(R.id.btnPlaylist)
        
        btnBack.setOnClickListener {
            val intent = Intent(this, playlist::class.java)
            startActivity(intent)
            finish()
        }

        val btnLista = findViewById<ImageView>(R.id.btnLista)

        btnLista.setOnClickListener {
            val intent = Intent(this, musicaLista::class.java)
            startActivity(intent)
            finish()
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, AtividadeAppSpotify::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_search -> {
                    startActivity(Intent(this, buscar::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_library -> {
                    true
                }
                R.id.nav_premium -> {
                    startActivity(Intent(this, Premium::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }
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

    fun flashing(view: View){
        var intent = Intent(this, musicaFlashing::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }



}