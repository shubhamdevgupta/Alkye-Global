package com.androiddev.alkyeglobal.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddev.alkyeglobal.model.ItemModel
import com.androiddev.alkyeglobal.R
import com.androiddev.alkyeglobal.adapter.ItemAdapter
import com.androiddev.alkyeglobal.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
   private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
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

        binding.recylerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val thirdadapter = ItemAdapter(items)
        binding.recylerview.adapter= thirdadapter

    }
}