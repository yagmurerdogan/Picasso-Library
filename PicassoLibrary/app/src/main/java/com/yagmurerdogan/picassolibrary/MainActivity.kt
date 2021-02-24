package com.yagmurerdogan.picassolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yagmurerdogan.picassolibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mViewBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)


    }
}