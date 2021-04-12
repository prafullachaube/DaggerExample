package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class ExideBattery @Inject constructor(): Dagger2Battery{

    override fun getPower() {
        Log.i("ExideBattery" , "ExideBattery Get Power")
    }

}