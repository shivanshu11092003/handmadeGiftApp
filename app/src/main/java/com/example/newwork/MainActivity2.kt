package com.example.newwork


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.newwork.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {


    private lateinit var binding : ActivityMain2Binding
    private lateinit var userArrayList: ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.images,R.drawable.images,R.drawable.images,R.drawable.images,
            R.drawable.images,R.drawable.images
        )
        val name = arrayOf(
            "Product_1","Product_2","Product_3","Product_4",
            "Product_5","Product_6"
        )
        val price = intArrayOf(8,9,10,81,82,88)
        userArrayList = ArrayList()

        for(i in name.indices){
            val user =User(name[i],price[i],imageId[i])
            userArrayList.add(user)

        }
        binding.list.isClickable=true
        binding.list.adapter = MyAdapter(this,userArrayList)
        binding.list.setOnItemClickListener{parent,view,position,id ->
            val name=name[position]
            val price=price[position]
            val imageId=imageId[position]

            val i = Intent(this,MainActivity3::class.java)
            i.putExtra("name",name)
            i.putExtra("price",price)
            i.putExtra("imageId",imageId)
            startActivity(i)

        }



    }
}