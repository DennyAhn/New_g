package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PostActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post3)

        val textView: TextView = findViewById(R.id.tv_post3)
        textView.text = "게시물 예시입니다3."
        val reviewButton: Button = findViewById(R.id.bt_review3)
        reviewButton.text = "Review"
        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewActivity3::class.java))
        }
        val payButton: Button = findViewById(R.id.bt_pay3)
        payButton.text = "Pay"
        payButton.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }
}