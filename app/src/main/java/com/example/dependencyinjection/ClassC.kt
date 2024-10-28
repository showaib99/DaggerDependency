package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class ClassC @Inject constructor (private val classA: ClassA, private val classB: ClassB) {
    /*private val classA = ClassA()
    private val classB = ClassB()*/

    /*lateinit var classA: ClassA
    lateinit var classB: ClassB*/


    fun startClassC(){
        classA.startClassA()
        classB.startClassB()

        Log.i("TAG", "ClassC is created")
    }
}