package com.android.agendakotlin.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.android.agendakotlin.R
import com.android.agendakotlin.dao.AlunoDAO
import java.util.*

class ListaAlunosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        val dao = AlunoDAO()
        title = "Lista de alunos"
        val listaDeAlunos = findViewById<ListView>(R.id.activity_lista_alunos_list_view)
        listaDeAlunos.adapter = ArrayAdapter<Any?>(
            this, android.R.layout.simple_list_item_1, dao.todos()
        )
    }
}