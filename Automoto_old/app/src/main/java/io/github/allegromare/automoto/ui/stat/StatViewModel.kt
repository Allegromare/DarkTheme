package io.github.allegromare.automoto.ui.stat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Statistiche in costruzione"
    }
    val text: LiveData<String> = _text
}