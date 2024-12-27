package com.example.task_gt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PurchAdapter (private val telephones: MutableList<Telephone>):
    RecyclerView.Adapter<PurchAdapter.TelephoneViewHolder>(){

    class TelephoneViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageTelViewIV: ImageView = itemView.findViewById(R.id.imageTelViewIV)
        val nameTelTV: TextView = itemView.findViewById(R.id.nameTelTV)
        val priceTelTV: TextView = itemView.findViewById(R.id.priceTelTV)
        val purchasedUnitsTV: TextView = itemView.findViewById(R.id.purchasedUnitsTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelephoneViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_tel_shop_item, parent, false)
        return TelephoneViewHolder(itemView)
    }

    override fun getItemCount() = telephones.size

    override fun onBindViewHolder(holder: TelephoneViewHolder, position: Int) {
        val telephone = telephones[position]
        holder.imageTelViewIV.setImageResource(telephone.image)
        holder.nameTelTV.text = telephone.name
        holder.priceTelTV.text = telephone.price.toString()
        holder.purchasedUnitsTV.text = telephone.purchasedUnits.toString()
    }

}