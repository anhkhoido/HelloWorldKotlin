package com.helloworld.model

abstract class Person(val firstName: String, val ssn: String) {
    abstract fun getName() : String
}