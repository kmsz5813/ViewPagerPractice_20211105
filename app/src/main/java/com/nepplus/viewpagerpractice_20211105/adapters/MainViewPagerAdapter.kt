package com.nepplus.viewpagerpractice_20211105.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpagerpractice_20211105.fragments.*

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0){
            return HelloFargment()
        }
        else if (position == 1){
            return NameFargment()
        }
        else if (position == 2){
            return IntroduceFargment()
        }
        else if (position == 3){
            return MaleFargment()
        }
        else{
            return AgeFargment()
        }

    }
}