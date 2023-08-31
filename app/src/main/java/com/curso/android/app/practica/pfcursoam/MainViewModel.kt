package com.curso.android.app.practica.pfcursoam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.pfcursoam.Comparador

class MainViewModel: ViewModel() {
    val comparador: LiveData<Comparador> get() = _comparador
    private var _comparador = MutableLiveData<Comparador>(Comparador("Compara textos"))

    fun iguales() {
        val text = "Los textos son iguales"
        updateComparador(text)
    }

    fun distintos() {
        val text = "Los textos son distintos"
        updateComparador(text)
    }

    private fun updateComparador(text: String) {
        _comparador.value = Comparador(text)
    }
}