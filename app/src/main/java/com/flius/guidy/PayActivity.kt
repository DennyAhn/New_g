package com.flius.guidy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        val textView: TextView = findViewById(R.id.tv_pay1)
        textView.text = "결제 페이지 예시입니다."
    }
}
