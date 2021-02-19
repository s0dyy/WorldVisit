package com.example.worldvisist.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.worldvisist.R
import com.example.worldvisist.webservice.RetourWSCountry
import com.example.worldvisist.webservice.RetrofitSingleton
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WorldCountryActivity : AppCompatActivity() {

    private var listFront: ArrayList<RetourWSCountry> = ArrayList()

    lateinit var buttonSelectionner : Button

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
        val recycler = findViewById<RecyclerView>(R.id.allCountry)
        recycler.setHasFixedSize(true)

        val layoutManager = LinearLayoutManager(this)
        recycler.layoutManager = layoutManager

        RetrofitSingleton.getClient.getCountries().enqueue(object : Callback<List<RetourWSCountry>> {
            override fun onResponse(call: Call<List<RetourWSCountry>>?, response: Response<List<RetourWSCountry>>?) {
                listFront.addAll(response!!.body()!!)
            }

            override fun onFailure(call: Call<List<RetourWSCountry>>?, t: Throwable) {
                Log.d("error", t.message.toString())
            }
        })


    }


}