package com.example.recipebook.friends

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.FriendsRecyclerItemViewBinding
import com.example.recipebook.model.Friend


class FriendAdapter: ListAdapter<Friend, FriendAdapter.FriendViewHolder>(DiffCallback) {

    class FriendViewHolder(private val binding: FriendsRecyclerItemViewBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(currentFriend: Friend){
            binding.friend = currentFriend
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Friend>(){
        override fun areItemsTheSame(oldItem: Friend, newItem: Friend): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Friend, newItem: Friend): Boolean {
            return oldItem.userName == newItem.userName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding  = FriendsRecyclerItemViewBinding.inflate(layoutInflater)
        return FriendViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val currentFriend = getItem(position)
        holder.bind(currentFriend)
    }
}