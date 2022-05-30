package com.amir.newsapp.repository

import com.amir.newsapp.database.ArticlesDao
import com.amir.newsapp.database.ArticlesEntity
import com.amir.newsapp.database.toDaoModel
import com.amir.newsapp.database.toDomainModel
import com.amir.newsapp.model.Articles
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalDatasource @Inject constructor(
          private val articlesDao : ArticlesDao
)
{
     fun getAllNews():Flow<List<Articles>> = articlesDao.getAllNews().map { it.map { it.toDomainModel() } }
     
     suspend fun insertNews(articles : Articles) = articlesDao.insertNews(articles.toDaoModel())
     
     suspend fun deleteNews(articlesEntity : ArticlesEntity) = articlesDao.deleteNews(articlesEntity)
}