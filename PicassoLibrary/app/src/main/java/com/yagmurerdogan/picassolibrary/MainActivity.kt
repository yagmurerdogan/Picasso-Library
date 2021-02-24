package com.yagmurerdogan.picassolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.yagmurerdogan.picassolibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mViewBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        mViewBinding.buttonShow.setOnClickListener{

            val url = "http://i.imgur.com/DvpvklR.png"

            Picasso.get()
                .load(url)
                .into(mViewBinding.imageView)
        }


    }
}