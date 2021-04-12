package com.example.daggerexample

import dagger.Component
import dagger.Module

@Component(modules = [Dagger2MemoryCardModule::class, ExideBatteryModule::class])
interface SmartPhoneComponent {

   // fun getSmartPhone(): SmartPhone

    fun smartPhoneInjection(mainActivity: MainActivity)
}