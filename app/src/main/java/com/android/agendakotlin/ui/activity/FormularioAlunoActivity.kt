package com.android.agendakotlin.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.agendakotlin.R
import com.android.agendakotlin.model.Aluno

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)

        val campoNome = findViewById<EditText>(R.id.activity_formulario_aluno_nome)
        val campoTelefone = findViewById<EditText>(R.id.activity_formulario_aluno_telefone)
        val campoEmail = findViewById<EditText>(R.id.activity_formulario_aluno_email)

        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_aluno_botao_salvar)
        botaoSalvar.setOnClickListener {
            val nome = campoNome.text.toString()
            val telefone = campoTelefone.text.toString()
            val email = campoEmail.text.toString()
            val alunoCriado = Aluno(nome, telefone, email)

            Toast.makeText(
                this,
                alunoCriado.nome + " - "
                        + alunoCriado.telefone + " - "
                        + alunoCriado.email,
                Toast.LENGTH_SHORT)
                .show()
        }
    }
}