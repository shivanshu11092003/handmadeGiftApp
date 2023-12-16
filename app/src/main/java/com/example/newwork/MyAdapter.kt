package com.example.newwork

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class MyAdapter(private val context:Activity,private val arrayList: ArrayList<User>):ArrayAdapter<User>(context,
    R.layout.listitem,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater:LayoutInflater=LayoutInflater.from(context)

        val view:View=inflater.inflate(R.layout.listitem,null)
        val imageView:ImageView=view.findViewById(R.id.profile_pic)
        val username:TextView=view.findViewById(R.id.personalname)
        val price:TextView=view.findViewById((R.id.price))




        imageView.setImageResource(arrayList[position].imgid)
        username.text=arrayList[position].name
        price.text= arrayList[position].price.toString()

        return view


    }
}