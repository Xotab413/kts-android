package com.xotab413.reddit

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kts.reddit.R
import kotlinx.android.synthetic.main.fragment_login.*


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
}