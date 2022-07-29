package com.example.tibiarank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.tibiarank.adapter.TibiaRankAdapter
import com.example.tibiarank.databinding.ActivityMainBinding
import com.example.tibiarank.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModdel = MainViewModel()
    lateinit var recyclerView: RecyclerView
    val adapterRank = TibiaRankAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.rvMain
        recyclerView.adapter = adapterRank

        viewModdel.data.observe(this) { lista ->
            Log.e("OK", lista.toString())
            adapterRank.addItems(lista)
        }
        viewModdel.getAllRank()


    }
}
