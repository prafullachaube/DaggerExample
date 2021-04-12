package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DaggerSmartPhoneComponent.create().getSmartPhone().makeACallWithRecording()
        DaggerSmartPhoneComponent.create().smartPhoneInjection(this)
        smartPhone.makeACallWithRecording()
    }
}