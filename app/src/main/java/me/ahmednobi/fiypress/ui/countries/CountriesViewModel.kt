package me.ahmednobi.fiypress.ui.countries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.COUNTRIES
import me.ahmednobi.fiypress.utilities.HOME

class CountriesViewModel : ViewModel() {
    val url : LiveData<String> = fetchCountries()

    private fun fetchCountries() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + COUNTRIES
        return mutableLiveData
    }
}