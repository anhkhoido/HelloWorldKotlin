fun main() {

    // Challenge 1: How to filter a sequence and convert it to a List<T> in Kotlin.
    val result = (0 until 100).asSequence().map { it }.filter { it % 10 == 0 }.toList()
    println(result)

    println()

    // Challenge 2: Remove duplicates from a List<T> of films I recommend!
    val greatFilms = listOf("Crouching Tiger, Hidden Dragon", "The Farewell", "Where the Truth Lies", "Pontypool", "The Sweet Hereafter", "Pontypool", "Maps to the Stars", "In the Mood for Love", "2046", "The Sweet Hereafter", "Get Out", "Get Out", "Sicario")
    removeDuplicatesFromCollection(greatFilms)
}

fun removeDuplicatesFromCollection(list: Collection<String>) {
    val removingDuplicates = list.toSet()
    for (film in removingDuplicates) {
        println(film)
    }
}