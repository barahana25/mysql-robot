package kr.ac.kumoh.ce.s2025114794.mysql_robot

data class EquipmentDto (
    val robotName: String,
    val model: String?,
    val robotClass: String?,
    val location: String?,
    val quantity: Int?,
    val weaponName: String?,
    val weaponType: String?,
    val damage: Int?,
    val ability: String?
)