package com.example.worldvisist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WorldCountryActivity : AppCompatActivity() {

    //Declaration de mon bouton
    lateinit var buttonInserer : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_country)

        //initialisation
        buttonInserer = findViewById(R.id.buttonInserer)


        // creation de notre intent
        val monIntentRetour : Intent =  Intent(this,MainActivity::class.java)

        //clic sur le bouton
        buttonInserer.setOnClickListener {
            startActivity(monIntentRetour)
        }
    }
}