package com.xotab413.reddit

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kts.reddit.R
import com.kts.reddit.databinding.FragmentLoginBinding
import timber.log.Timber


class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("email", binding.etEmail.text.toString())
        outState.putString("password", binding.etPassword.text.toString())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.d("${this.javaClass.simpleName} onViewCreated is called")
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLoginBinding.bind(view)

        binding.etPassword.addTextChangedListener(makeWatchers(binding))
        binding.etEmail.addTextChangedListener(makeWatchers(binding))

        binding.btnLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToMainFragment()
            findNavController().navigate(action)
        }
    }

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

    /**************test*******************/
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