package com.harsh.newsera.domain.repository

import com.harsh.newsera.domain.model.NewsResponse
import com.harsh.newsera.domain.network.ApiController
import com.harsh.newsera.utils.IResource

object NewsRepository {

    suspend fun getNews(): IResource<NewsResponse> {

        val response = ApiController.apiService.getNewArticles()

        if (response.isSuccessful) {
            return IResource.Success(response.body())
        }

        return IResource.Error(response.message())

    }

}