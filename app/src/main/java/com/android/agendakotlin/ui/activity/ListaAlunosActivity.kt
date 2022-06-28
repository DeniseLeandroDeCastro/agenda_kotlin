package com.android.agendakotlin.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.android.agendakotlin.R
import java.util.*

class ListaAlunosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)

        title = "Lista de alunos"

        val alunos: List<String> = ArrayList(
            Arrays.asList(
                "Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4"
            )
        )
        val listaDeAlunos = findViewById<ListView>(R.id.activity_lista_alunos_list_view)
        listaDeAlunos.adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, alunos
        )
    }
}