package com.beogotech.apps.android.clinicare

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay


class ClinicareSplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.getMainLooper()).postDelayed({
            if(isOnBoardingCompleted()){
                findNavController().navigate(R.id.action_clinicareSplashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_clinicareSplashFragment_to_viewPagerFragment)
            }

        }, 3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clinicare_splash, container, false)
    }

    private fun isOnBoardingCompleted():Boolean{
        val sharedPrefs = requireActivity().getSharedPreferences("onBaording", Context.MODE_PRIVATE)
        return  sharedPrefs.getBoolean("Finished", false)
    }
}