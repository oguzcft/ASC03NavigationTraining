package com.ouz.ascnavigation

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ouz.ascnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



            binding.buttonLoginMain.setOnClickListener {
                var intentControl = intent.getBooleanExtra("newUser", false)

                if (intentControl) {

                    var getUser = intent.getSerializableExtra("newUser2") as Users
                    var getName = getUser.name
                    var getSurname = getUser.surname
                    var getPassword = getUser.pw

                    if (binding.editTextLoginName.text.toString() == getName && binding.editTextLoginPassword.text.toString() == getPassword) {
                        startActivity(Intent(this, LoginActivity::class.java).putExtra("loginUser",true).putExtra("loginUser2",getUser))

                    } else {
                        Toast.makeText(this@MainActivity, "User Not Found", Toast.LENGTH_LONG)
                            .show()
                    }
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Kayıt Gerçekleştirmelisiniz",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }



        binding.buttonRegisterMain.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
            finish()
        }

    }



}