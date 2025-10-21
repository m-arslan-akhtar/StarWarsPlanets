package com.arslan.swapi.ui.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arslan.swapi.data.model.Planet
import com.arslan.swapi.data.repository.PlanetRepository
import com.arslan.swapi.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

// Viewmodel
@HiltViewModel
class PlanetListViewModel @Inject constructor(
    private val repository: PlanetRepository
) : ViewModel() {

    private val _state = MutableStateFlow<Resource<List<Planet>>>(Resource.Loading)
    val state: StateFlow<Resource<List<Planet>>> = _state

    init {
        fetchPlanets()
    }

    fun fetchPlanets() {
        viewModelScope.launch {
            _state.value = Resource.Loading
            val res = repository.getPlanets()
            _state.value = if (res.isSuccess) Resource.Success(res.getOrDefault(emptyList()))
            else Resource.Error(res.exceptionOrNull()?.localizedMessage ?: "Unknown error")
        }
    }
}
