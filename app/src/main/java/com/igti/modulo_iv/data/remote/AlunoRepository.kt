package com.igti.modulo_iv.data.remote

class AlunoRepository: IAlunoRepository {
    override fun getAlunos(): List<String> {
        return listOf("000.000.000-77", "111.222.333-66")
    }
}