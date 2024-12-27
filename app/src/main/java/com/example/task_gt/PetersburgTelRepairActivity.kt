package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_gt.databinding.ActivityPetersburgTelRepairBinding

var repairTelList = mutableListOf<TelRepair>()

class PetersburgTelRepairActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelRepairBinding
    private lateinit var adapter: RepairAdapter
    private lateinit var fixTelRepair: TelRepair
    private var fixTelPositonRepair: Int = -1
    private var thisContext = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelRepairBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (repairTelList.size == 0) repairTelList = PetersburgTelRepairModel.peterTelRepairs

        adapter = RepairAdapter(repairTelList)
        binding.recyclerRepairViewRV.layoutManager = LinearLayoutManager(this)
        binding.recyclerRepairViewRV.adapter = adapter
        binding.recyclerRepairViewRV.setHasFixedSize(true)

        binding.toResultRepairPageButton.setOnClickListener{
            if (fixTelRepair != null && fixTelPositonRepair != null) {
                binding.toResultRepairPageButton.animate().apply {
                    rotationBy(360f)
                    duration = 1000
                }.start()

                repairTelList.set(fixTelPositonRepair, fixTelRepair)

                val intent = Intent(this@PetersburgTelRepairActivity, ResultRepActivity::class.java)
                intent.putExtra("fixTelRepair", fixTelRepair)
                startActivity(intent)
            }
        }
    }

    override fun onResume() {
        super.onResume()

        val dialogBuilder = AlertDialog.Builder(this)

        adapter.setOnTelRepairClickListener( object :
            RepairAdapter.OnTelRepairClickListener {
            override fun onTelRepairClick(telRepair: TelRepair, position: Int) {
                dialogBuilder.setTitle("Подтверждение покупки")
                dialogBuilder.setPositiveButton("В мастерскую") {_, _ ->
                    if (fixTelPositonRepair == -1)
                    {
                        fixTelRepair = repairTelList.get(position)
                        fixTelRepair.repairedUnits += 1
                        fixTelPositonRepair = position
                    }
                    else Toast.makeText(thisContext,"Телефон для ремонта уже выбран", Toast.LENGTH_LONG).show()
                }
                dialogBuilder.setNegativeButton("Отмена"){dialog, which ->
                    if (fixTelPositonRepair != -1)
                    {
                        Toast.makeText(thisContext,"Ремонт телефона отменяется", Toast.LENGTH_LONG).show()
                    }
                }
                dialogBuilder.create().show()
            }
        })
    }

}