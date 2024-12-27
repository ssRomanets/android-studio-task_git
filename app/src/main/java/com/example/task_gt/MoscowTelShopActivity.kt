package com.example.task_gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_gt.databinding.ActivityMoscowTelShopBinding

class MoscowTelShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoscowTelShopBinding
    var purchTelList = mutableListOf<Telephone>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoscowTelShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (purchTelList.size == 0) purchTelList = MoscowTelShopModal.moscowTelephones

    }

    override fun onResume() {
        super.onResume()
        binding.recyclerPurchViewRV.layoutManager = LinearLayoutManager(this)
        val adapter = PurchAdapter(purchTelList)
        binding.recyclerPurchViewRV.adapter = adapter
        binding.recyclerPurchViewRV.setHasFixedSize(true)
    }
}