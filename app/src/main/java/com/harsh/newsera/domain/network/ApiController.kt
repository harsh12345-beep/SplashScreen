package com.harsh.newsera.domain.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiController {

    private const val BASE_URL = "https://newsapi.org/v2/"

    private fun mApiController(): Retrofit {

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    }

    val apiService: ApiService by lazy {
        mApiController().create(ApiService::class.java)
    }

}
