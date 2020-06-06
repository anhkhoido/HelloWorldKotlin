package com.helloworld.model

class Vehicle(val make: String, val model: String, val mileage: Double) {

    override fun hashCode(): Int {
        var result = make.hashCode()
        result = 31 * result + model.hashCode()
        result = 31 * result + mileage.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return make == other.make && model == other.model && mileage == other.mileage
        }
        return false;
    }

    override fun toString(): String {
        return "Make = ${make}, Model = ${model}, Mileage = ${mileage}"
    }

}