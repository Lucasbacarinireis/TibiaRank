package com.example.tibiarank.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tibiarank.R
import com.example.tibiarank.adapter.TibiaRankAdapter
import com.example.tibiarank.databinding.FragmentRankBinding
import com.example.tibiarank.viewmodel.MainViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [Rank.newInstance] factory method to
 * create an instance of this fragment.
 */
class Rank : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentRankBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterRank: TibiaRankAdapter
    private val viewModdel = MainViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rank, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Rank.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Rank().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val progressBar = view.findViewById<ProgressBar>(R.id.progress_bar)
//        progressBar.max = 1000
//
//        val currentProgress = 600
//
//        ObjectAnimator.ofInt(progressBar,"progress", currentProgress)
//            .setDuration(2000)
//            .start()

        val layoutManager = LinearLayoutManager(context)

        recyclerView = view.findViewById(R.id.rv_main)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapterRank = TibiaRankAdapter()
        recyclerView.adapter = adapterRank
        viewModdel.data.observe(viewLifecycleOwner) { lista ->
            Log.e("OK", lista.toString())
            adapterRank.addItems(lista)
        }
        viewModdel.getAllRank()
    }
}