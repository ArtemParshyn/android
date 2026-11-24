// Тема 3, урок 3 «Приведение типов», практика 2 — ПРОЙДЕНО («Ура! Вы справились!»)
// (TODO-комментарии из шаблона оставлены после кода, они не мешают)
fun main() {
    val guests = 5  // количество гостей

    val neededChocolates: Double = guests * 0.5

    val chocolatesToBuy: Int = Math.ceil(neededChocolates).toInt()

    println("Для $guests гостей нужно купить $chocolatesToBuy шоколадок")
}
