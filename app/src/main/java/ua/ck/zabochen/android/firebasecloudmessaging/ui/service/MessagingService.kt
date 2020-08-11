package ua.ck.zabochen.android.firebasecloudmessaging.ui.service

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.i("MessagingService", "onMessageReceived: ")
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // Update token on server
        Log.i("MessagingService", "onNewToken: $token")
    }
}