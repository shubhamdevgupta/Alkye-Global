package com.androiddev.alkyeglobal

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androiddev.alkyeglobal.activity.DetailsActivity
import com.androiddev.alkyeglobal.adapter.ItemAdapter
import com.androiddev.alkyeglobal.adapter.ItemAdapterSecond
import com.androiddev.alkyeglobal.model.ItemModel

class MainFragment : Fragment(), ItemAdapterSecond.OnItemClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recylerview)
        val secondRecyler = view.findViewById<RecyclerView>(R.id.secondRecyler)
        val thirdRecyler = view.findViewById<RecyclerView>(R.id.thirdRecyler)

        val items = listOf(
            ItemModel(
                R.drawable.car_icon,
                "Technology",
                "26 Feb 2024"
            ),
            ItemModel(
                R.drawable.ic_carone,
                "Pharmacy",
                "28 Feb 2024"
            ),
            ItemModel(
                R.drawable.ic_cartwo,
                "Infrastructure",
                "26 Feb 2024"
            ),
            ItemModel(
                R.drawable.ic_carthree,
                "Manufacture",
                "26 Feb 2024"
            ),
        )
        //first adapter
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        //second adapter
        val secondAdapter = ItemAdapterSecond(items, this)
        secondRecyler.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        secondRecyler.adapter = secondAdapter

        //third adapter
        thirdRecyler.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val thirdadapter = ItemAdapter(items)
        thirdRecyler.adapter = thirdadapter
        return view
    }

    override fun onItemClick(position: Int) {
        startActivity(Intent(context, DetailsActivity::class.java))
    }
}