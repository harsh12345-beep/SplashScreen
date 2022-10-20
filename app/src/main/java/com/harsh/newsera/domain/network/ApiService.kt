package com.harsh.newsera.domain.network

import com.harsh.newsera.domain.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("everything?q=tesla&from=2022-08-27&sortBy=publishedAt&apiKey=680d66ce64c44a7ea97efa29fec1cb69")
    suspend fun getNewArticles(): Response<NewsResponse>

}