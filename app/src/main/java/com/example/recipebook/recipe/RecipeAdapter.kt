package com.example.recipebook.recipe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.RecipeRecyclerItemViewBinding

class RecipeAdapter : ListAdapter<String,RecipeAdapter.RecipeViewHolder>(DiffCallback){

    class RecipeViewHolder(private val binding: RecipeRecyclerItemViewBinding)
        :RecyclerView.ViewHolder(binding.root){
        fun bind(currentRecipe: String){
            binding.recipe = currentRecipe
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecipeRecyclerItemViewBinding.inflate(layoutInflater)
        return RecipeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val currentRecipe = getItem(position)
        holder.bind(currentRecipe)
    }
}