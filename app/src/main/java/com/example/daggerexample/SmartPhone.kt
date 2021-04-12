package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(/*val battery: Battery*/val battery:Dagger2Battery, val simCard: SimCard, val memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i("SmartPhone", "SmartPhone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i("SmartPhone", "Calling.....")
    }
}