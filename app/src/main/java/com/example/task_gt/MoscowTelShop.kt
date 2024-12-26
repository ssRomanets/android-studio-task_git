package com.example.task_gt

data class MoscowTelShop(
    override val image: Int,
    override val name: String,
    override val price: Int,
    override val purchasedUnits: Int
) : Telephone

fun getMMutableListTelephones(): MutableList<Telephone> {
    return  mutableListOf(
        MoscowTelShop(R.drawable.cnbeta,         "cnbeta",         7000, 0),
        MoscowTelShop(R.drawable.galaxy_s20,     "galaxy_s20",     8000, 0),
        MoscowTelShop(R.drawable.phillpsw536,    "phillpsw536",    15000, 0),
        MoscowTelShop(R.drawable.prestigio,      "prestigio",      12000, 0),
        MoscowTelShop(R.drawable.redmi7,         "redmi7",         8000, 0),
        MoscowTelShop(R.drawable.tp_link_neffos, "tp_link_neffos", 16000, 0),
        MoscowTelShop(R.drawable.ulefone_note,   "ulefone_note",   8000, 0),
        MoscowTelShop(R.drawable.vivoy1s,        "vivoy1s",        9000, 0),
        MoscowTelShop(R.drawable.vivoy81,        "vivoy81",        9000, 0),
        MoscowTelShop(R.drawable.zte_blade,      "zte_blade",      7600, 0)
    )
}
