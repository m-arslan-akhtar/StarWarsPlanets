package com.arslan.swapi.data.repository

import com.arslan.swapi.data.model.Planet
import com.arslan.swapi.data.model.PlanetsResponse
import com.arslan.swapi.data.network.SwapiService
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

// Test Class
class PlanetRepositoryTest {

    @Test
    fun `getPlanets returns list on success`() = runBlocking {
        val service = Mockito.mock(SwapiService::class.java)
        val fakePlanet = Planet("Tatooine", "arid", "304", "1 standard", "url")
        Mockito.`when`(service.getPlanets(1)).thenReturn(PlanetsResponse(1, null, null, listOf(fakePlanet)))

        val repo = PlanetRepository(service)
        val result = repo.getPlanets()
        Assert.assertTrue(result.isSuccess)
        Assert.assertEquals(1, result.getOrNull()?.size)
    }
}
