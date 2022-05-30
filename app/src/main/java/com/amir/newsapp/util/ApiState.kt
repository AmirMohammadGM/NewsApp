package com.amir.newsapp.util

import com.amir.newsapp.model.Articles

sealed class ApiState
{
     object Empty : ApiState()
     class Success(val data : List<Articles>) : ApiState()
     class Error(val throwable : Throwable) : ApiState()
     object Loading : ApiState()
}
