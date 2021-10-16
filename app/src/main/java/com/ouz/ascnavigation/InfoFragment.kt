package com.ouz.ascnavigation

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ouz.ascnavigation.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    private var _binding:FragmentInfoBinding?=null
    lateinit var sharedPreferences2: SharedPreferences
    private val binding get() = _binding!!

    //private val args:InfoFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding= FragmentInfoBinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        sharedPreferences2=requireContext().getSharedPreferences("com.ouz.ascnavigation",  Context.MODE_PRIVATE)
        var nameShare=sharedPreferences2.getString("nameShare","No Name")
        var surnameShare=sharedPreferences2.getString("surnameShare","No Surname")
        binding.textViewAd.text=nameShare.toString()
        binding.textViewSoyad.text=surnameShare.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    }
/**   binding.textViewAd.text=args.namename
binding.textViewSoyad.text=args.sunamesuname*/