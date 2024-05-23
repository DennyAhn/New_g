package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val saveButton: Button = findViewById(R.id.profile_save_button)
        saveButton.setOnClickListener {
            val intent = Intent(this, ProfileEdit::class.java)
            startActivity(intent)
        }
    }
}