package com.igti.modulo_iv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.igti.modulo_iv.data.remote.dto.AlunoRequestDTO
import com.igti.modulo_iv.data.remote.dto.AlunoResponseDTO
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime

class AlunoViewModel(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
): ViewModel() {

    private val _listaAlunos: MutableLiveData<List<AlunoResponseDTO>> = MutableLiveData()
    val listaAlunos: LiveData<List<AlunoResponseDTO>> = _listaAlunos

    private val _listaAlunosFlow = MutableStateFlow<List<AlunoResponseDTO>>(listOf())
    val listaAlunosFlow: StateFlow<List<AlunoResponseDTO>> = _listaAlunosFlow


    fun listarAlunos(){
       viewModelScope.launch(dispatcher) {
           val listaDelunos = listOf(
               AlunoResponseDTO(
                   id = "123",
                   nome = "Wanderson",
                   sobrenome = "Da Silva",
                   nascimento = LocalDate.parse("1996-09-14"),
                   cadastro = LocalDateTime.now()
               )
           )
           _listaAlunos.value = listaDelunos
           _listaAlunosFlow.value = listaDelunos
       }
    }
    fun listarAlunoPorId(id: String){
        // TODO respository.getById(id)
    }

    fun cadastrarAluno(aluno: AlunoRequestDTO){
        // TODO respository.post(aluno)
    }

    fun alterarAluno(id: String, aluno: AlunoRequestDTO){
        // TODO respository.put(id, aluno)
    }

    fun excluirAluno(id: String){
        // TODO respository.delete(id)
    }
}