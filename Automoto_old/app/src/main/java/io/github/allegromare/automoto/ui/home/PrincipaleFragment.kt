package io.github.allegromare.automoto.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import io.github.allegromare.automoto.R
import kotlinx.android.synthetic.main.layout_fragment_principale.*
import kotlinx.android.synthetic.main.layout_fragment_principale.view.*

class PrincipaleFragment : Fragment() {

    private lateinit var homeViewModel: PrincipaleViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val principaleViewModel =
                ViewModelProviders.of(this).get(PrincipaleViewModel::class.java)
        val root = inflater.inflate(R.layout.layout_fragment_principale, container, false)
        val textView: TextView = root.findViewById(R.id.text_principale)
        principaleViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        // Click su voci
        root.km_bottone.setOnClickListener { Navigation.findNavController(root).navigate(R.id.action_navigation_home_to_navigation_km)  }

        return root
    }
}