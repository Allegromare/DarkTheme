package io.github.allegromare.automoto.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrincipaleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Questo è il fragment principale"
    }
    val text: LiveData<String> = _text
}