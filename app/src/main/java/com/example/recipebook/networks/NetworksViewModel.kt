package com.example.recipebook.networks

import androidx.lifecycle.ViewModel
import com.example.recipebook.model.Product

class NetworksViewModel : ViewModel() {
   val products = listOf<Product>(
       Product("","Sausage & Peppers Group"),
       Product("","Strawberry Wonders"),
       Product("","Pro-bros"),
       Product("","Colours of strawberry"),
       Product("","Food fitfam"),
       Product("","Veges Gang"))
}
