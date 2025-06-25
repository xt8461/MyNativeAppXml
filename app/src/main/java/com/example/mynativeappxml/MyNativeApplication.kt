package com.example.mynativeappxml

import android.app.Application
import android.util.Log
import com.example.reactbrownfield.RNBridgeManager
import com.facebook.react.soloader.OpenSourceMergedSoMapping
import com.facebook.soloader.SoLoader

class MyNativeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, OpenSourceMergedSoMapping)
        RNBridgeManager.shared.initializeReactApp(this)
        Log.d("MyNativeApplication", "onCreate")
    }
}