package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AtividadeAppSpotify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade_app_spotify)

    }

    fun linearCBJ(view: View){
        var intent = Intent(this, Musicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }

    fun btnMusicas(view: View){
        var intent = Intent(this, Musicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }
}