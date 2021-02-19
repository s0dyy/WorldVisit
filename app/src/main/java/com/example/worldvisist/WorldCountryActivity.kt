package com.example.worldvisist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WorldCountryActivity : AppCompatActivity() {

    //Declaration de mon bouton
    lateinit var buttonSelectionner : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_country)

        //initialisation
        buttonSelectionner = findViewById(R.id.buttonSelectionner)


        // creation de notre intent
        val monIntentRetour : Intent =  Intent(this,InsertCountryActivity::class.java)

        //clic sur le bouton
        buttonSelectionner.setOnClickListener {
            startActivity(monIntentRetour)
        }
    }
}