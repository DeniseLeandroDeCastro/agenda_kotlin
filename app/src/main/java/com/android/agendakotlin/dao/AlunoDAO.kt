package com.android.agendakotlin.dao

import com.android.agendakotlin.model.Aluno

class AlunoDAO {
    fun salva(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun todos(): List<Aluno> {
        return ArrayList<Aluno>(alunos)
    }

    companion object {
        private val alunos: MutableList<Aluno> = ArrayList<Aluno>()
    }
}