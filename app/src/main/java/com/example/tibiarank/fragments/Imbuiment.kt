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
import com.example.tibiarank.adapter.TibiaItemAdapter
import com.example.tibiarank.databinding.ActivityMainBinding
import com.example.tibiarank.viewmodel.ItemsViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Imbuiment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Imbuiment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView2: RecyclerView
    private lateinit var adapterItem: TibiaItemAdapter
    private val viewModdel2 = ItemsViewModel()



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
        return inflater.inflate(R.layout.fragment_imbuiment, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Imbuiment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Imbuiment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        recyclerView2 = view.findViewById(R.id.rv_main2)
        recyclerView2.layoutManager = layoutManager
        recyclerView2.setHasFixedSize(true)
        adapterItem = TibiaItemAdapter()
        recyclerView2.adapter = adapterItem
        viewModdel2.data.observe(viewLifecycleOwner) { it
            Log.e("OK", it.toString())
//            adapterItem.addItems(it)


        }
        viewModdel2.getItems()
    }
}