package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_list)

        val reviewButton: Button = findViewById(R.id.bt_reviewPost)
        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewActivity2::class.java))
        }



    }
}
