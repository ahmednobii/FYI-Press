package me.ahmednobi.fiypress.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.HOME
import me.ahmednobi.fiypress.utilities.NEWS
import me.ahmednobi.fiypress.utilities.SPORTS

class NewsViewModel : ViewModel() {
    val url : LiveData<String> = fetchNews()

    private fun fetchNews() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + NEWS
        return mutableLiveData
    }}