package com.kshitij.ecommerceapp.ui.profile.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kshitij.ecommerceapp.R
import com.kshitij.ecommerceapp.ui.cart.view.CartActivity
import com.kshitij.ecommerceapp.ui.dashboard.view.DashboardActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

            val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

            bottomNavigationView.selectedItemId = R.id.profile

            bottomNavigationView.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.cart -> {
                        startActivity(Intent(applicationContext, CartActivity::class.java))
                        overridePendingTransition(0, 0)
                        return@setOnItemSelectedListener true
                    }
                    R.id.profile -> return@setOnItemSelectedListener true
                    R.id.dashboard -> {
                        startActivity(Intent(applicationContext, DashboardActivity::class.java))
                        overridePendingTransition(0, 0)
                        return@setOnItemSelectedListener true
                    }
                }
                return@setOnItemSelectedListener false
            }
        }
}
