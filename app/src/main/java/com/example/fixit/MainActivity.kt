package com.example.fixit

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_log_in.*
import kotlinx.android.synthetic.main.fragment_sign_up.*

class MainActivity : AppCompatActivity() {
    lateinit var signupFragment: fragment_sign_up
    lateinit var logInFragment: LogInFragment

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logInFragment = LogInFragment()
        signupFragment = fragment_sign_up()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, logInFragment)
            commit()

        }


    }


         override fun onResume() {
            super.onResume()
             fun SignUpClick() {
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, signupFragment)
                     .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                     .commit()
                 }

             fun backToLogIn(){
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, logInFragment)
                     .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                     .commit()

             }

             backToLogIn_imgbtn.setOnClickListener(){

                 backToLogIn()
             }


            signup_btn.setOnClickListener() {

                SignUpClick()
            }


            }

}

















