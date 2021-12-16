package com.beogotech.apps.android.clinicare.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.beogotech.apps.android.clinicare.R


class ThirdScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third_screen, container, false)
        val finish = view.findViewById<TextView>(R.id.finish)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingScreenPager)

        finish.setOnClickListener{
           findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingCompleted()
        }

        return view
    }

    private fun onBoardingCompleted(){
        val sharedPrefs = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPrefs.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}