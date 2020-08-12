package me.ahmednobi.fiypress.ui.economy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.ECONOMY
import me.ahmednobi.fiypress.utilities.HOME

class EconomyViewModel : ViewModel() {
    val url : LiveData<String> = fetchEconomy()

    private fun fetchEconomy() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + ECONOMY
        return mutableLiveData
    }}