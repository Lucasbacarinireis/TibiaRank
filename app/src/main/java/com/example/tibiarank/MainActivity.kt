package com.example.tibiarank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.tibiarank.databinding.ActivityMainBinding
import com.example.tibiarank.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModdel = MainViewModel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModdel.data.observe(this) { lista ->
            Log.e("OK", lista.toString())
        }
        viewModdel.getAllRank()



    }
}
