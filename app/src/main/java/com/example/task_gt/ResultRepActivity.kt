package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityResultRepBinding

class ResultRepActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultRepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultRepBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}