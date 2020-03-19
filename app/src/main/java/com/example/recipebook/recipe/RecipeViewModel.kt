package com.example.recipebook.recipe

import androidx.lifecycle.ViewModel

class RecipeViewModel : ViewModel() {

    val recipeData = listOf<String>("My Search history",
        "My favourite recipes","Easy Mexican Casserole","Thai Chicken Balls",
        "Honey Mustard Pork Chops","Salsa Chicken Rice Casserole","Banana Cinnamon Roll Casserole")

}
