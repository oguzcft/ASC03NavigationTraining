package com.ouz.ascnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ouz.ascnavigation.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentDisplay) as NavHostFragment
        NavigationUI.setupWithNavController(binding.menuBottom,navHostFragment.navController)




    }
}


    /*

        var intentLoginControl = intent.getBooleanExtra("loginUser", false)
        var getLoginUser = intent.getSerializableExtra("loginUser2")

    if (intentLoginControl){
            val bundle=Bundle()
            bundle.putSerializable("fragUser", getLoginUser)
            bundle.putBoolean("fragControl", true)

            val fragment=EntryFragment()
            fragment.arguments=bundle
            //val fragmentTransaction=supportFragmentManager.beginTransaction().replace(R.id.fragmentDisplay,fragment,fragment.toString()).commit()
        }
        else{
         println("veriyok")
        }


    var getLoginName = getLoginUser.name
    var getLoginSurname = getLoginUser.surname
    var getLoginPassword = getLoginUser.pw


        */










