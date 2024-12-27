package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityMoscowTelShopBinding

class MoscowTelShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoscowTelShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoscowTelShopBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}