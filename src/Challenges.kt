fun main() {

    // Challenge 1: How to filter a sequence and convert it to a List<T> in Kotlin.
    val result = (0 until 100).asSequence().map { it }.filter { it % 10 == 0 }.toList()
    println(result)
}