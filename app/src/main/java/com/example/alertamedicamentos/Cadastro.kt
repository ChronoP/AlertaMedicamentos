package com.example.alertamedicamentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alertamedicamentos.databinding.ActivityCadastroBinding


class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botao.setOnClickListener {
            val navegarInicio = Intent(this,Inicio::class.java)
            startActivity(navegarInicio)
        }

    }
}