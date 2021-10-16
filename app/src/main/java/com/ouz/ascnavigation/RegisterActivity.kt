package com.ouz.ascnavigation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ouz.ascnavigation.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences=this.getSharedPreferences("com.ouz.ascnavigation",  Context.MODE_PRIVATE)

        binding.buttonRegistry.setOnClickListener {

            val nameText=binding.editTextPersonName.text.toString()
            val surnameText=binding.editTextSurname.text.toString()
            val passwordText=binding.editTextPassword.text.toString()
            val user=Users(nameText,surnameText,passwordText)

            sharedPreferences.edit().putString("nameShare",nameText).apply()
            sharedPreferences.edit().putString("surnameShare",surnameText).apply()
            sharedPreferences.edit().putString("pwShare",passwordText).apply()

            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("newUser",true)
            intent.putExtra("newUser2",user)
            startActivity(intent)
            finish()

        }
    }
}
/* intent.putExtra("newName",nameText)
            intent.putExtra("newSurname",surnameText)
            intent.putExtra("newPassword",passwordText)*/