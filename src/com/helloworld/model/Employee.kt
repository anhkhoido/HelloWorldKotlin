package com.helloworld.model

class Employee(firstName: String, ssn: String, val jobTitle: String, val hourlyRate: Double) : Person(firstName, ssn) {
    var totalHours = 0.0

    override fun getName(): String {
        return firstName
    }

    fun trackHours(hours: Double) {
        totalHours += hours
    }

    fun doWork() {
        println("Doing ${jobTitle} work.")
    }
}