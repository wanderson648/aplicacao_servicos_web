package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.data.remote.dto.AlunoRequestDTO
import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import okhttp3.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Path

class AlunoRepository: IAlunoRepository {
    override fun listarAlunos(): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun listarAlunoPorId(@Path(value = "id") id: String): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun cadastrarAluno(aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun alterarAluno(
        @Path(value = "id") id: String,
        @Body aluno: AlunoRequestDTO
    ): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun excluirAluno(@Path(value = "id") id: String): Call<Response> {
        TODO("Not yet implemented")
    }

}