package com.example.recipebook.friends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipebook.databinding.FriendsFragmentBinding
import kotlinx.android.synthetic.main.friends_fragment.*

class FriendsFragment : Fragment() {

    companion object {
        fun newInstance() = FriendsFragment()
    }

    private lateinit var viewModel: FriendsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FriendsFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this).get(FriendsViewModel::class.java)
        binding.viewModel = viewModel
binding.friendsRecyclerView.apply {
    adapter = FriendAdapter()
    layoutManager = LinearLayoutManager(context)

}

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        NavigationUI.setupWithNavController(networks_fragment_toolbar,findNavController())

    }

}
