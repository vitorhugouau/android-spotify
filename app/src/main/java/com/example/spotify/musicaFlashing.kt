package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class musicaFlashing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_musica_flashing)


    }
    fun btnListaMusicas(view: View){
        var intent = Intent(this, musicaLista::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}