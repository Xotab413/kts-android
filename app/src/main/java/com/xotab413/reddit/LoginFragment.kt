package com.xotab413.reddit

import androidx.fragment.app.Fragment
import com.kts.reddit.R
import android.os.Bundle
import android.util.Patterns
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_onboarding.*


class LoginFragment : Fragment(R.layout.fragment_login) {


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("text", etEmail.text.toString())
        outState.putString("text", etPassword.text.toString())
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
                    btnLogin.setOnClickListener {
                        findNavController().navigate(R.id.mainFragment)
                    }
            }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}