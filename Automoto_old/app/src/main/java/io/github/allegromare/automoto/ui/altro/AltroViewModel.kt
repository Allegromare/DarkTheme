package io.github.allegromare.automoto.ui.altro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AltroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Altro in costruzione"
    }
    val text: LiveData<String> = _text
}