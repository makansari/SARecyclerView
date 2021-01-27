package com.example.sarecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myList : ArrayList<MyDataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)

         myList = ArrayList<MyDataClass>()
        myRecyclerView.adapter = MyAdapter(myList)

        addingData()


    }

    private fun addingData() {

        var data1 = MyDataClass("ansari","a@a.com","23434343")
        myList.add(data1)

        var data2 = MyDataClass("Saad","saad@a.com","44545454")
        myList.add(data2)

        var data3 = MyDataClass("Yusra","ysra@a.com","787867666")
        myList.add(data3)

        var data4 = MyDataClass("Nouf","n@a.com","85678775")
        myList.add(data4)

    }
}