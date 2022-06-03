package org.metapx.kotlinchangeactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSecondActivity = findViewById<Button>(R.id.button_second_activity)
        buttonSecondActivity.setOnClickListener {
            val secondActivityIntent = Intent(
                applicationContext, SecondActivity::class.java
            )
            startActivity(secondActivityIntent)
        }

    }
}