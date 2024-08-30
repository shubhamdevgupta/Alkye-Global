package com.androiddev.alkyeglobal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androiddev.alkyeglobal.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}