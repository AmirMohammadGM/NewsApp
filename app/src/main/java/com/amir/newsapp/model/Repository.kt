package com.amir.newsapp.model

import com.amir.newsapp.database.ArticlesEntity
import kotlinx.coroutines.flow.Flow

interface Repository
{

      fun topHeadline(country : String , category : String) : Flow<List<Articles>>

      fun searchNews(query : String , sortBy : String) : Flow<List<Articles>>

      fun getAllNews() : Flow<List<Articles>>

      suspend fun addNews(articles : Articles)

      suspend fun deleteNews(articlesEntity : ArticlesEntity)
}