import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 100)
    val x = number.toChar()
    when {
        x.isDigit() -> println("$x - это цифра")
        x.isLetter() -> println("$x - это буква")
        else -> println("$x - это символ")
    }
}
