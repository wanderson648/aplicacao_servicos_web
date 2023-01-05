package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import retrofit2.Call
import retrofit2.http.GET


interface IAlunoRepository {

    @GET("/alunos")
    fun listarAlunos(): Call<List<AlunoResponseDTO>>

    @GET("/alunos/{id}")
    fun listarAlunoPorId(): Call<List<AlunoResponseDTO>>
    fun cadastrarAluno()
    fun alterarAluno()
    fun excluirAluno()
}