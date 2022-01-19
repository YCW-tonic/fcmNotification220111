package com.tonic.fcmnotification220111

import android.app.PendingIntent
import android.content.Intent
import com.google.firebase.messaging.FirebaseMessagingService


class MyFirebaseMessagingService : FirebaseMessagingService() { //MyFirebaseMessagingService繼承自FirebaseMessagingService
    fun generateNotification(title: String, message: String){
        val intent = Intent(this, MainActivity::class.java)//click notification後jump to MainActivity
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)//clear all the activities and activity stack and put the current activity at the top

        val pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT)
    }
}


