package com.example.dependencyinjection

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    /*val ClassC = ClassC()
    ClassC.startClassC()*/

    /*val classC = ClassC()
    classC.classA = ClassA()
    classC.classB = ClassB()
    classC.startClassC()*/

    /*val classA = ClassA()
    val classB = ClassB()
    val classC = ClassC(classA, classB)
        classC.startClassC()*/

    DaggerClassCComponent.create().getClassCInstance().startClassC()

    }
}