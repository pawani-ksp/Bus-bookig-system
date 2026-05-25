package com.example.busbookingsystem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        val name = findViewById<EditText>(R.id.etRegisterName)
        val phone = findViewById<EditText>(R.id.etRegisterPhone)
        val email = findViewById<EditText>(R.id.etRegisterEmail)
        val password = findViewById<EditText>(R.id.etRegisterPassword)
        val registerButton = findViewById<Button>(R.id.btnRegister)

        registerButton.setOnClickListener {
            val userName = name.text.toString()
            val userPhone = phone.text.toString()
            val userEmail = email.text.toString()
            val userPassword = password.text.toString()

            if (userName.isEmpty() || userPhone.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Register button clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}