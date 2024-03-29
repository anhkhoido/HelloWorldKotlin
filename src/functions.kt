fun main() {

    // Calculate the estimated time of arrival (ETA).
    val eta = calculateETA(143.0, 92.0)
    println("$eta hour(s)")

    // Calculate your expected net worth.
    println("Your expected net worth is ${calculateExpectedNetWorth(25, 40000)}\$.")

    println()
    passFunctionToFilter()
}

fun calculateETA(distance: Double, speed: Double) : Double = distance / speed
fun calculateExpectedNetWorth(age : Int, income : Int) = (age * income) / 10

fun passFunctionToFilter() {
    val myList = listOf("Anh Khoi Do", "Patrick Senécal", "Firefox", "Sophie", "Inoue", "Eileen")
    println(myList.filter(fun(word: String) = !word.contains('a', true)))
}