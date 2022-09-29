package com.google.firebase.quickstart.auth.abvideoplayermediacontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController

import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    private var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureVideoView()
    }


    private fun configureVideoView() {

       val videoView1 : VideoView = findViewById(R.id.videoView1)
        videoView1.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4")
        mediaController = MediaController(this)
        mediaController?.setAnchorView(videoView1)
        videoView1.setMediaController(mediaController)
        videoView1.start()
    }

}