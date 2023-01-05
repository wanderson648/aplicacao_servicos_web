package com.igti.modulo_iv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.igti.modulo_iv.viewmodel.AlunoViewModel
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private val alunoViewModel: AlunoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        alunoViewModel.listaAlunos.observe(this, Observer { list ->
//            if(!list.isNullOrEmpty()) {
//                // TODO faca algo
//            }
//        })

        // runBlocking {
            //alunoViewModel.listaAlunosFlow.collect { list ->
            //    if(!list.isNullOrEmpty()) {
    //                // TODO faca algo
//              }
            //}
        //}

    }
}

