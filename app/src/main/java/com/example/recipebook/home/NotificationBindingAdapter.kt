package com.example.recipebook.home

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
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