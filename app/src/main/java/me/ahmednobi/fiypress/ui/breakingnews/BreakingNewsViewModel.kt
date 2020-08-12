package me.ahmednobi.fiypress.ui.breakingnews

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahmednobi.fiypress.utilities.BASEURL
import me.ahmednobi.fiypress.utilities.BREAKINGNEWS
import me.ahmednobi.fiypress.utilities.HOME

class BreakingNewsViewModel : ViewModel() {
    val url : LiveData<String> = fetchBreakingNews()

    private fun fetchBreakingNews() : LiveData<String> {

        val mutableLiveData  = MutableLiveData<String> ()
        mutableLiveData.value = BASEURL + BREAKINGNEWS
        return mutableLiveData
    }
}