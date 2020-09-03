package com.example.fixit

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MapStyleOptions


class MainScreen : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var drawerlayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val menuBtn = findViewById<ImageView>(R.id.menu_btn)
         drawerlayout = findViewById<DrawerLayout>(R.id.DrawerLayout)


        menuBtn.setOnClickListener() {

            drawerlayout.openDrawer(Gravity.LEFT)

        }

        val requestBtn : Button = findViewById(R.id.request_btn)

        requestBtn.setOnClickListener(){

            val openServiceReq = Intent(this, request_service::class.java)
            startActivity(openServiceReq)

        }



    }



    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        try {

            val success = googleMap.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    this, R.raw.map_style
                )
            )

            if (!success) {
                Log.e("MapsActivity", "Style parsing failed.")
            }
        } catch (e: Resources.NotFoundException) {
            Log.e("MapsActivity", "Can't find style. Error: ", e)
        }

        mMap.uiSettings.isCompassEnabled = false


    }


}








