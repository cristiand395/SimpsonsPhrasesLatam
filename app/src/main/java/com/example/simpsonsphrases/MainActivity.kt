package com.example.simpsonsphrases

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer;
    var state = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Button1Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.ay_caramba_bart_bebe)
        mediaPlayer.start()
        state = true
    }
    fun Button2Click(view: View){
        if(mediaPlayer != null){
            mediaPlayer.stop()
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.barney_burp_simpsons)
        mediaPlayer.start()
    }
    fun Button3Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.dame10)
        mediaPlayer.start()
    }
    fun Button4Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.el_coco)
        mediaPlayer.start()
    }
    fun Button5Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.esto_se_va_a_poner_feo)
        mediaPlayer.start()
    }
    fun Button6Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.gorda_sientate)
        mediaPlayer.start()
    }
    fun Button7Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.gracias_vuelvas_prontos)
        mediaPlayer.start()
    }
    fun Button8Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.matanga)
        mediaPlayer.start()
    }
    fun Button9Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.me_encanta_la_comida)
        mediaPlayer.start()
    }
    fun Button10Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.me_quiero_volver_chango)
        mediaPlayer.start()
    }
    fun Button11Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.nelson_aha)
        mediaPlayer.start()
    }
    fun Button12Click(view: View){
        mediaPlayer = MediaPlayer.create(this, R.raw.soy_horrenda)
        mediaPlayer.start()
    }
}