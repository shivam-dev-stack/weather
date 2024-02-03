package com.devcom.weather.api

sealed class ApiState<T>(){

    data class Loading<T>(val isLoading: Boolean) : ApiState<T>()
    data class Success<T>(val data: T) : ApiState<T>()
    data class Failure<T>(val errorMessage: String) : ApiState<T>()
}

