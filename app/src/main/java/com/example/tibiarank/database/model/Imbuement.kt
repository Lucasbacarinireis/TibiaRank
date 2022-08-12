package com.example.tibiarank.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "imbuement_table")
data class Imbuement(
    @ColumnInfo(name = "tipo") val tipo: String,
    @ColumnInfo(name = "quantidade_basic") val quantidadeBasic: Int,
    @ColumnInfo(name = "quantidade_intricate") val quantidadeIntricate: Int,
    @ColumnInfo(name = "quantidade_powerful") val quantidadePowerful: Int,
    @ColumnInfo(name = "item_basic") val itemBasic: String,
    @ColumnInfo(name = "item_intricate") val itemIntricate: String,
    @ColumnInfo(name = "item_powerful") val itemPowerful: String,
    @ColumnInfo(name = "descricao") val descricao: String
){
    @PrimaryKey(autoGenerate = true)
    var imbid : Int = 0
}
