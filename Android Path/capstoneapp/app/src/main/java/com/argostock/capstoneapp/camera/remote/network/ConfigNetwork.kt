package com.argostock.capstoneapp.camera.remote.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfigNetwork {
    companion object {
        fun getRetrofit() : ApiService {
            val retrofit = Retrofit.Builder()
                    // PUT API HERE (BUT WE DONT HAVE THAT)
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}