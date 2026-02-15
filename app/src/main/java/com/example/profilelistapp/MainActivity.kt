package com.example.profilelistapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.profilelistapp.databinding.ActivityMainBinding

/**
 * Course: MAD302
 * Lab: LAB 1
 * Name: Ashish Prajapati
 * Student ID: A00194842
 * Date: 2023-02-14
 *
 * Description:
 * This application allows the user to enter a name and age,
 * add profiles to a list, and display all profiles on screen.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val profiles = mutableListOf<Profile>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Lifecycle", "onCreate called")

        // Button click logic
        binding.addProfile.setOnClickListener {


            val name = binding.addName.text.toString()
            val age = binding.yourAge.text.toString().toInt()

            val profile = Profile(name, age)

            // Add profile
            profiles.add(profile)


            displayProfiles()
        }
    }


    private fun displayProfiles() {
        val builder = StringBuilder()

        // Loop through profiles list
        for (profile in profiles) {
            builder.append("${profile.name} – ${profile.age}\n")
        }

        binding.yourData.text = builder.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy called")
    }
}
