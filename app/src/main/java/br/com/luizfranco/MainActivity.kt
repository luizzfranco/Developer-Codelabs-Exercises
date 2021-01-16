package br.com.luizfranco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn = findViewById<Button>(R.id.btn)
        rollBtn.setOnClickListener {rollDice()}

        diceImage = findViewById<ImageView>(R.id.dice_image)
        diceImage2 = findViewById<ImageView>(R.id.dice_image2)

    }

        private fun getRandomDiceImage(): Int {
            return when ((1..6).random()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        }

        private fun rollDice() {
            diceImage.setImageResource(getRandomDiceImage())
            diceImage2.setImageResource(getRandomDiceImage())
        }
 }


