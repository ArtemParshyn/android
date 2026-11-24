enum class Week(val localizedName: String) {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    fun isWeekend(): String {
        return if (this == SATURDAY || this == SUNDAY) "выходной" else "будний"
    }
}

fun main() {
    for (day in Week.values()) {
        println("${day.localizedName} - ${day.isWeekend()} день")
    }
}
