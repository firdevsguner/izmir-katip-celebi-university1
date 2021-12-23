package com.ikcugdsc.gdscikcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomButton:Button = findViewById(R.id.random_button)
        val moviePoster:ImageView = findViewById(R.id.poster)
        val movieName:TextView = findViewById(R.id.movie_name)
        val pageBG:ImageView = findViewById(R.id.page_bg)

        randomButton.setOnClickListener {

            var randomNumber = (1..6).random()

            movieName.text = randomNumber.toString()

            when(randomNumber){
                1 -> {
                    pageBG.setImageResource(R.drawable.sniper)
                    movieName.text = "Sniper: Ghost Warrior 2"
                    moviePoster.setImageResource(R.drawable.sniper)
                }
                2 ->{
                    movieName.text = "Need for Speed: Underground 2"
                    pageBG.setImageResource(R.drawable.nfs)
                    moviePoster.setImageResource(R.drawable.nfs)
                }
                3 -> {
                    movieName.text = "The Sims 4"
                    pageBG.setImageResource(R.drawable.sims)
                    moviePoster.setImageResource(R.drawable.sims)
                }
                4 -> {
                    movieName.text = "Grand Theft Auto V"
                    pageBG.setImageResource(R.drawable.gta)
                    moviePoster.setImageResource(R.drawable.gta)
                }
                5 -> {
                    movieName.text = "Crash Bandicoot"
                    pageBG.setImageResource(R.drawable.crash)
                    moviePoster.setImageResource(R.drawable.crash)
                }
                else -> {
                    movieName.text = "Forza Horizon 4"
                    pageBG.setImageResource(R.drawable.forza)
                    moviePoster.setImageResource(R.drawable.forza)
                }
            }
        }






    }
}