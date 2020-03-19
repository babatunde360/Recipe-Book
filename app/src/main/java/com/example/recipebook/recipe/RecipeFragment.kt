package com.example.recipebook.recipe

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipebook.R
import com.example.recipebook.databinding.RecipeFragmentBinding
import kotlinx.android.synthetic.main.recipe_fragment.*

class RecipeFragment : Fragment() {

    companion object {
        fun newInstance() = RecipeFragment()
    }

    private lateinit var viewModel: RecipeViewModel

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)
        val binding = RecipeFragmentBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val dividerDrawable = context?.getDrawable(R.drawable.drawable_divider)
        val dividerItemDecoration = DividerItemDecoration(context,DividerItemDecoration.HORIZONTAL)
        if (dividerDrawable != null) {
            dividerItemDecoration.setDrawable(dividerDrawable)
        }
        binding.recipeRecyclerView.apply {
            adapter = RecipeAdapter()
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(dividerItemDecoration)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        NavigationUI.setupWithNavController(recipe_fragment_toolbar,findNavController())

    }

}
