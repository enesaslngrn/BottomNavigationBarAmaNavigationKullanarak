package com.enesas.bottomnavigationbaramanavigationkullanarak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.enesas.bottomnavigationbaramanavigationkullanarak.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    Navigation.findNavController(this,R.id.fragmentContainerView).navigate(R.id.homeFragment)
                    true
                }
                R.id.person -> {
                    Navigation.findNavController(this,R.id.fragmentContainerView).navigate(R.id.profileFragment)
                    true
                }
                R.id.settings -> {
                    Navigation.findNavController(this,R.id.fragmentContainerView).navigate(R.id.settingsFragment)
                    true
                }
                else -> false
            }
        }

    }
}