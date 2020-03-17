package com.example.recipebook.home

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.model.Notification

@BindingAdapter("notificationData")
fun bindRecyclerView(recyclerView:RecyclerView,data:List<Notification>){
val adapter = recyclerView.adapter as NotificationAdapter
    adapter.submitList(data)
}