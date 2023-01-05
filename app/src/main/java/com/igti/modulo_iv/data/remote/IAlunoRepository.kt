package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.data.remote.dto.AlunoRequestDTO
import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface IAlunoRepository {

    @GET("/alunos")
    fun listarAlunos(): Call<List<AlunoResponseDTO>>

    @GET("/alunos/{id}")
    fun listarAlunoPorId(): Call<List<AlunoResponseDTO>>

    @POST("/alunos")
    fun cadastrarAluno(@Body aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>>
    fun alterarAluno()
    fun excluirAluno()
}