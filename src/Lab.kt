import java.io.File
import java.lang.StringBuilder

fun main() {
    var file = File("src\\Numbers.txt")

    val match = "(?:\\+7 (?:\\()?\\d{3}(?:\\))? )?(?:\\d{3}[- ]\\d{2}[- ]\\d{2})+".toRegex().findAll(file.readText())
    val result = StringBuilder()
    for (ma in match)
        result.append(ma.value + " ")

    println(result)
}