package com.example.recipebook.favourite
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.FavouriteRecyclerItemViewBinding
import com.example.recipebook.model.Product

class FavouriteAdapter : ListAdapter<Product, FavouriteAdapter.FavouriteViewHolder>(DiffCallback){
    class FavouriteViewHolder(val binding: FavouriteRecyclerItemViewBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(currentProduct: Product){
            binding.product = currentProduct
            binding.executePendingBindings()
        }
    }
    companion object DiffCallback: DiffUtil.ItemCallback<Product>(){
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.title == newItem.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = FavouriteRecyclerItemViewBinding.inflate(layoutInflater)
        return FavouriteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        val currentProduct = getItem(position)
        holder.bind(currentProduct)
    }
}