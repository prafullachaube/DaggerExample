package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private  val serviceProvider: ServiceProvider) {

    init {
        Log.i("SimCard","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }

}