package com.example.myquotes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quotes ORDER BY id ASC")
    fun getQuotes(): LiveData<List<Quote>>

    @Insert
    suspend fun insert(quote: Quote)
}