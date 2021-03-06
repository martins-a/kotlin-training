package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiceRollerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        var resultText: TextView = findViewById(R.id.result_text)
        var randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }



}