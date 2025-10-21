package com.arslan.swapi.data.repository

import com.arslan.swapi.data.model.Planet
import com.arslan.swapi.data.network.SwapiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PlanetRepository(private val service: SwapiService) {

    suspend fun getPlanets(page: Int = 1): Result<List<Planet>> {
        return withContext(Dispatchers.IO) {
            try {
                val res = service.getPlanets(page)
                Result.success(res.results)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
}
