package com.example.task_gt

data class PetersburgTelRepair(
    override val image: Int,
    override val name: String,
) : TelRepair

fun getSPMutableListTellRepairs(): MutableList<TelRepair> {
    return  mutableListOf(
        PetersburgTelRepair(R.drawable.cnbeta,         "cnbeta"         ),
        PetersburgTelRepair(R.drawable.galaxy_s20,     "galaxy_s20"     ),
        PetersburgTelRepair(R.drawable.phillpsw536,    "phillpsw536"    ),
        PetersburgTelRepair(R.drawable.prestigio,      "prestigio"      ),
        PetersburgTelRepair(R.drawable.redmi7,         "redmi7"         ),
        PetersburgTelRepair(R.drawable.tp_link_neffos, "tp_link_neffos" ),
        PetersburgTelRepair(R.drawable.ulefone_note,   "ulefone_note"   ),
        PetersburgTelRepair(R.drawable.vivoy1s,        "vivoy1s"        ),
        PetersburgTelRepair(R.drawable.vivoy81,        "vivoy81"        ),
        PetersburgTelRepair(R.drawable.zte_blade,      "zte_blade"      )
    )
}