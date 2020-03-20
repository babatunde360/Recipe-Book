package com.example.recipebook.friends

import androidx.lifecycle.ViewModel
import com.example.recipebook.model.Friend

class FriendsViewModel : ViewModel() {
    val friendData = listOf<Friend>(
        Friend("Adebayo Apercu","100K Friends",""),
        Friend("Ronke Igboegwu","200 Friends","")
        , Friend("Ekaite Akande","10K Friends",""),
        Friend("Adedunni Nwaneri","190 Friends","")
    )


}
