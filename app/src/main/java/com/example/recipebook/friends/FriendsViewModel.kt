package com.example.recipebook.friends

import androidx.lifecycle.ViewModel
import com.example.recipebook.R
import com.example.recipebook.model.Friend

class FriendsViewModel : ViewModel() {
    val friendData = listOf<Friend>(
        Friend("Adebayo Apercu","100K Friends", R.drawable.adebayo_apercu),
        Friend("Ronke Igboegwu","200 Friends",R.drawable.ronke_igboegwu)
        , Friend("Ekaite Akande","10K Friends",R.drawable.ekaite_akande),
        Friend("Adedunni Nwaneri","190 Friends",R.drawable.adedunni_nwaneri)
    )


}
