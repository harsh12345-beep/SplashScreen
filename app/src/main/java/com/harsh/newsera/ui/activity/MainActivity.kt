package com.harsh.newsera.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.google.gson.Gson
import com.harsh.newsera.R
import com.harsh.newsera.databinding.ActivityMainBinding
import com.harsh.newsera.domain.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val response = runBlocking(Dispatchers.IO) {
            NewsRepository.getNews()
        }

        Log.e("DATA",  Gson().toJson(response))

    }
}