package com.android.agendakotlin.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.android.agendakotlin.R
import com.android.agendakotlin.dao.AlunoDAO
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaAlunosActivity : AppCompatActivity() {

    val TITULO_APPBAR = "Lista de alunos"
    private val dao = AlunoDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        title = TITULO_APPBAR
        configuraFabNovoAluno()
    }

    private fun configuraFabNovoAluno() {
        val botaoNovoAluno =
            findViewById<FloatingActionButton>(R.id.activity_lista_alunos_fab_novo_aluno)
        botaoNovoAluno.setOnClickListener { abreFormularioAlunoActivity() }
    }

    private fun abreFormularioAlunoActivity() {
        startActivity(Intent(this, FormularioAlunoActivity::class.java))
    }

    override fun onResume() {
        super.onResume()
        configuraLista()
    }

    private fun configuraLista() {
        val listaDeAlunos = findViewById<ListView>(R.id.activity_lista_alunos_list_view)
        listaDeAlunos.adapter = ArrayAdapter<Any?>(
            this, android.R.layout.simple_list_item_1, dao.todos()
        )
    }
}