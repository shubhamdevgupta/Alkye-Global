package com.androiddev.alkyeglobal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddev.alkyeglobal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),ItemAdapterSecond.OnItemClickListener {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recylerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.secondRecyler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
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


        val adapter = ItemAdapter(items)
        val secondAdapter = ItemAdapterSecond(items,this)
        binding.recylerview.adapter = adapter
        binding.secondRecyler.adapter = secondAdapter
    }

    override fun onItemClick(position: Int) {

    }
}