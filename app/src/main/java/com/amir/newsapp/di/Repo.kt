package com.amir.newsapp.di

import com.amir.newsapp.model.Repository
import com.amir.newsapp.repository.NewsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class Repo
{
     @Binds
     abstract fun provideRepository(repositoryImpl : NewsRepositoryImpl) : Repository
}