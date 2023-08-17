package com.example.sampleapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModelMap: Map<Class<out ViewModel>, Provider<ViewModel>>
): ViewModelProvider.Factory {

}













