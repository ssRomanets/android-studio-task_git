package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_gt.databinding.ActivityPetersburgTelShopBinding

class PetersburgTelShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelShopBinding
    var purchTelList = mutableListOf<Telephone>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (purchTelList.size == 0) purchTelList = PetersburgTelShopModal.peterTelephones
    }

    override fun onResume() {
        super.onResume()
        binding.recyclerPurchViewRV.layoutManager = LinearLayoutManager(this)
        val adapter = PurchAdapter(purchTelList)

        binding.recyclerPurchViewRV.adapter = adapter
        binding.recyclerPurchViewRV.setHasFixedSize(true)
    }
}

