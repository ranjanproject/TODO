package com.pratik.firstapp.todo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_content")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name ="content")
    var content: String
)