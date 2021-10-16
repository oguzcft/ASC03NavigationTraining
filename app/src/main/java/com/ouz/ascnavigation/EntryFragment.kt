package com.ouz.ascnavigation

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ouz.ascnavigation.databinding.FragmentEntryBinding
import com.ouz.ascnavigation.databinding.FragmentInfoBinding


class EntryFragment : Fragment() {
    private var _binding:FragmentEntryBinding?=null
    private val binding get() = _binding!!
    lateinit var sharedPreferences2: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentEntryBinding.inflate(inflater)

        return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPreferences2=requireContext().getSharedPreferences("com.ouz.ascnavigation",  Context.MODE_PRIVATE)

        var nameShare=sharedPreferences2.getString("nameShare","No Name")
        var surnameShare=sharedPreferences2.getString("surnameShare","No Surname")
        var passwordShare=sharedPreferences2.getString("pwShare","No pw")
        binding.textViewLoginName.text=nameShare.toString()
        binding.textViewLoginSurname.text=surnameShare.toString()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null

    }

    }
/* var gecis=EntryFragmentDirections.actionEntryFragmentToInfoFragment(nameShare.toString(),surnameShare.toString())
       findNavController().navigate(gecis)*/
/*
*    var valueControl=arguments?.getBoolean("fragControl",false)

        if (valueControl == true){
            var valueName=arguments?.getSerializable("fragUser") as Users
            var getLoginName2 = valueName.name
            var getLoginSurname2 = valueName.surname
            var getLoginPassword2 = valueName.pw
            binding.textViewLoginName.text=getLoginName2
            binding.textViewLoginSurname.text=getLoginSurname2
         //   Toast.makeText(context,"Yes Data",Toast.LENGTH_SHORT).show()
        }
      else{
          Toast.makeText(context,"No Data",Toast.LENGTH_SHORT).show()
      }
*
* */