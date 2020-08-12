package me.ahmednobi.fiypress.ui.art

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.ARTS
import me.ahmednobi.fiypress.utilities.BASEURL

class ArtViewModel : ViewModel() {
    val artUrl : LiveData<String> = fetchArt()

    private fun fetchArt() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + ARTS
        return mutableLiveData
    }
}