package dev.beryl.safari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityFour : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnBack2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        btnNext2 = findViewById(R.id.btnNext2)
        btnBack2 = findViewById(R.id.btnBack2)

        btnNext2.setOnClickListener {
            val intent = Intent(this, activityFive::class.java)
            startActivity(intent)


            btnBack2.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}