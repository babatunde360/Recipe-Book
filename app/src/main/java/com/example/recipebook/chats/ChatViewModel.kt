package com.example.recipebook.chats

import androidx.lifecycle.ViewModel
import com.example.recipebook.R
import com.example.recipebook.model.Chat

class ChatViewModel : ViewModel() {

    val chatData = listOf<Chat>(
        Chat("Adebayo Apercu",
            "A selection of chicken dishes served together ...", R.drawable.adebayo_apercu),
        Chat("Ronke Igboegwu",
            "A selection of chicken dishes served together ...",R.drawable.ronke_igboegwu)
        ,Chat("Ekaite Akande",
            "A selection of chicken dishes served together ...",R.drawable.ekaite_akande),
        Chat("Adedunni Nwaneri",
            "A selection of chicken dishes served together ...",R.drawable.adedunni_nwaneri))


}
