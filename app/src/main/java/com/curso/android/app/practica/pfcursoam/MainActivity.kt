package com.curso.android.app.practica.pfcursoam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.activity.viewModels
import com.curso.android.app.practica.pfcursoam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        mainViewModel.comparador.observe(this) {
            binding.textView.text = it.texto
        }

        binding.button.setOnClickListener {
            var texto1 = binding.editTextText.getText().toString()
            var texto2 = binding.editTextText2.getText().toString()

            if (texto1 == texto2) {
                mainViewModel.iguales()
            }
            else {
                mainViewModel.distintos()
            }
        }
    }




}