package dev.beryl.safari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityFive : AppCompatActivity() {
    lateinit var btnButton: Button
    lateinit var btnBack5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        btnButton = findViewById(R.id.btnButton)
        btnBack5 = findViewById(R.id.btnBack5)

        btnButton.setOnClickListener {
            val intent = Intent(this, activityFive::class.java)
            startActivity(intent)
        }

        btnBack5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}








