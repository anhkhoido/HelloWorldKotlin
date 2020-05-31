/**
 * The main function.
 *
 * @author Anh Khoi Do
 * @param args  - An array of Strings the user typed at the command line.
 */
fun main(args: Array<String>) {
    demonstrateWhenStatement(3000)
    demonstrateIfStatementAfterAssignmentSymbol(true)
    demoForLoopWithList()
    demoForLoopWithNumbers()

    println("Laval, a suburb of Montreal, is an anagram: " + isAnagram("laval"))
    println("My first name is an anagram: " + isAnagram("Anh Khoi"))
}

fun demonstrateWhenStatement(score: Int) {
    val yourLevel : String = when(score) {
        in 0..999 -> "Beginner"
        in 1_000..1_999 -> "Intermediate"
        in 2_000..10_000 -> "Brutal"
        else -> "Death incarnate"
    }
    println("Your are at the $yourLevel level.")
}

fun demonstrateIfStatementAfterAssignmentSymbol(condition: Boolean) {
    val answer : String = if (condition) "Your answer is true" else "Your answer is false"
    println(answer)
}

fun demoForLoopWithList() {
    val novelists = listOf<String>("Emile Zola", "Alice Munro", "Joy Kogawa", "Viet Thanh Nguyen")
    for (novelist in novelists) {
        println(novelist)
    }

    val listThatAllowsEdits = mutableListOf<String>("Alice Munro", "Joy Kogama", "Emile Zola", "Viet Thanh Nguyen")
    listThatAllowsEdits.removeAt(2)
}

fun demoForLoopWithNumbers() {
    // Inclusive
    for (number in 0..10) println(number)

    // From zero to nine.
    for (number in 0 until 10) println(number)

    // Decrement all the way to zero.
    for (number in 10 downTo 0) println(number)

    // By increment of 2 steps all the way to ten.
    for (number in 0..10 step 2) println(number)
}

fun isAnagram(str : String) : Boolean {
    return when(!str.isNullOrEmpty()) {
        str.equals(StringBuilder(str).reverse().toString(), true) -> true
        else -> false
    }
}