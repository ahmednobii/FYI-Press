package me.ahmednobi.fiypress.ui.culture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.CULTURE
import me.ahmednobi.fiypress.utilities.HOME

class CultureViewModel : ViewModel() {
    val url : LiveData<String> = fetchCulture()

    private fun fetchCulture() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + CULTURE
        return mutableLiveData
    }
}