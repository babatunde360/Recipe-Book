package com.example.recipebook.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.databinding.NotificationRecyclerItemViewBinding
import com.example.recipebook.model.Notification

class NotificationAdapter():
    ListAdapter<Notification, NotificationAdapter.NotificationViewHolder>(DiffCallback) {

    class NotificationViewHolder(private var binding: NotificationRecyclerItemViewBinding):
    RecyclerView.ViewHolder(binding.root) {
    fun bind(currentNotification: Notification){
        binding.notification = currentNotification
        binding.executePendingBindings()
}

    }

    companion object DiffCallback: DiffUtil.ItemCallback<Notification>() {
        override fun areItemsTheSame(oldItem: Notification, newItem: Notification): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Notification, newItem: Notification): Boolean {
           return oldItem.message == newItem.message
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NotificationRecyclerItemViewBinding.inflate(layoutInflater)
        return NotificationViewHolder(binding)

    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
    val currentItem = getItem(position)
        holder.bind(currentItem)
    }
}