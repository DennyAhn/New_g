package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PostCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postcheck)

        val name = intent.getStringExtra(EXTRA_NAME)
        val details = intent.getStringExtra(EXTRA_DETAILS)

        val nameTextView: TextView = findViewById(R.id.tv_profilename)
        val detailsTextView: TextView = findViewById(R.id.tv_profiledetail5)

        nameTextView.text = name
        detailsTextView.text = details



        val reviewButton: Button = findViewById(R.id.bt_review1)
        reviewButton.text = "Review"
        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewListActivity::class.java))
            //게시물올린 사람에 따라서 이동하는 리뷰페이지가 달라져야함
        }

    }

    companion object {
        const val EXTRA_NAME = "com.flius.guidy.EXTRA_NAME"
        const val EXTRA_DETAILS = "com.flius.guidy.EXTRA_DETAILS"
    }
}