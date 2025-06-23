package com.example.mynativeappxml

import android.app.Application
import android.util.Log
import com.example.reactbrownfield.RNBridgeManager
import com.facebook.soloader.SoLoader

class MyNativeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
        RNBridgeManager.shared.initialize(this)
        Log.d("MyNativeApplication", "onCreate")
    }
}