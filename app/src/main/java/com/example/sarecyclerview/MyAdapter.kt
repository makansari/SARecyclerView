package com.example.sarecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var myList : ArrayList<MyDataClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun holdingViews(data : MyDataClass){
            var myName = itemView.findViewById<TextView>(R.id.textViewName)
            var myEmail = itemView.findViewById<TextView>(R.id.textViewEmail)
            var myPhone = itemView.findViewById<TextView>(R.id.textViewPhone)

            myName.setText(data.name)
            myEmail.setText(data.email)
            myPhone.setText(data.phone)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var vi = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(vi)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.holdingViews(myList[position])

    }

    override fun getItemCount(): Int {
       return myList.size
    }
}