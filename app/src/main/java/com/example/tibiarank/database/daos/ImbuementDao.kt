package com.example.tibiarank.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tibiarank.database.model.Imbuement

@Dao
interface ImbuementDao {

    @Query("SELECT * FROM imbuement_table ORDER BY tipo ASC")
    fun getAlphabetizeImbuements(): List<Imbuement>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(imbuement: Imbuement)
}