package com.xotab413.reddit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kts.reddit.R
import kotlinx.android.synthetic.main.fragment_onboarding.*


class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnEnjoy.setOnClickListener {
            val action = OnboardingFragmentDirections.actionOnboardingFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }
}