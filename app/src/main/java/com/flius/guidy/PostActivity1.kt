package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PostActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post1)

        val textView: TextView = findViewById(R.id.tv_post1)
        textView.text = "게시물 예시입니다1."
        val reviewButton: Button = findViewById(R.id.bt_review1)
        reviewButton.text = "Review"
        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewActivity1::class.java))
        }
        val payButton: Button = findViewById(R.id.bt_pay1)
        payButton.text = "Pay"
        payButton.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }
}