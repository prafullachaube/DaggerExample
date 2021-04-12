package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class ExideBatteryModule {

   /* fun  providesBattery() : Dagger2Battery{
            return ExideBattery()
    }*/

  /*  @Provides
    fun providesBattery(exideBattery: ExideBattery) : Dagger2Battery{
        return exideBattery
    }*/
    @Binds
 abstract fun providesBattery(exideBattery: ExideBattery) : Dagger2Battery


}