package com.flius.guidy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review2)

        val textView: TextView = findViewById(R.id.tv_review2)
        textView.text = "리뷰 페이지 예시입니다."
    }
}
