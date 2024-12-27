package com.example.task_gt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RepairAdapter (private val telRepairs: MutableList<TelRepair>):
    RecyclerView.Adapter<RepairAdapter.TelRepairViewHolder>(){

    private var onTelRepairClickListener: OnTelRepairClickListener? = null

    interface OnTelRepairClickListener {
        fun onTelRepairClick(telRepair: TelRepair, position: Int)
    }

    class TelRepairViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageTelViewIV: ImageView = itemView.findViewById(R.id.imageTelViewIV)
        val nameTelTV: TextView = itemView.findViewById(R.id.nameTelTV)
        val repairedUnitsTV: TextView = itemView.findViewById(R.id.repairedUnitsTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelRepairViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_tel_repair_item, parent, false)
        return TelRepairViewHolder(itemView)
    }

    override fun getItemCount() = telRepairs.size

    override fun onBindViewHolder(holder: TelRepairViewHolder, position: Int) {
        val telRepair = telRepairs[position]
        holder.imageTelViewIV.setImageResource(telRepair.image)
        holder.nameTelTV.text = telRepair.name
        holder.repairedUnitsTV.text = "отремонтированных телефонов - " + telRepair.repairedUnits.toString()

        holder.imageTelViewIV.setOnClickListener{
            if (onTelRepairClickListener != null) {
                onTelRepairClickListener!!.onTelRepairClick(telRepair, position)
            }
        }
    }

    fun setOnTelRepairClickListener(onTelRepairClickListener: OnTelRepairClickListener) {
        this.onTelRepairClickListener = onTelRepairClickListener
    }
}