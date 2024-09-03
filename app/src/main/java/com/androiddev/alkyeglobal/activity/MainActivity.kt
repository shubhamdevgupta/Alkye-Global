package com.androiddev.alkyeglobal.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddev.alkyeglobal.model.ItemModel
import com.androiddev.alkyeglobal.R
import com.androiddev.alkyeglobal.adapter.ItemAdapter
import com.androiddev.alkyeglobal.adapter.ItemAdapterSecond
import com.androiddev.alkyeglobal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ItemAdapterSecond.OnItemClickListener {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf(
            ItemModel(
                R.drawable.car_icon,
                "Technology",
                "26 Feb 2024"
            ),
            ItemModel(
                R.drawable.car_icon,
                "Pharmacy",
                "28 Feb 2024"
            ),
            ItemModel(
                R.drawable.car_icon,
                "Infrastructure",
                "26 Feb 2024"
            ),
            ItemModel(
                R.drawable.car_icon,
                "Manufacture",
                "26 Feb 2024"
            ),
        )
        //first adapter
        val adapter = ItemAdapter(items)
        binding.recylerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recylerview.adapter = adapter

        //second adapter
        val secondAdapter = ItemAdapterSecond(items,this)
        binding.secondRecyler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.secondRecyler.adapter = secondAdapter

        //third adapter
        binding.thirdRecyler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val thirdadapter = ItemAdapter(items)
        binding.thirdRecyler.adapter= thirdadapter
    }

    override fun onItemClick(position: Int) {
        startActivity(Intent(this, DetailsActivity::class.java))
    }
}