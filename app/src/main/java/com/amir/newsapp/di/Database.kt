package com.amir.newsapp.di

import android.content.Context
import androidx.room.Room
import com.amir.newsapp.database.ArticlesDao
import com.amir.newsapp.database.ArticlesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Database
{
     @Singleton
     @Provides
     fun provideArticlesDatabase(
               @ApplicationContext context : Context
     ):ArticlesDatabase{
          return Room.databaseBuilder(
                    context,
                    ArticlesDatabase::class.java,
                    "articles.db"
          )
                    .fallbackToDestructiveMigration()
                    .build()
     }
     
     @Singleton
     @Provides
     fun provideArticlesDao(articlesDatabase : ArticlesDatabase):ArticlesDao = articlesDatabase.articlesDao()
}