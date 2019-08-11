package com.pratik.firstapp.todo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query

@Dao
interface TodoDatabaseDao {

    @Insert
    suspend fun insertContent(todoEntity:TodoEntity)

    @Query("SELECT * FROM todo_content WHERE id = :key")
    fun getContent(key: PrimaryKey)

    @Query("SELECT * FROM todo_content ORDER BY id ASC")
    fun getAllContents():List<TodoEntity>

}