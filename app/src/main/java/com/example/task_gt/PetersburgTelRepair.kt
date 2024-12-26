package com.example.task_gt

data class PetersburgTelRepair(
    override val image: Int,
    override val name: String,
    override val repairedUnits: Int
) : TelRepair

fun getSPMutableListTellRepairs(): MutableList<TelRepair> {
    return  mutableListOf(
        PetersburgTelRepair(R.drawable.cnbeta,         "cnbeta"         ,0),
        PetersburgTelRepair(R.drawable.galaxy_s20,     "galaxy_s20"     ,0),
        PetersburgTelRepair(R.drawable.phillpsw536,    "phillpsw536"    ,0),
        PetersburgTelRepair(R.drawable.prestigio,      "prestigio"      ,0),
        PetersburgTelRepair(R.drawable.redmi7,         "redmi7"         ,0),
        PetersburgTelRepair(R.drawable.tp_link_neffos, "tp_link_neffos" ,0),
        PetersburgTelRepair(R.drawable.ulefone_note,   "ulefone_note"   ,0),
        PetersburgTelRepair(R.drawable.vivoy1s,        "vivoy1s"        ,0),
        PetersburgTelRepair(R.drawable.vivoy81,        "vivoy81"        ,0),
        PetersburgTelRepair(R.drawable.zte_blade,      "zte_blade"      ,0)
    )
}