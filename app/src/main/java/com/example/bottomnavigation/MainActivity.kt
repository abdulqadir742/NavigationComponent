package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
    val navController = navHostFragment.navController

    NavigationUI.setupWithNavController(bottomNavigationView, navController)

    }
}