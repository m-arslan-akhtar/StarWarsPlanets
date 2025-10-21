package com.arslan.swapi.data.network

import com.arslan.swapi.data.model.PlanetsResponse
import retrofit2.http.GET
import retrofit2.http.Query

// Endpoint service
interface SwapiService {
    @GET("planets/")
    suspend fun getPlanets(@Query("page") page: Int = 1): PlanetsResponse // just fetch page 1
}
