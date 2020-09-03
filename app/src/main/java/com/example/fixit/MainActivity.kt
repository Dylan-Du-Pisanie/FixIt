package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val signupbtn : Button = findViewById(R.id.signup_btn)

        signupbtn.setOnClickListener(){
            OpenSignUp()
        }

        val loginbtn : Button = findViewById(R.id.LogIn_btn)

        loginbtn.setOnClickListener(){
            OpenMainScreen()
        }

    }

    private fun OpenMainScreen() {
        val openMain = Intent(this, MainScreen::class.java)
        startActivity(openMain)
    }

    private fun OpenSignUp() {
        val openSignUp = Intent(this, SignUpActivity::class.java)
        startActivity(openSignUp)
    }



}



















