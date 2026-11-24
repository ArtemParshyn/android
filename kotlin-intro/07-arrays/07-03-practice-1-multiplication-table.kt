val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

numbers.forEach { n ->
    println("Таблица умножения на $n")
    numbers.forEach { m ->
        println("$n * $m = ${n * m}")
    }
}
