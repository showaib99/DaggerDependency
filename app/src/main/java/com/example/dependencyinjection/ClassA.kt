package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class ClassA @Inject constructor() {
    fun startClassA() {
        Log.i("TAG", "ClassA is created")
    }
}