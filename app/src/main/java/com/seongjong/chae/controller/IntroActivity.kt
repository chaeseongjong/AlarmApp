package com.seongjong.chae.controller

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import com.seongjong.chae.R
import kotlinx.android.synthetic.main.activity_intro.*
import android.content.Intent
import android.os.Handler


class IntroActivity : BaseActivity() {

    lateinit var animation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        UIInit()
    }

    override fun UIInit() {
        loadingView.setBackgroundResource(R.drawable.intro_bar)
        animation = loadingView.background as AnimationDrawable
        animation.start()
        val introHandler = Handler()
        introHandler.postDelayed(Runnable {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
