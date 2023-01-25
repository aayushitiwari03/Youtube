package com.example.youtube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SplashActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        img=findViewById(R.id.imageView)
        txt=findViewById(R.id.text)

        img.alpha=0f
        img.animate().setDuration(1500).alpha(1f).withEndAction(){
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        txt.alpha=0f
        txt.animate().setDuration(1500).alpha(1f).withEndAction(){
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}