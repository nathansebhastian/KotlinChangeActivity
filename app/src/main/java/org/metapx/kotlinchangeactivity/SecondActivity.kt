package org.metapx.kotlinchangeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonMainActivity = findViewById<Button>(R.id.button_main_activity)
        buttonMainActivity.setOnClickListener {
            val secondActivityIntent = Intent(
                applicationContext, MainActivity::class.java
            )
            startActivity(secondActivityIntent)
        }
    }
}