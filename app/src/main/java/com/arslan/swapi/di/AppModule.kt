package com.arslan.swapi.di

import com.arslan.swapi.data.network.SwapiService
import com.arslan.swapi.data.repository.PlanetRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://swapi.dev/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideSwapiService(retrofit: Retrofit): SwapiService =
        retrofit.create(SwapiService::class.java)

    @Provides
    @Singleton
    fun providePlanetRepository(service: SwapiService): PlanetRepository =
        PlanetRepository(service)
}
