package dev.beryl.safari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activitylast : AppCompatActivity() {
    lateinit var btnBacklast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitylast)

        btnBacklast = findViewById(R.id.btnBacklast)

        btnBacklast.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

    }
 }
}

