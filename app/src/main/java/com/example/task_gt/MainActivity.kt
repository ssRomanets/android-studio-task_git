package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess
import com.example.task_gt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var intentOut : Intent? = null
    var radioText : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toShopBTN.setOnClickListener{
            var id: Int = binding.radioGroupRG.checkedRadioButtonId
            if (id == -1) {
                Toast.makeText(this,"Организация не выбрана", Toast.LENGTH_LONG).show()
            } else {
                if (radioText == "Московский салон связи") intentOut = Intent(this, MoscowTelShopActivity::class.java)
                else intentOut = Intent(this, PetersburgActivity::class.java)
                startActivity(intentOut)
            }
        }

        binding.exitBTN.setOnClickListener{
            exitProcess(-1)
        }
    }

    fun radioButtonClick(view: View) {
        val radio: RadioButton = findViewById(binding.radioGroupRG.checkedRadioButtonId)
        radioText = radio.text.toString()
        Toast.makeText(this,"Выбран : ${radio.text}", Toast.LENGTH_LONG).show()
    }
}