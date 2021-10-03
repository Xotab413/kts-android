package com.xotab413.reddit

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kts.reddit.R
import com.kts.reddit.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    fun validInput(): Boolean {

        val isValidEmail = Patterns.EMAIL_ADDRESS.matcher(binding.etEmail.text).matches()
        return (isValidEmail && binding.etPassword.text.length >= 8)
    }

    private fun makeWatchers(binding: FragmentLoginBinding): TextWatcher {
        val textWatcher: TextWatcher = object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.btnLogin.isEnabled = validInput()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable?) {}

        }
        return textWatcher
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("email", binding.etEmail.text.toString())
        outState.putString("password", binding.etPassword.text.toString())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLoginBinding.bind(view)

        binding.etPassword.addTextChangedListener(makeWatchers(binding))
        binding.etEmail.addTextChangedListener(makeWatchers(binding))

        binding.btnLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToMainFragment()
            findNavController().navigate(action)
        }
    }
}