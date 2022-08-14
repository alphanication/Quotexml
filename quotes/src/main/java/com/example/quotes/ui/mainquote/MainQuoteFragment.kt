package com.example.quotes.ui.mainquote

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.quotes.base.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

class MainQuoteFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.example.quotes.R.layout.fragment_main_quote, container, false)
    }
}