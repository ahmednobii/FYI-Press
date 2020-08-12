package me.ahmednobi.fiypress.ui.world

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.LOGIN
import me.ahmednobi.fiypress.utilities.TECHNOLOGY

class LoginViewModel : ViewModel() {
    val url : LiveData<String> = fetchLogins()

    private fun fetchLogins() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + LOGIN
        return mutableLiveData
    }
}