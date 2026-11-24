val students = mapOf(
    "Анна" to listOf(5, 4, 5, 5, 4),
    "Алёна" to listOf(5, 5, 5, 5, 5),
    "Кирилл" to listOf(3, 4, 5, 3, 4),
    "Григорий" to listOf(3, 3, 4, 3, 4),
    "Светлана" to listOf(5, 5, 5, 5, 4),
    "Саша" to listOf(4, 4, 4, 3, 5),
    "Степан" to listOf(2, 3, 3, 2, 4),
    "Антон" to listOf(2, 2, 3, 3, 3),
    "Катя" to listOf(3, 3, 4, 5, 4),
    "Стас" to listOf(5, 5, 5, 5, 4),
)

val result = students.mapValues { it.value.average() }.filter { it.value >= 4 }.map { it.key }

println(result)
