//package com.pratik.firstapp.todo
//
//import android.content.Context
//import androidx.room.Room
//import androidx.test.core.app.ApplicationProvider
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.platform.app.InstrumentationRegistry
//import com.pratik.firstapp.todo.data.TodoDatabase
//import com.pratik.firstapp.todo.data.TodoDatabaseDao
//import com.pratik.firstapp.todo.data.TodoEntity
//import org.junit.After
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//import java.io.IOException
//
//
////database test
//@RunWith(AndroidJUnit4::class)
//class DatabaseTest{
//
//    private lateinit var todoDao: TodoDatabaseDao
//    private lateinit var db: TodoDatabase
//
//
//
//    @Before
//    fun createDb() {
//        val context = ApplicationProvider.getApplicationContext<Context>()
//        db = Room.inMemoryDatabaseBuilder(context, TodoDatabase::class.java).allowMainThreadQueries().build()
//
//          todoDao = db.todoDatabaseDao
//    }
//
//    @After
//    @Throws(IOException::class)
//    fun closeDb(){
//       db.close()
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun insertAndGetContent(){
//        val content = TodoEntity(0,"hello world")
//
//        todoDao.insertContent(content)
//
//        val todo = todoDao.getAllContents()
//
//
//    }
//}