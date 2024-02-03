package com.devcom.weather.data

import com.devcom.weather.api.ApiService
import com.devcom.weather.api.ApiState
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getPopularMovies()  = flow {
        emit(ApiState.Loading(true))
        val response = apiService.getMostPopularMovies()
        emit(ApiState.Success(response.items))
    }.catch { e ->
        emit(ApiState.Failure(e.message ?: "Unknown Error"))
    }
}