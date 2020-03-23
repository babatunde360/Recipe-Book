package com.example.recipebook.home

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recipebook.chats.ChatAdapter
import com.example.recipebook.favourite.FavouriteAdapter
import com.example.recipebook.friends.FriendAdapter
import com.example.recipebook.model.Chat
import com.example.recipebook.model.Friend
import com.example.recipebook.model.Notification
import com.example.recipebook.model.Product
import com.example.recipebook.networks.NetWorkAdapter
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
@BindingAdapter("friendData")
fun bindFriendRecyclerView(rv:RecyclerView, data:List<Friend>){
    val adapter = rv.adapter as FriendAdapter
    adapter.submitList(data)
}
@BindingAdapter("favouriteData")
fun bindFavouriteRecyclerView(rv:RecyclerView, data:List<Product>){
    val adapter = rv.adapter as FavouriteAdapter
    adapter.submitList(data)
}

@BindingAdapter("networkData")
fun bindNetworkRecyclerView(rv:RecyclerView, data: List<Product>){
    val adapter = rv.adapter as NetWorkAdapter
    adapter.submitList(data)
}

@BindingAdapter("movieImage")
fun bindImage(imageView: ImageView, imageUrl: Int?){
    imageUrl?.let{
        Glide.with(imageView.context)
            .load(it)
            .apply(
                RequestOptions().override(140,140))
            .into(imageView)
    }
}

@BindingAdapter("networkImage")
fun bindNetworkImage(imageView: ImageView, imageUrl: Int?){
    imageUrl?.let{
        Glide.with(imageView.context)
            .load(it)
            .apply(
                RequestOptions().override(140,140))
            .into(imageView)
    }
}