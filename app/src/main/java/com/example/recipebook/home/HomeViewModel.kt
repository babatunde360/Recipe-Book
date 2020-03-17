package com.example.recipebook.home

import androidx.lifecycle.ViewModel
import com.example.recipebook.model.Notification

class HomeViewModel : ViewModel() {
    var notificationData = listOf<Notification>(
        Notification("Adebayo Apercu sent you a message","Yesterday"),
        Notification("Oladele Tamilore replied your message","Monday 22 October"),
        Notification("20 People added your recipe as a favourite","Friday 19 October")
    )
}
