package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flius.guidy.databinding.ActivityReviewListFBinding

class ReviewListActivity_F : AppCompatActivity() {

    private lateinit var binding: ActivityReviewListFBinding
    private lateinit var reviewAdapter: ReviewAdapter
    private lateinit var reviewList: MutableList<Review>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewListFBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val reviewButton: Button = findViewById(R.id.bt_reviewPost)
        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewActivity2::class.java))
        }
        // Sample data
        reviewList = mutableListOf(
            Review("아앙대니", "2024-05-20", 1, "냄새나요!"),
            Review("포스트말론", "2024-05-18", 5, "진정한 락스타")
            // Add more sample reviews as needed
        )

        reviewAdapter = ReviewAdapter(reviewList)
        binding.reviewRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.reviewRecyclerView.adapter = reviewAdapter
        binding.reviewRecyclerView.itemAnimator = null
    }

    data class Review(
        val author: String,
        val date: String,
        val rating: Int,
        val text: String
    )

    class ReviewAdapter(private val reviews: List<Review>) :
        RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)
            return ReviewViewHolder(view)
        }

        override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
            val review = reviews[position]
            holder.authorTextView.text = review.author
            holder.dateTextView.text = review.date
            holder.reviewRatingBar.rating = review.rating.toFloat()
            holder.reviewTextView.text = review.text
        }

        override fun getItemCount(): Int = reviews.size

        class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val authorTextView: TextView = itemView.findViewById(R.id.authorTextView)
            val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
            val reviewRatingBar: RatingBar = itemView.findViewById(R.id.reviewRatingBar)
            val reviewTextView: TextView = itemView.findViewById(R.id.reviewTextView)
        }
    }
}
