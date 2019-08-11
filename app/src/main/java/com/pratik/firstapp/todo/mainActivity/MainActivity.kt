package com.pratik.firstapp.todo.mainActivity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.pratik.firstapp.todo.R
import com.pratik.firstapp.todo.fragment.TodoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        addFragment(R.id.fragment, TodoFragment.newInstance())

    }

//    fun addFragment(frameId: Int, fragment: Fragment) {
//        supportFragmentManager.beginTransaction().replace(frameId, fragment).commit()
//    }



}
