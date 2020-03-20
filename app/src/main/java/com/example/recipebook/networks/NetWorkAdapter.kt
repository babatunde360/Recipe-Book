package com.example.recipebook.networks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.NetworksRecyclerItemViewBinding
import com.example.recipebook.model.Product

class NetWorkAdapter : ListAdapter<Product, NetWorkAdapter.NetWorkViewHolder>(DiffCallback){
    class NetWorkViewHolder(val binding: NetworksRecyclerItemViewBinding):
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NetWorkViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NetworksRecyclerItemViewBinding.inflate(layoutInflater)
        return NetWorkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NetWorkViewHolder, position: Int) {
        val currentProduct = getItem(position)
        holder.bind(currentProduct)
    }
}