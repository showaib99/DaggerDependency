package com.example.dependencyinjection

import dagger.Component


@Component(modules = [ClassABModule::class])
interface ClassCComponent {

    fun getClassCInstance():ClassC
}