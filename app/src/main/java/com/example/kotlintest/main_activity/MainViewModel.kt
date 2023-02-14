package com.example.kotlintest.main_activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {


    // stateFlow
    private val _stateFlow = MutableStateFlow<AddedState>(AddedState())
    val getNumbersStateFlow = _stateFlow.asStateFlow()


    fun getFirstMethod(firstNum:Int , secondNum:Int):Int{
        return firstNum+secondNum
    }


    fun getAddedNumbers(firstNum:Int , secondNum:Int){
        val accumulatedNums = firstNum + secondNum
        _stateFlow.value = AddedState(addedNumbers = accumulatedNums)
    }


}

data class AddedState(
    val addedNumbers:Int = 0
)