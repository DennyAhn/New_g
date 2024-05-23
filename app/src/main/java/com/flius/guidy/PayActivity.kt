package com.flius.guidy


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PayActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etCardNumber: EditText
    private lateinit var etExpiryDate: EditText
    private lateinit var etCvv: EditText
    private lateinit var btnPay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pay)


        etName = findViewById(R.id.et_name)
        etEmail = findViewById(R.id.et_email)
        etCardNumber = findViewById(R.id.et_card_number)
        etExpiryDate = findViewById(R.id.et_expiry_date)
        etCvv = findViewById(R.id.et_cvv)
        btnPay = findViewById(R.id.btn_pay)

        btnPay.setOnClickListener {
            processPayment()
        }
    }

    private fun processPayment() {
        val name = etName.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val cardNumber = etCardNumber.text.toString().trim()
        val expiryDate = etExpiryDate.text.toString().trim()
        val cvv = etCvv.text.toString().trim()

        //결제 텍스트가 비어있는 경우와 채워진 경우
        if (name.isEmpty() || email.isEmpty() || cardNumber.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            return
        }

        // 결제 처리 로직
        Toast.makeText(this, "Payment Successful", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, ma::class.java))
    }
}
