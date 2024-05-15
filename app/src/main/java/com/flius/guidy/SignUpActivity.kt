package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var bt_SignUpConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        bt_SignUpConfirm = findViewById(R.id.bt_SignUpConfirm)
        bt_SignUpConfirm.setOnClickListener {
            // 등록 페이지로 이동
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}