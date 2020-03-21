package com.example.recipebook.networks

import androidx.lifecycle.ViewModel
import com.example.recipebook.R
import com.example.recipebook.model.Product

class NetworksViewModel : ViewModel() {
   val products = listOf<Product>(
       Product(R.drawable.bitmap_sausage_peppers,"Sausage & Peppers Group"),
       Product(R.drawable.bitmap_strawberry_wonders,"Strawberry Wonders"),
       Product(R.drawable.bitmap_pro_bros,"Pro-bros"),
       Product(R.drawable.bitmap_colours_of_strawberry,"Colours of strawberry"),
       Product(R.drawable.bitmap_food_fitfam,"Food fitfam"),
       Product(R.drawable.bitmap_veges_gang,"Veges Gang"))
}
