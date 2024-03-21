package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var likeCounter = 3199
        val likeView = findViewById<TextView>(R.id.textView)
        var likeCheck = true
        val like = findViewById<ImageView>(R.id.imageView3)
        like.setOnClickListener {
            if (likeCheck){
                like.setImageResource(R.drawable.pngwing_com__3_)
                likeCounter++
                likeCheck = false

            }
            else{
                like.setImageResource(R.drawable.pngwing_com__2_)
                likeCounter--
                likeCheck = true}
            if (likeCounter<1000){
                likeView.text = likeCounter.toString()
            }
            else{
                var SK = (likeCounter/1000).toString()+"."+(likeCounter%1000.0).toString()[0]+"K"
                likeView.text = SK
            }
        }

        if (likeCounter<1000){
            likeView.text = likeCounter.toString()
        }
        else{
            var SK = (likeCounter/1000).toString()+"."+(likeCounter%1000.0).toString()[0]+"K"
            likeView.text = SK
        }

        var SharpCounter = 0
        val SharpView = findViewById<TextView>(R.id.textView4)

        if (SharpCounter<1000){
            SharpView.text = SharpCounter.toString()
        }
        else{
            var SK = (SharpCounter/1000).toString()+"."+(SharpCounter%1000.0).toString()[0]+"K"
            SharpView.text = SK
        }

        val Sharp = findViewById<ImageView>(R.id.imageView4)
        Sharp.setOnClickListener {
            Sharp.setImageResource(R.drawable.pngwing_com__4_)
            SharpCounter++
            if (SharpCounter<1000){
                SharpView.text = SharpCounter.toString()
            }
            else{
                var SK = (SharpCounter/1000).toString()+"."+(SharpCounter%1000.0).toString()[0]+"K"
                SharpView.text = SK
            }

        }
    }
}