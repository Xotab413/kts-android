package com.xotab413.reddit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kts.reddit.R
import com.kts.reddit.databinding.FragmentOnboardingBinding
import timber.log.Timber


class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.d("${this.javaClass.simpleName} onViewCreated is called")
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentOnboardingBinding.bind(view)
        binding.btnEnjoy.setOnClickListener {
            val action = OnboardingFragmentDirections.actionOnboardingFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }

    /***** log's ********/
    override fun onPause() {
        Timber.d("${this.javaClass.simpleName} onPause is called")
        super.onPause()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.d("${this.javaClass.simpleName} onCreate is called")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Timber.d("${this.javaClass.simpleName} onStart is called")
        super.onStart()
    }

    override fun onResume() {
        Timber.d("${this.javaClass.simpleName} onResume is called")
        super.onResume()
    }

    override fun onDetach() {
        Timber.d("${this.javaClass.simpleName} onDetach is called")
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Timber.d("${this.javaClass.simpleName} onCreateView is called")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Timber.d("${this.javaClass.simpleName} onDestroyView is called")
        super.onDestroyView()
    }

    override fun onStop() {
        Timber.d("${this.javaClass.simpleName} onStop is called")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("${this.javaClass.simpleName} onDestroy is called")
        super.onDestroy()
    }
}