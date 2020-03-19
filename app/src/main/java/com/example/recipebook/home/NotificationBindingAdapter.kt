package com.example.recipebook.home

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.chats.ChatAdapter
import com.example.recipebook.model.Chat
import com.example.recipebook.model.Notification
import com.example.recipebook.recipe.RecipeAdapter

@BindingAdapter("notificationData")
fun bindRecyclerView(recyclerView:RecyclerView,data:List<Notification>){
val adapter = recyclerView.adapter as NotificationAdapter
    adapter.submitList(data)
}
@BindingAdapter("recipeData")
fun bindRecipeRecyclerView(recyclerView:RecyclerView,data:List<String>){
val adapter = recyclerView.adapter as RecipeAdapter
    adapter.submitList(data)
}

@BindingAdapter("chatData")
fun bindChatRecyclerView(rv:RecyclerView,data:List<Chat>){
    val adapter = rv.adapter as ChatAdapter
    adapter.submitList(data)
}