package com.example.counterwithviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    var count:Int=0
     fun increase() {
        count++

    }
}