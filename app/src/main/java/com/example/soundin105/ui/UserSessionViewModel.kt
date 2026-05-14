package com.example.soundin105.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class UserSessionViewModel : ViewModel(){
    private val _isLoggedIn = MutableStateFlow(false)
    private val _userName = MutableStateFlow("")
    private val _userEmail = MutableStateFlow("")

    val isLoggedIn : StateFlow<Boolean> = _isLoggedIn.asStateFlow()
    val userName : StateFlow<String> = _userName.asStateFlow()
    val userEmail : StateFlow<String> = _userEmail.asStateFlow()

    fun login(name:String, email:String){
        _userName.value = name
        _userEmail.value = email
        _isLoggedIn.value = true
    }
}