package com.example.mynativeappxml

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.facebook.react.ReactFragment
import com.facebook.react.defaults.DefaultReactHost

class MainActivity : AppCompatActivity() {

    private lateinit var showRNAppButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        RNBridgeManager.shared.initialize(this.application)
        val rnAppFragment = RNAppFragment()
        showRNAppButton = findViewById(R.id.show_rn_app_btn)
        showRNAppButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, rnAppFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}