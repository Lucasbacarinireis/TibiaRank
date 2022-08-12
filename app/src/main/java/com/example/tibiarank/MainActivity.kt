package com.example.tibiarank

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tibiarank.databinding.ActivityMainBinding
import com.example.tibiarank.fragments.Imbuiment
import com.example.tibiarank.fragments.Rank

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //    private val viewModdel = MainViewModel()
//    lateinit var recyclerView: RecyclerView
//    val adapterRank = TibiaRankAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val progressBar = binding.progressBar
//        progressBar.max = 1000
//
//        val currentProgress = 600
//
//        ObjectAnimator.ofInt(progressBar,"progress", currentProgress)
//            .setDuration(2000)
//            .start()

//        recyclerView = binding.rvMain
//        recyclerView.adapter = adapterRank

//        viewModdel.data.observe(this) { lista ->
//            Log.e("OK", lista.toString())
//            adapterRank.addItems(lista)
//        }
//        viewModdel.getAllRank()

        replaceFragment(Rank())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(Rank())
                R.id.imbuiment -> replaceFragment(Imbuiment())

                else -> {

                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frame_layout, fragment)
        fragmentTransition.commit()

    }




    }
