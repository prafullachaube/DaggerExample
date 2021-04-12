package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init{

    }

    fun getPower(){
        Log.i("Battery","SmartPhone Called")
    }

}