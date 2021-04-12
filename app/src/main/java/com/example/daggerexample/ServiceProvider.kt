package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){
    init {
        Log.i("ServiceProvider","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("ServiceProvider","Service provider connected")
    }
}