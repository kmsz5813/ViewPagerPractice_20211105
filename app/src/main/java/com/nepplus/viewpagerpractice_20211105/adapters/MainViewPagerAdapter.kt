package com.nepplus.viewpagerpractice_20211105.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpagerpractice_20211105.fragments.HelloFargment
import com.nepplus.viewpagerpractice_20211105.fragments.IntroduceFargment
import com.nepplus.viewpagerpractice_20211105.fragments.NameFargment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0){
            return HelloFargment()
        }
        else if (position == 1){
            return NameFargment()
        }
        else{
            return IntroduceFargment()
        }

    }
}