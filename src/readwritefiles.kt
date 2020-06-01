import java.io.File

fun main() {
    val directory = "./resources"
    val filename = "catbreeds.txt"
    val myFile = File("${directory}/$filename")

    // This line of code tells the program to read the content of a file.
    myFile.forEachLine { println(it) }

    // Write to a file
    val fileWhereToStoreInput = File("${directory}/score.txt")

    // Warning: The instance method writeText(String string) of the File class
    // does not append strings to a given file. If you want to append new contents,
    // you must use the instance method named appendText(String string).
    fileWhereToStoreInput.writeText("Write something.")
}