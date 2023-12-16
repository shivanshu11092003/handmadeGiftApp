package com.example.newwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



import com.example.newwork.databinding.ActivityUserBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val price=intent.getStringExtra("price")
        val imageId = intent.getIntExtra("imageId",R.drawable.images)


        binding.profileImage.setImageResource(imageId)




    }
}