package com.example.recipebook.chats

import androidx.lifecycle.ViewModel
import com.example.recipebook.model.Chat

class ChatViewModel : ViewModel() {

    val chatData = listOf<Chat>(
        Chat("Adebayo Apercu","A selection of chicken dishes served together ...",""),
        Chat("Ronke Igboegwu","A selection of chicken dishes served together ...","")
        ,Chat("Ekaite Akande","A selection of chicken dishes served together ...",""),
        Chat("Adedunni Nwaneri","A selection of chicken dishes served together ...",""))


}
