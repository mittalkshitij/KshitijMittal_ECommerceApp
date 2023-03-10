package com.kshitij.ecommerceapp.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kshitij.ecommerceapp.R
import com.kshitij.ecommerceapp.databinding.FragmentMainBinding
import com.kshitij.ecommerceapp.ui.login.view.LoginFragment
import com.kshitij.ecommerceapp.ui.register.view.RegistrationFragment

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding?.createButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.mainActivity, RegistrationFragment::class.java,null).addToBackStack(null)
                .commit()
        }

        binding?.loginButton?.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainActivity, LoginFragment::class.java,null)
                .addToBackStack(null).commit()
        }
        return binding!!.root
    }
}