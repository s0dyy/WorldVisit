package com.example.worldvisist.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.worldvisist.R
import com.example.worldvisist.webservice.RetourWSCountries
import com.example.worldvisist.webservice.RetrofitSingleton
import com.example.worldvisist.webservice.WSInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random

class WorldCountryActivity : AppCompatActivity() {

    lateinit var buttonSelectionner : Button
    // Retrofit :
    private val serviceRetrofit = RetrofitSingleton.retrofit.create(WSInterface::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_country)

        loadCountries();

        //initialisation
        buttonSelectionner = findViewById(R.id.buttonSelectionner)


        // creation de notre intent
        val monIntentRetour : Intent =  Intent(this,
            InsertCountryActivity::class.java)

        //clic sur le bouton
        buttonSelectionner.setOnClickListener {
            startActivity(monIntentRetour)
        }
    }


    fun loadCountries() {

        // appel au webservice :
        val call = serviceRetrofit.getCountries()
        call.enqueue(object : Callback<RetourWSCountries>
        {
            override fun onResponse(call: Call<RetourWSCountries>, response: Response<RetourWSCountries>)
            {
                if (response.isSuccessful)
                {
                    val retourWSCountries = response.body()
                    retourWSCountries?.results?.let { liste ->

                        // récupération d'un pays au hasard :
                        val pays = liste[Random.nextInt(0, liste.size)]

                        Log.d("tag", pays.toString())
                    }
                }
            }

            override fun onFailure(call: Call<RetourWSCountries>, t: Throwable)
            {
                Log.d("error", t.message.toString())
            }

        })


    }


}