package com.example.mynativeappxml

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reactbrownfield.RNViewFactory
import com.facebook.react.ReactRootView

class RNAppFragment : Fragment() {
    private var rnRootView: ReactRootView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        try {
            rnRootView = RNViewFactory().createFrameLayout(requireContext()) as ReactRootView?
            return rnRootView

        } catch (e: Exception) {
            Log.e("RNAppFragment", "Error creating RN View", e)
            return null
        }
    }

    override fun onDestroyView() {
        rnRootView?.unmountReactApplication()
        rnRootView = null
        super.onDestroyView()
    }
}
