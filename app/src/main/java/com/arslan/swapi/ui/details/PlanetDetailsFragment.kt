package com.arslan.swapi.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import coil.load
import com.arslan.swapi.R

// Details page of planet
class PlanetDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_planet_details, container, false)

        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvOrbital = view.findViewById<TextView>(R.id.tvOrbital)
        val tvGravity = view.findViewById<TextView>(R.id.tvGravity)
        val ivBack = view.findViewById<ImageView>(R.id.btnBack)

        val name = arguments?.getString("arg_name") ?: "Unknown"
        val orbital = arguments?.getString("arg_orbital") ?: "---"
        val gravity = arguments?.getString("arg_gravity") ?: "---"

        tvName.text = name
        tvOrbital.text = "Orbital Period: $orbital"
        tvGravity.text = "Gravity: $gravity"

        val imageUrl = "https://picsum.photos/seed/$name/600/400"
        imageView.load(imageUrl)

        ivBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return view
    }
}
