package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.task_gt.databinding.ActivityPetersburgBinding

class PetersburgActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgBinding
    var intentOut : Intent? = null
    var radioText : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.presentingBTN.setOnClickListener{
            var id: Int = binding.radioGroupRG.checkedRadioButtonId
            if (id == -1) {
                Toast.makeText(this,"Услуга не выбрана", Toast.LENGTH_LONG).show()
            } else {
                if (radioText == "Купить телефон") intentOut = Intent(this, PetersburgTelShopActivity::class.java)
                else intentOut = Intent(this, PetersburgTelRepairActivity::class.java)
                startActivity(intentOut)
            }
        }
    }

    fun radioButtonClick(view: View) {
        val radio: RadioButton = findViewById(binding.radioGroupRG.checkedRadioButtonId)
        radioText = radio.text.toString()
        Toast.makeText(this,"Выбрана услуга : ${radio.text}", Toast.LENGTH_LONG).show()
    }
}