package com.example.recipebook.networks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recipebook.databinding.NetworksFragmentBinding
import kotlinx.android.synthetic.main.networks_fragment.*


class NetworksFragment : Fragment() {

    companion object {
        fun newInstance() = NetworksFragment()
    }

    private lateinit var viewModel: NetworksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = NetworksFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(NetworksViewModel::class.java)
        binding.viewmodel = viewModel
        binding.networksRecyclerView.apply {
            adapter = NetWorkAdapter()
            layoutManager = GridLayoutManager(context,2)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        NavigationUI.setupWithNavController(networks_fragment_toolbar,findNavController())

    }

}
