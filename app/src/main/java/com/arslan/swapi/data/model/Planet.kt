package com.arslan.swapi.data.model

import com.google.gson.annotations.SerializedName

// Response Models
data class Planet(
    val name: String,
    val climate: String,
    @SerializedName("orbital_period") val orbitalPeriod: String,
    val gravity: String,
    val url: String
)

data class PlanetsResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Planet>
)
