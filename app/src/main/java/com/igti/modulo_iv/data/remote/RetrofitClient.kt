package com.igti.modulo_iv.data.remote

import com.igti.modulo_iv.IgtiApplication
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    companion object {
        private val retrofitClient : RetrofitClient? = null
    }

    val alunoRepository: IAlunoRepository? = null

    private fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(15L, TimeUnit.SECONDS)
            .readTimeout(15L, TimeUnit.SECONDS)
            .writeTimeout(15L, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor { msg ->
                println("LOG APP: $msg")
            }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).addNetworkInterceptor(HttpLoggingInterceptor { msg ->
                println("LOG NTW: $msg")
            }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    private fun createRetrofitInstance(): RetrofitClient {
       val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://igti.com.br")
            .client(createOkHttpClient())
            .build()

        alunoRepository = retrofit.create(IAlunoRepository::class.java)
    }


    fun getInstance(): RetrofitClient {
        if(retrofitClient == null) {
            retrofitClient = createRetrofitInstance()
        }
        return retrofitClient
    }

    fun getAlunoApi() = alunoRepository
}