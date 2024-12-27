package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_gt.databinding.ActivityPetersburgTelRepairBinding

var repairTelList = mutableListOf<TelRepair>()

class PetersburgTelRepairActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelRepairBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelRepairBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (repairTelList.size == 0)
        {
            repairTelList = getSPMutableListTellRepairs()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.recyclerRepairViewRV.layoutManager = LinearLayoutManager(this)
        val adapter = RepairAdapter(repairTelList)
        binding.recyclerRepairViewRV.adapter = adapter
        binding.recyclerRepairViewRV.setHasFixedSize(true)
    }
}