package com.flius.guidy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilecheck)

        val name = intent.getStringExtra(EXTRA_NAME)
        val details = intent.getStringExtra(EXTRA_DETAILS)

        val nameTextView: TextView = findViewById(R.id.profile_name)
        val detailsTextView: TextView = findViewById(R.id.profile_details)

        nameTextView.text = name
        detailsTextView.text = details
    }

    companion object {
        const val EXTRA_NAME = "com.flius.guidy.EXTRA_NAME"
        const val EXTRA_DETAILS = "com.flius.guidy.EXTRA_DETAILS"
    }
}