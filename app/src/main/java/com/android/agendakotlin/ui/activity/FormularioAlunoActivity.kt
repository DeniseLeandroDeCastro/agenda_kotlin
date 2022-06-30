package com.android.agendakotlin.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.android.agendakotlin.R
import com.android.agendakotlin.dao.AlunoDAO
import com.android.agendakotlin.model.Aluno

class FormularioAlunoActivity : AppCompatActivity() {

    val TITULO_APPBAR = "Novo aluno"
    private var campoNome: EditText? = null
    private var campoTelefone: EditText? = null
    private var campoEmail: EditText? = null
    private val dao = AlunoDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)
        title = TITULO_APPBAR
        inicializacaoDosCampos()
        configuraBoataoSalvar()
    }

    private fun configuraBoataoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_aluno_botao_salvar)
        botaoSalvar.setOnClickListener {
            val alunoCriado = criaAluno()
            salva(alunoCriado)
        }
    }

    private fun inicializacaoDosCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome)
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone)
        campoEmail = findViewById(R.id.activity_formulario_aluno_email)
    }

    private fun salva(aluno: Aluno) {
        dao.salva(aluno)
        finish()
    }

    private fun criaAluno(): Aluno {
        val nome = campoNome!!.text.toString()
        val telefone = campoTelefone!!.text.toString()
        val email = campoEmail!!.text.toString()
        return Aluno(nome, telefone, email)
    }
}
