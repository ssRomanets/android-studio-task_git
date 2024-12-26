package com.example.task_gt

data class PetersburgTelShop(
    override val image: Int,
    override val name: String,
    override val price: Int,
) : Telephone

fun getSPMutableListTelephones(): MutableList<Telephone> {
    return  mutableListOf(
        PetersburgTelShop(R.drawable.cnbeta,         "cnbeta",         6000),
        PetersburgTelShop(R.drawable.galaxy_s20,     "galaxy_s20",     7000),
        PetersburgTelShop(R.drawable.phillpsw536,    "phillpsw536",    14000),
        PetersburgTelShop(R.drawable.prestigio,      "prestigio",      11000),
        PetersburgTelShop(R.drawable.redmi7,         "redmi7",         7000),
        PetersburgTelShop(R.drawable.tp_link_neffos, "tp_link_neffos", 15000),
        PetersburgTelShop(R.drawable.ulefone_note,   "ulefone_note",   7000),
        PetersburgTelShop(R.drawable.vivoy1s,        "vivoy1s",        8000),
        PetersburgTelShop(R.drawable.vivoy81,        "vivoy81",        8000),
        PetersburgTelShop(R.drawable.zte_blade,      "zte_blade",      6500)
    )
}