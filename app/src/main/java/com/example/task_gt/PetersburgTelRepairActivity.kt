package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityPetersburgTelRepairBinding

class PetersburgTelRepairActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelRepairBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelRepairBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}