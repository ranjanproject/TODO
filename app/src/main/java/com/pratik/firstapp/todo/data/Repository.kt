package com.pratik.firstapp.todo.data

import androidx.annotation.WorkerThread

class TodoRepository(private val todoDatabaseDao: TodoDatabaseDao){

    val allContents:List<TodoEntity> = todoDatabaseDao.getAllContents()

    @WorkerThread
    suspend fun insert(todoEntity:TodoEntity){
        todoDatabaseDao.insertContent(todoEntity)
    }
}