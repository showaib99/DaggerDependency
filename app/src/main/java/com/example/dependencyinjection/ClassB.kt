package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class ClassB @Inject constructor(){
    fun startClassB() {
        Log.i("TAG", "ClassB is created")
    }
}