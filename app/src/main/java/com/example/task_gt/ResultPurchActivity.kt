package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityResultPurchBinding

class ResultPurchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultPurchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultPurchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val outputData = intent.getStringExtra("outputData")
        binding.textResultTV.text = outputData

        binding.backBTN.setOnClickListener{
            val intent = Intent(this@ResultPurchActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}