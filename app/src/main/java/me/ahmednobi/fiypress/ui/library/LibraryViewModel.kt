package me.ahmednobi.fiypress.ui.library

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.HOME
import me.ahmednobi.fiypress.utilities.LIBRARY

class LibraryViewModel : ViewModel() {
    val url : LiveData<String> = fetchLibrary()

    private fun fetchLibrary() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + LIBRARY
        return mutableLiveData
    }}