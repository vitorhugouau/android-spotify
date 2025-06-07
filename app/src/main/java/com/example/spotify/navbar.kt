package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.segundoaplicativo.AtividadeAppSpotify
import com.example.segundoaplicativo.R

class navbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navbar)
        val textConfig = findViewById<TextView>(R.id.textConfig)

        textConfig.setOnClickListener {
            val intent = Intent(this, config::class.java)
            startActivity(intent)
        }

        val textMaquina = findViewById<TextView>(R.id.textMaquina)

        textMaquina.setOnClickListener {
            val intent = Intent(this, maquina::class.java)
            startActivity(intent)
        }
        val btnSpotify = findViewById<ImageView>(R.id.btnSpotify)
        btnSpotify.setOnClickListener {
            val intent = Intent(this, AtividadeAppSpotify::class.java)
            startActivity(intent)
        }
        }
}