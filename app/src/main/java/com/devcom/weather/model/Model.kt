package com.devcom.weather.model




data class Movie (

    val id: String,
    val title: String,
    val year: String,
    val image: String,
    val imDbRating: String
)

data class MovieResponse(val items: List<Movie>, val errorMessage: String)
