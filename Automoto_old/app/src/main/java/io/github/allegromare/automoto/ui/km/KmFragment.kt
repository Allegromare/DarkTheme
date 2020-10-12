package io.github.allegromare.automoto.ui.km

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.allegromare.automoto.R

class KmFragment : Fragment() {

    companion object {
        fun newInstance() = KmFragment()
    }

    private lateinit var viewModel: KmViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_km, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(KmViewModel::class.java)
        // TODO: Use the ViewModel
    }

}