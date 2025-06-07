package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.segundoaplicativo.AtividadeAppSpotify
import com.example.segundoaplicativo.ListaMusicas
import com.example.segundoaplicativo.Musicas
import com.example.segundoaplicativo.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar)
        // --- Bottom Navigation ---
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, AtividadeAppSpotify::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_search -> {
                    true
                }
                R.id.nav_library -> {
                    startActivity(Intent(this, ListaMusicas::class.java))
                    overridePendingTransition(0, 0)
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
        val imgMusica = findViewById<ImageView>(R.id.imgMusica)
        imgMusica.setOnClickListener {
            val intent = Intent(this, pesquisamusica::class.java)
            startActivity(intent)
        }


    }
}