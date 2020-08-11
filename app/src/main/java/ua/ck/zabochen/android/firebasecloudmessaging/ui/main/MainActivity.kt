package ua.ck.zabochen.android.firebasecloudmessaging.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import ua.ck.zabochen.android.firebasecloudmessaging.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getToken()
    }

    private fun getToken() {
        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.i("MainActivity", "getToken: Exception")
                return@addOnCompleteListener
            }

            val token = task.result?.token
            Log.i("MainActivity", "getToken: ${token ?: "null"}")
        }
    }
}