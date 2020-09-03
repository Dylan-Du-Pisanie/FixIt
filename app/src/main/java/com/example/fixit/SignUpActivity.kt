package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignUp : Button = findViewById(R.id.SignUp_btn)

        btnSignUp.setOnClickListener(){
            OpenLogIn()
        }
    }

    private fun OpenLogIn(){

        val openLogIn = Intent(this,MainActivity::class.java)
        startActivity(openLogIn)

    }
}