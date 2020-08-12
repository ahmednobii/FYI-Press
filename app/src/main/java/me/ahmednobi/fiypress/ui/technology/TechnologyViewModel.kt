package me.ahmednobi.fiypress.ui.technology

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.HOME
import me.ahmednobi.fiypress.utilities.TECHNOLOGY

class TechnologyViewModel : ViewModel() {
    val url : LiveData<String> = fetchSports()

    private fun fetchSports() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + TECHNOLOGY
        return mutableLiveData
    }
}