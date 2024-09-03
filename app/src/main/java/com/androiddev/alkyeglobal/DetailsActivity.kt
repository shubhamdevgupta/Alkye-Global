package com.androiddev.alkyeglobal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddev.alkyeglobal.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
   private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recylerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

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
        binding.recylerview.adapter = adapter

    }
}