package com.example.mynativeappxml

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reactbrownfield.RNViewFactory
import com.example.reactbrownfield.RootComponent

class RNAppFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return RNViewFactory.createFrameLayout(requireContext(), requireActivity(), RootComponent.Main)
    }

}
