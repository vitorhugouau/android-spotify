package com.example.spotify

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.segundoaplicativo.AtividadeAppSpotify
import com.example.segundoaplicativo.MainActivity

class Entrar : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var senha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.segundoaplicativo.R.layout.activity_entrar)

        email = findViewById(com.example.segundoaplicativo.R.id.email)
        senha = findViewById(com.example.segundoaplicativo.R.id.senha)
    }

    fun loginButton(view: View) {
        val txtEmail = email.text.toString().trim()
        val txtSenha = senha.text.toString().trim()

        if (txtEmail == "user" && txtSenha == "123") {
            val intent = Intent(this, AtividadeAppSpotify::class.java) // Substitua Principal pela Activity de destino
            startActivity(intent)
        } else {
            Toast.makeText(this, "Email ou Senha Incorretos.", Toast.LENGTH_LONG).show()
        }
    }

}

