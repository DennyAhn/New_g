package com.flius.guidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var tv_LoginEmail: EditText
    private lateinit var tv_LoginPassword: EditText
    private lateinit var bt_Login: Button
    private lateinit var bt_GoToSignUp: Button
    private lateinit var rg_UserType: RadioGroup
    private lateinit var bt_RadioLocal: RadioButton
    private lateinit var bt_RadioForeign: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_LoginEmail = findViewById(R.id.tv_LoginEmail)
        tv_LoginPassword = findViewById(R.id.tv_LoginPassword)
        bt_Login = findViewById(R.id.bt_Login)
        bt_GoToSignUp = findViewById(R.id.bt_GoToSignUp)
        rg_UserType = findViewById(R.id.rg_userType)
        bt_RadioLocal = findViewById(R.id.bt_radioLocal)
        bt_RadioForeign = findViewById(R.id.bt_radioForeign)

        bt_Login.setOnClickListener {
            val selectedUserType = rg_UserType.checkedRadioButtonId

            when (selectedUserType) {
                R.id.bt_radioLocal -> {
                    val intent = Intent(this, RegistrationActivity::class.java)
                    startActivity(intent)
                }
                R.id.bt_radioForeign -> {
                    val intent = Intent(this, RegistrationActivity_F::class.java)
                    startActivity(intent)
                }
            }
        }


        bt_GoToSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        }
    }
