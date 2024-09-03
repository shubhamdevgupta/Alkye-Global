package com.androiddev.alkyeglobal.activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.androiddev.alkyeglobal.adapter.ItemAdapterSecond
import com.androiddev.alkyeglobal.adapter.TabAdapter
import com.androiddev.alkyeglobal.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = findViewById<TabLayout>(com.androiddev.alkyeglobal.R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(com.androiddev.alkyeglobal.R.id.viewPager)

        val sectionsPagerAdapter = TabAdapter(this, supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter

        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(com.androiddev.alkyeglobal.R.drawable.ic_book)
        tabLayout.getTabAt(1)?.setIcon(com.androiddev.alkyeglobal.R.drawable.ic_bookmark)
        tabLayout.getTabAt(2)?.setIcon(com.androiddev.alkyeglobal.R.drawable.ic_tv)
        tabLayout.getTabAt(3)?.setIcon(com.androiddev.alkyeglobal.R.drawable.ic_bell)
        tabLayout.getTabAt(4)?.setIcon(com.androiddev.alkyeglobal.R.drawable.ic_user)

        customizeTabSize(tabLayout)
    }


    private fun customizeTabSize(tabLayout: TabLayout) {
        // Access the tab strip of the TabLayout
        val tabStrip = tabLayout.getChildAt(0) as LinearLayout
        for (i in 0 until tabStrip.childCount) {
            val tabView = tabStrip.getChildAt(i)

            tabView.minimumWidth = 0
            val layoutParams = tabView.layoutParams as LinearLayout.LayoutParams
            layoutParams.width = 0
            layoutParams.weight = 1f
            tabView.layoutParams = layoutParams

            tabView.setPadding(16, 16, 16, 16) // Adjust padding as needed
        }
    }
}