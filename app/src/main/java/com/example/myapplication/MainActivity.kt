package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val list = ArrayList<Model>()
        list.add(Model(Model.TEXT_TYPE, "Hello. This is the Text-only View Type. Nice to meet you", 0))
        list.add(Model(Model.IMAGE_TYPE, "Hi. I display a cool image too besides the omnipresent TextView.", R.drawable.wtc))
        list.add(Model(Model.AUDIO_TYPE, "Hey. Pressing the FAB button will playback an audio file on loop.", R.raw.sound))
        list.add(Model(Model.IMAGE_TYPE, "Hi again. Another cool image here. Which one is better?", R.drawable.snow))

        list.add(Model(Model.TEXT_TYPE, "Hello. This is the Text-only View Type. Nice to meet you", 0))
        list.add(Model(Model.IMAGE_TYPE, "Hi. I display a cool image too besides the omnipresent TextView.", R.drawable.wtc))
        list.add(Model(Model.AUDIO_TYPE, "Hey. Pressing the FAB button will playback an audio file on loop.", R.raw.sound))
        list.add(Model(Model.IMAGE_TYPE, "Hi again. Another cool image here. Which one is better?", R.drawable.snow))

        list.add(Model(Model.TEXT_TYPE, "Hello. This is the Text-only View Type. Nice to meet you", 0))
        list.add(Model(Model.IMAGE_TYPE, "Hi. I display a cool image too besides the omnipresent TextView.", R.drawable.wtc))
        list.add(Model(Model.AUDIO_TYPE, "Hey. Pressing the FAB button will playback an audio file on loop.", R.raw.sound))
        list.add(Model(Model.IMAGE_TYPE, "Hi again. Another cool image here. Which one is better?", R.drawable.snow))

        list.add(Model(Model.TEXT_TYPE, "Hello. This is the Text-only View Type. Nice to meet you", 0))
        list.add(Model(Model.IMAGE_TYPE, "Hi. I display a cool image too besides the omnipresent TextView.", R.drawable.wtc))
        list.add(Model(Model.AUDIO_TYPE, "Hey. Pressing the FAB button will playback an audio file on loop.", R.raw.sound))
        list.add(Model(Model.IMAGE_TYPE, "Hi again. Another cool image here. Which one is better?", R.drawable.snow))

        val adapter = Adapter(list)
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        binding.recyclerView.layoutManager = linearLayoutManager
        binding.recyclerView.itemAnimator = DefaultItemAnimator()
        binding.recyclerView.adapter = adapter

    }
}