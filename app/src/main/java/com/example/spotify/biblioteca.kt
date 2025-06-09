package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.segundoaplicativo.R

class biblioteca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_biblioteca)
        val btnPlaylist = findViewById<ImageView>(R.id.btnPlaylist)
        btnPlaylist.setOnClickListener {
            val intent = Intent(this, playlist::class.java)
            startActivity(intent)
            finish()
        }
    }
}