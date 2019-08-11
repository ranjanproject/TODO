package com.pratik.firstapp.todo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.pratik.firstapp.todo.R
import kotlinx.android.synthetic.main.todo_fragment.*
import kotlinx.android.synthetic.main.todo_fragment.view.*
import kotlinx.android.synthetic.main.todo_fragment.view.listView


class TodoFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        super.onCreateView(inflater, container, savedInstanceState)
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.todo_fragment, container, false)

        val listView = view.findViewById(R.id.listView) as ListView

        val prueba = ArrayList<String>()
        prueba.add("Element1")
        prueba.add("Element2")
        prueba.add("Element3")
        prueba.add("Element1")
        prueba.add("Element2")
        prueba.add("Element3")
        prueba.add("Element1")
        prueba.add("Element2")
        prueba.add("Element3")
        prueba.add("Element1")
        prueba.add("Element2")
        prueba.add("Element3")
//
//
        val allItemsAdapter = ArrayAdapter(activity!!.baseContext, android.R.layout.simple_list_item_1, prueba)

        listView.adapter = allItemsAdapter

        view.button.setOnClickListener {
            Toast.makeText(context,"working",Toast.LENGTH_SHORT).show()
        }

        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//                listView

    }



}