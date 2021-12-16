package com.beogotech.apps.android.clinicare.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.beogotech.apps.android.clinicare.R
import com.beogotech.apps.android.clinicare.onboarding.screens.FirstScreen
import com.beogotech.apps.android.clinicare.onboarding.screens.SecondScreen
import com.beogotech.apps.android.clinicare.onboarding.screens.ThirdScreen


class ViewPagerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
       val viewPager = view.findViewById<ViewPager2>(R.id.onBoardingScreenPager)
        viewPager.adapter = adapter
        return view
    }

}