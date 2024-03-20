package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.AudioTypeBinding
import com.example.myapplication.databinding.ImageTypeBinding
import com.example.myapplication.databinding.TextTypeBinding


class Adapter(private val dataSet: ArrayList<Model>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            Model.TEXT_TYPE -> {
                val binding = TextTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TextTypeViewHolder(binding)
            }
            Model.IMAGE_TYPE -> {
                val binding = ImageTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ImageTypeViewHolder(binding)
            }
            Model.AUDIO_TYPE -> {
                val binding = AudioTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                AudioTypeViewHolder(binding)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val objectItem = dataSet[position]
        when (holder.itemViewType) {
            Model.TEXT_TYPE -> {
                val textHolder = holder as TextTypeViewHolder
                textHolder.binding.type.text = objectItem.text
            }
            Model.IMAGE_TYPE -> {
                val imageHolder = holder as ImageTypeViewHolder
                imageHolder.binding.background.setImageResource(objectItem.data)
            }
            Model.AUDIO_TYPE -> {
                val audioHolder = holder as AudioTypeViewHolder
                audioHolder.binding.type.text = objectItem.text
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun getItemViewType(position: Int): Int {
        return dataSet[position].type
    }

    inner class TextTypeViewHolder(val binding: TextTypeBinding) : RecyclerView.ViewHolder(binding.root)

    inner class ImageTypeViewHolder(val binding: ImageTypeBinding) : RecyclerView.ViewHolder(binding.root)

    inner class AudioTypeViewHolder(val binding: AudioTypeBinding) : RecyclerView.ViewHolder(binding.root)
}
