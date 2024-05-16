package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // RecyclerView 설정
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PersonAdapter(getPersonList())

        // BottomNavigationView 변수 선언 및 초기화
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // 프로필 추가 Button 변수 선언 및 초기화
        val buttonIcon: ImageButton = findViewById(R.id.baseline_add)

        // BottomNavigationView의 아이템 선택 리스너 설정
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bt_message -> {
                    // 메시지 버튼 클릭 처리
                    val intent = Intent(this, ma::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bt_p -> {
                    // 프로필 버튼 클릭 처리
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bt_logout -> {
                    // 로그아웃 버튼 클릭 처리
                    showLogoutConfirmationDialog()
                    true
                }
                else -> false
            }
        }

        buttonIcon.setOnClickListener {
            val intent = Intent(this, Register_post::class.java)
            startActivity(intent)

        }
    }

    private fun getPersonList(): List<Person> {
        return listOf(
            Person("이름: 좁밥준상" ,
                    "나이: 23"+ "   성별: 남자"),
            Person("멸치민재", "Details about Jane"),
            Person("뿡뿡이기성", "Details about Sam"),
            // 추가 인물 데이터
        )
    }

    private fun showLogoutConfirmationDialog() {
        AlertDialog.Builder(this).apply {
            setTitle("로그아웃 확인")
            setMessage("정말로 로그아웃 하시겠습니까?")
            setNegativeButton("아니오") { dialog, _ ->
                dialog.dismiss()
            }
            setPositiveButton("예") { _, _ ->
                // 로그인 화면으로 이동
                val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }

            create()
            show()
        }
    }
}