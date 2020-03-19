package com.example.recipebook.chats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.ChatRecyclerItemViewBinding
import com.example.recipebook.model.Chat

class ChatAdapter:ListAdapter<Chat,ChatAdapter.ChatViewHolder>(DiffCallback) {

    class ChatViewHolder(private val binding: ChatRecyclerItemViewBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(currentChat: Chat){
            binding.chat = currentChat
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Chat>(){
        override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem.userName == newItem.userName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding  = ChatRecyclerItemViewBinding.inflate(layoutInflater)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
    val currentChat = getItem(position)
        holder.bind(currentChat)
    }
}