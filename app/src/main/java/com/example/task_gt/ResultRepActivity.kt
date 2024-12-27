package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityResultRepBinding

class ResultRepActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultRepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intentIn: Intent
        intentIn = getIntent()
        val fixTelRepair = intentIn.extras?.getSerializable("fixTelRepair") as TelRepair
        binding.textResultTV.text = "Телефон " + fixTelRepair.name+ "\n отремонтирован."

        binding.backBTN.setOnClickListener{
            val intent = Intent(this@ResultRepActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

