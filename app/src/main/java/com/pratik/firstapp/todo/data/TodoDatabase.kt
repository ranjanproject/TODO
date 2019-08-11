package com.pratik.firstapp.todo.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
abstract class TodoDatabase: RoomDatabase() {

    //define here abstract value for each database dao
    abstract fun todoDatabaseDao():TodoDatabaseDao

    //companion object allows clients to access the methods for creating or getting the database
    //without instenciating the database class
    companion object{

        @Volatile
        private var INSTANCE: TodoDatabase? = null

        fun getDatabase(context: Context): TodoDatabase {
            val tempInstance = INSTANCE

            if(tempInstance!=null){
               return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TodoDatabase::class.java,
                    "todo_database"
                ).build()
                INSTANCE = instance

                return instance
            }


        }
    }
}