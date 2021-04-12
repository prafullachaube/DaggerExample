package com.example.daggerexample

import dagger.Module
import dagger.Provides

@Module
class Dagger2MemoryCardModule {

    @Provides
    fun providesMemoryCard(): Dagger2MemoryCard{
            return Dagger2MemoryCard()
    }

}