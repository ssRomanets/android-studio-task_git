package com.example.task_gt

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_gt.databinding.ActivityPetersburgTelShopBinding

class PetersburgTelShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetersburgTelShopBinding
    private lateinit var adapter: PurchAdapter
    var purchTelList = mutableListOf<Telephone>()
    var maskTelephones = mutableListOf<Int>()
    var quantPurch = 0; //количество покупок
    var generalSumMoney = 0; //выручка

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPetersburgTelShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (purchTelList.size == 0) purchTelList = PetersburgTelShopModal.peterTelephones
        for ( i in purchTelList.indices)  maskTelephones.add(0)

        //считаем первоначальную выручку
        for ( i in purchTelList.indices)
            if (purchTelList.get(i).purchasedUnits != 0)
                generalSumMoney += purchTelList.get(i).purchasedUnits*purchTelList.get(i).price

        if (generalSumMoney == 0) binding.generalInfoTV.visibility =  View.INVISIBLE
        else {
            binding.generalInfoTV.visibility = View.VISIBLE
            binding.generalInfoTV.text = "Телефонов продано на "+generalSumMoney.toString()+"р."
        }

        binding.recyclerPurchViewRV.layoutManager = LinearLayoutManager(this)
        adapter = PurchAdapter(purchTelList)
        binding.recyclerPurchViewRV.adapter = adapter
        binding.recyclerPurchViewRV.setHasFixedSize(true)

        binding.toResultPurchPageButton.setOnClickListener{
            if (quantPurch > 0) {
                binding.toResultPurchPageButton.animate().apply {
                    rotationBy(360f)
                    duration = 1000
                }.start()

                var outputData: String  = ""
                for (i in maskTelephones.indices)
                {
                    if (maskTelephones.get(i) > 0)
                    {
                        var telephone = purchTelList[i]
                        telephone.purchasedUnits += maskTelephones[i]
                        purchTelList.set(i, telephone)
                        outputData = outputData +
                                maskTelephones[i] + " " +
                                purchTelList[i].name + " на " +
                                (maskTelephones[i]*purchTelList[i].price).toString()+"р \n"
                    }
                }

                val intent = Intent(this@PetersburgTelShopActivity, ResultPurchActivity::class.java)
                intent.putExtra("outputData", outputData)
                startActivity(intent)
            }
        }
    }

    override fun onResume() {
        super.onResume()

        val dialogBuilder = AlertDialog.Builder(this)

        adapter.setOnTelephoneClickListener( object :
            PurchAdapter.OnTelephoneClickListener {
            override fun onTelephoneClick(product: Telephone, position: Int) {
                dialogBuilder.setTitle("Подтверждение покупки")
                dialogBuilder.setPositiveButton("В корзину"){_, _ ->
                    maskTelephones.set(position, maskTelephones.get(position)+1)
                    quantPurch++;
                }
                dialogBuilder.setNegativeButton("Отмена"){dialog, which ->
                    if (maskTelephones.get(position) > 0) {
                        maskTelephones.set(position, maskTelephones.get(position)-1)
                        quantPurch--;
                    }
                }
                dialogBuilder.create().show()
            }
        })
    }
}

