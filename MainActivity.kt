package com.example.temperatura

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{

            if(binding.editCelsius.text.toString().isNotEmpty()) {

                val celsius = binding.editCelsius.text.toString().toDouble()

                val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.textView.text = "$fahrenheit 'F"
            } else {
                binding.textView.text = "Temperatura Invalida"
            }

            }
        }
    }