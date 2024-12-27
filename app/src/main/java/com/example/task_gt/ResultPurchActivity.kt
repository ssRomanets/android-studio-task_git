package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityResultPurchBinding

class ResultPurchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultPurchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultPurchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}