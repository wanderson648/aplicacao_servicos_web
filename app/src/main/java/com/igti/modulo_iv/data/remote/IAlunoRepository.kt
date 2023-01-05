package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.data.remote.dto.AlunoRequestDTO
import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import retrofit2.Call
import retrofit2.http.*


interface IAlunoRepository {

    @GET("/alunos")
    fun listarAlunos(): Call<List<AlunoResponseDTO>>

    @GET("/alunos/{id}")
    fun listarAlunoPorId(@Path("id") id: String): Call<List<AlunoResponseDTO>>

    @POST("/alunos")
    fun cadastrarAluno(@Body aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>>

    @PUT("/alunos/{id}")
    fun alterarAluno(@Path("id") id: String, @Body aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>>

    @DELETE("/alunos/{id}")
    fun excluirAluno(@Path("id") id: String): Call<okhttp3.Response>
}