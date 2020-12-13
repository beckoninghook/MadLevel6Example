package com.example.myapplication.services

import com.example.myapplication.Trivia
import retrofit2.http.GET

interface TriviaApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}
