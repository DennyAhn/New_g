package com.flius.guidy

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ma : AppCompatActivity() {
    private lateinit var chatAdapter: ChatAdapter
    private val chatMessages = mutableListOf<ChatMessage>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // RecyclerView 설정
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView_chat)
        chatAdapter = ChatAdapter(chatMessages)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = chatAdapter

        // Send button click listener 설정
        val sendButton: Button = findViewById(R.id.sendButton)
        val messageInput: EditText = findViewById(R.id.messageInput)

        sendButton.setOnClickListener {
            // 메시지 전송 처리
            val message = messageInput.text.toString()
            if (message.isNotEmpty()) {
                // 메시지를 채팅 리스트에 추가하고 RecyclerView를 업데이트합니다.
                chatMessages.add(ChatMessage(message))
                chatAdapter.notifyItemInserted(chatMessages.size - 1)
                recyclerView.scrollToPosition(chatMessages.size - 1)
                messageInput.text.clear()
            }
        }

        // 샘플 데이터 추가
        chatMessages.addAll(getChatMessages())
        chatAdapter.notifyDataSetChanged()
    }

    private fun getChatMessages(): List<ChatMessage> {
        // 테스트를 위한 샘플 데이터
        return listOf(
            ChatMessage("Hi there!"),
            ChatMessage("Hello! How are you?"),
            ChatMessage("I'm good, thanks! What about you?")
        )
    }
}