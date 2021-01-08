package br.com.luizfranco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val randomInt = (1..6).random()
            tv.text = randomInt.toString()
        }

        btnUp.setOnClickListener {
            if (tv.text == "Roll the dice!") {
                tv.text = "1"
            }
            else {
                var result = tv.text.toString().toInt()
                if (result < 6) {
                    result += 1
                    tv.text = result.toString()
                }
            }
        }

    }
}

