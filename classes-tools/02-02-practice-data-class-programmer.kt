// Объявление data-класса
data class Programmer(val name: String, val language: String)

fun main() {
    // Создание первого экземпляра
    val nikolayJava = Programmer("Николай", "java")
    // Создание второго экземпляра на основании первого
    val nikolayKotlin = nikolayJava.copy(language = "Kotlin")
    // Не забудьте про вывод в консоль
    println(nikolayJava)
    println(nikolayKotlin)
}
