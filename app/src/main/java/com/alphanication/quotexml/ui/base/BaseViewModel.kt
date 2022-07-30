package com.alphanication.quotexml.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

    protected var disposables: CompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        disposables.apply {
            clear()
            dispose()
        }
        super.onCleared()
    }
}