package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.spotify.Premium
import com.example.spotify.navbar

class AtividadeAppSpotify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade_app_spotify)

        // --- Bottom Navigation ---
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {

                    true
                }
                R.id.nav_search -> {
                    Toast.makeText(this, "Buscar clicado", Toast.LENGTH_SHORT).show()
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

        val imageSpotify = findViewById<ImageView>(R.id.imageSpotify)

        imageSpotify.setOnClickListener {
            val intent = Intent(this, navbar::class.java)
            startActivity(intent)
        }
    }

    fun linearCBJ(view: View) {
        startActivity(Intent(this, Musicas::class.java))
        overridePendingTransition(0, 0)
    }

    fun btnMusicas(view: View) {
        startActivity(Intent(this, Premium::class.java))
        overridePendingTransition(0, 0)
    }

}

