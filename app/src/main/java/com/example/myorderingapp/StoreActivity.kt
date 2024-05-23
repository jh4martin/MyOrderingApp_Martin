package com.example.myorderingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store) // This is for the layout xml file

        val buttonNext = findViewById<Button>(R.id.button)
        val radioButtonMale = findViewById<RadioButton>(R.id.radioButton)
        val radioButtonFemale = findViewById<RadioButton>(R.id.radioButton2)

        buttonNext.setOnClickListener {
            if (radioButtonMale.isChecked) {
                // Navigation for male UI
                val intent = Intent(this, MaleStore::class.java)
                startActivity(intent)
            } else if (radioButtonFemale.isChecked) {
                // Navigation for female UI
                val intent = Intent(this, FemaleStore::class.java)
                startActivity(intent)
            } else {
                // If neither male nor female is selected, it will display an error
                Toast.makeText(this@StoreActivity, "Please select a gender", Toast.LENGTH_SHORT).show()
            }
        }
    }
}