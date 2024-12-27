package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityPetersburgTelShopBinding

class PetersburgTelShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}