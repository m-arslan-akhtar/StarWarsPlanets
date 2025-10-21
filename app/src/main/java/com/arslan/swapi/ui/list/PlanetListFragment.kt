package com.arslan.swapi.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import coil.compose.AsyncImage
import com.arslan.swapi.R
import com.arslan.swapi.data.model.Planet
import com.arslan.swapi.ui.details.PlanetDetailsFragment
import com.arslan.swapi.util.Resource
import dagger.hilt.android.AndroidEntryPoint

// Planet Lists screen
@AndroidEntryPoint
class PlanetListFragment : Fragment() {

    private val viewModel: PlanetListViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val state by viewModel.state.collectAsState()

                when (state) {
                    is Resource.Loading -> {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator()
                        }
                    }
                    is Resource.Success<*> -> {
                        val planets = (state as Resource.Success<List<Planet>>).data
                        PlanetList(planets = planets, onClick = { planet ->
                            val bundle = Bundle().apply {
                                putString("arg_name", planet.name)
                                putString("arg_orbital", planet.orbitalPeriod)
                                putString("arg_gravity", planet.gravity)
                            }
                            parentFragmentManager.beginTransaction()
                                .replace(R.id.fragment_container, PlanetDetailsFragment().apply { arguments = bundle })
                                .addToBackStack(null)
                                .commit()
                        })
                    }
                    is Resource.Error -> {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text(text = "Error: ${(state as Resource.Error).message}")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PlanetList(planets: List<Planet>, onClick: (Planet) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(planets) { planet ->
            PlanetCard(planet = planet, onClick = { onClick(planet) })
        }
    }
}

@Composable
fun PlanetCard(planet: Planet, onClick: () -> Unit) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .clickable { onClick() }, elevation = 6.dp) {
        Row(modifier = Modifier.padding(12.dp)) {
            AsyncImage(
                model = "https://picsum.photos/seed/${planet.name}/200/200",
                contentDescription = "planet image",
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = planet.name, style = MaterialTheme.typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Climate: ${planet.climate}", style = MaterialTheme.typography.body2)
            }
        }
    }
}
