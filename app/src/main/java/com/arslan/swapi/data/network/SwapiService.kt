package com.arslan.swapi.data.network

import com.arslan.swapi.data.model.PlanetsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface SwapiService {
    @GET("planets/")
    suspend fun getPlanets(@Query("page") page: Int = 1): PlanetsResponse
}
