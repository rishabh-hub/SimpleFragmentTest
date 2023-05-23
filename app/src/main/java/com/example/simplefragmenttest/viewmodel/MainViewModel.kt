package com.example.simplefragmenttest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simplefragmenttest.model.DataModel

class MainViewModel:ViewModel() {

    private val model=DataModel("Here is the updated text")


    val uiTextLiveData=MutableLiveData<String?>()

    fun getUpdatedText()
    {
        val updatedText=model.textForUI
        uiTextLiveData.postValue(updatedText)
    }
}