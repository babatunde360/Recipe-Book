package com.example.recipebook.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recipebook.MarginItemDecoration
import com.example.recipebook.databinding.FavouriteFragmentBinding

class FavouriteFragment : Fragment() {

    companion object {
        fun newInstance() = FavouriteFragment()
    }

    private lateinit var viewModel: FavouriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FavouriteFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)
        binding.viewmodel = viewModel
        binding.favouriteRecyclerView.apply {
            adapter = FavouriteAdapter()
            layoutManager = GridLayoutManager(context,2)
            addItemDecoration(MarginItemDecoration(10))
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
