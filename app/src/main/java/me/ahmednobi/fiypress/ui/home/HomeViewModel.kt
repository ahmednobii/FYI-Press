package me.ahmednobi.fiypress.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.HOME

class HomeViewModel: ViewModel() {

    val homeUrl : LiveData<String> = fetchHome()

private fun fetchHome() :LiveData<String>{

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL+HOME
        return mutableLiveData
    }
}