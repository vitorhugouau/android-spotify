package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.segundoaplicativo.AtividadeAppSpotify
import com.example.segundoaplicativo.ListaMusicas
import com.example.segundoaplicativo.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Premium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_premium)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
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
                    Toast.makeText(this, "Buscar clicado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_library -> {
                    startActivity(Intent(this, ListaMusicas::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_premium -> {
                    true
                }
                else -> false
            }
        }
    }
}