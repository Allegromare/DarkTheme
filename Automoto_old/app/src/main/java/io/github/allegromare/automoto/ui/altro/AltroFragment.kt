package io.github.allegromare.automoto.ui.altro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.github.allegromare.automoto.R

class AltroFragment : Fragment() {

    private lateinit var altroViewModel: AltroViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        altroViewModel =
                ViewModelProviders.of(this).get(AltroViewModel::class.java)
        val root = inflater.inflate(R.layout.layout_fragment_altro, container, false)
        val textView: TextView = root.findViewById(R.id.text_altro)
        altroViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}