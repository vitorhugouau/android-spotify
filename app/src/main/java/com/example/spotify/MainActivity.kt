package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.spotify.Entrar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun AtividadeAppMusica(view:View){
        var intent = Intent(this, Entrar::class.java)
        startActivity(intent)

    }

}