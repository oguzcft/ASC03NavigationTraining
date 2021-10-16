package com.ouz.ascnavigation

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ouz.ascnavigation.databinding.FragmentEditBinding


class EditFragment : Fragment() {
private var _binding:FragmentEditBinding?=null
    private val binding get() = _binding!!
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentEditBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences=requireContext().getSharedPreferences("com.ouz.ascnavigation",  Context.MODE_PRIVATE)
        var nameShare=sharedPreferences.getString("nameShare","No Name")
        var surnameShare=sharedPreferences.getString("surnameShare","No Surname")
        var pwShare=sharedPreferences.getString("pwShare","No pw")
        binding.editTextTextPersonName.setText(nameShare)
        binding.editTextTextPersonName2.setText(surnameShare)
        binding.editTextTextPersonName.setText(pwShare)

        binding.button.setOnClickListener {

            val nameText=binding.editTextTextPersonName.text.toString()
            val surnameText=binding.editTextTextPersonName2.text.toString()
            val passwordText=binding.editTextTextPassword.text.toString()
            sharedPreferences.edit().putString("nameShare",nameText).apply()
            sharedPreferences.edit().putString("surnameShare",surnameText).apply()
            sharedPreferences.edit().putString("pwShare",passwordText).apply()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}

