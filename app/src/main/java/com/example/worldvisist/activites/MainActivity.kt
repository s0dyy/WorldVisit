package com.example.worldvisist.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.worldvisist.R

class MainActivity : AppCompatActivity() {

    lateinit var boutonAjouter : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialisation
        boutonAjouter = findViewById(R.id.buttonAjouter)

        // creation de notre intent
        val monIntent : Intent =  Intent(this,
            WorldCountryActivity::class.java)

        //clic sur le bouton
        boutonAjouter.setOnClickListener {
            startActivity(monIntent)
        }
    }
}