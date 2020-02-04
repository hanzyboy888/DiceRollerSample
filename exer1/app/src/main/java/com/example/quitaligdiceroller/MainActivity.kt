package com.example.quitaligdiceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var checkText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        checkText = findViewById(R.id.roll_test_text)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }

//        val countUpButton: Button = findViewById(R.id.count_up_id)
//        countUpButton.setOnClickListener { countUpDice() }
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()

//        val diceImage: ImageView = findViewById(R.id.dice_image)
//        val checkText: TextView = findViewById(R.id.roll_test_text)

        val randomInt = (1..6).random()
        val drawableResources = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)
        checkText.text = getString(R.string.roll_success_text)
    }

    private fun resetDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = getString(R.string.result_text)

//        val diceImage: ImageView = findViewById(R.id.dice_image)
//        val checkText: TextView = findViewById(R.id.roll_test_text)

        diceImage.setImageResource(R.drawable.empty_dice)
        checkText.text = getString(R.string.roll_text)
    }

//    private fun countUpDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        val checkText: TextView = findViewById(R.id.roll_test_text)
//
//        if (resultText.text == getString(R.string.result_text)) {
//            resultText.text = getString(R.string.one)
//        } else if (resultText.text != getString(R.string.six)) {
//            var testInt: Int = parseInt(resultText.text.toString())
//            testInt++
//            resultText.text = testInt.toString()
//        } else if (resultText.text == getString(R.string.six)) {
//            checkText.text = getString(R.string.count_max)
//        }
//
//    }
}