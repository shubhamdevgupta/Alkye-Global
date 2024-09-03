package com.androiddev.alkyeglobal.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.androiddev.alkyeglobal.MainFragment


class TabAdapter(context: Context?, fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MainFragment()
            1 -> MainFragment()
            2 -> MainFragment()
            3 -> MainFragment()
            4 -> MainFragment()

            else -> {
                MainFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 5 // Total number of tabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // Return null to display only icons
        return null
    }
}

