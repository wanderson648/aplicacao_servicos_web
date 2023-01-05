package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.data.remote.dto.AlunoRequestDTO
import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import okhttp3.Response
import retrofit2.Call

class AlunoRepository: IAlunoRepository {
    override fun listarAlunos(): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun listarAlunoPorId(): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun cadastrarAluno(aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun alterarAluno(aluno: AlunoRequestDTO): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun excluirAluno(): Call<Response> {
        TODO("Not yet implemented")
    }


}