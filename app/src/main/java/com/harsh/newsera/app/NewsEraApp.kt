package com.harsh.newsera.app

import android.app.Application

class NewsEraApp: Application() {

    companion object {
        val apiKey = "680d66ce64c44a7ea97efa29fec1cb69"
    }

    override fun onCreate() {
        super.onCreate()
    }

}