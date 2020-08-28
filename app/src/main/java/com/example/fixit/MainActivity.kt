package com.example.fixit

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val LogInButton : Button = findViewById(R.id.LogIn_btn)
      val UserEmail : EditText = findViewById(R.id.email_edtText)
      val TestEmail : String = "test@gmail.com"
       var ReturnEmail : String = ReferenceEmail(UserEmail,TestEmail).toString()

        LogInButton.setOnClickListener(){



            Toast.makeText(this, "${ReturnEmail}",Toast.LENGTH_SHORT).show()

        }



    }

    fun ReferenceEmail(UserEmail:TextView , TestEmail:String){

        var Result : Boolean = false

        if (UserEmail.text == TestEmail){

            Result = true

        }

    }

}