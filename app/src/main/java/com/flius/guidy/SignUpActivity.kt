package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var bt_SignUpConfirm1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        bt_SignUpConfirm1 = findViewById(R.id.bt_SignUpConfirm1)
        bt_SignUpConfirm1.setOnClickListener {

            val intent = Intent(this, setProfile::class.java)
            startActivity(intent)
        }
    }
}