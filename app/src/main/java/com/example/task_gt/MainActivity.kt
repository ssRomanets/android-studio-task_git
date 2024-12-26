package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroupRG: RadioGroup
    private lateinit var exitBTN:   Button
    private lateinit var toShopBTN: Button
    var intentOut : Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        toShopBTN.setOnClickListener{
            var id: Int = radioGroupRG.checkedRadioButtonId
            var scores: Int = 0;
            if (id == -1) {
                Toast.makeText(this,"Ответ не выбран", Toast.LENGTH_LONG).show()
            } else {
                if (id == 0) intentOut = Intent(this, MoscowTelShopActivity::class.java)
                else intentOut = Intent(this, PetersburgActivity::class.java)
                startActivity(intentOut)
            }
        }

        exitBTN.setOnClickListener{
            exitProcess(-1)
        }
    }

    fun initUI() {
        radioGroupRG = findViewById(R.id.radioGroupRG)

        toShopBTN = findViewById(R.id.toShopBTN)
        exitBTN = findViewById(R.id.exitBTN)
    }

    fun radioButtonClick(view: View) {
        val radio: RadioButton = findViewById(radioGroupRG.checkedRadioButtonId)
        Toast.makeText(this,"Выбран : ${radio.text}", Toast.LENGTH_LONG).show()
    }
}