package com.example.myorderingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is for the app to click on to the Enter Store button
        val enterStoreButton = findViewById<Button>(R.id.enterStoreButton)
        enterStoreButton.setOnClickListener {
            // This is for the function of the Enter Store button to be moved to the next page
            val intent = Intent(/* packageContext = */ this, /* cls = */ com.example.myorderingapp.StoreActivity::class.java)
            startActivity(intent)
        }
    }
}