package me.ahmednobi.fiypress.ui.health

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.HEALTH
import me.ahmednobi.fiypress.utilities.HOME

class HealthViewModel : ViewModel() {
    val url : LiveData<String> = fetchHealth()

    private fun fetchHealth() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + HEALTH
        return mutableLiveData
    }}