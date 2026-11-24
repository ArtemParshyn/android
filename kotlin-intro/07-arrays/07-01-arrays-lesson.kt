val temperatures = arrayOf(22, 25, 18, 30, 27, 19, 23)
val days = arrayOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс")

// Ваш код здесь

// ----

Максимальная температура: 30°C
День с максимальной температурой: Чт

// ----

val integers = arrayOf(5, 6, 7, 8)           // массив из чисел 5, 6, 7, 8
val strings = arrayOf("Яндекс", "Практикум") // массив из строк Яндекс и Практикум

// ----

val integers: Array<Int> = arrayOf(5, 6, 7, 8)
val strings: Array<String> = arrayOf("Яндекс", "Практикум")

// ----

val integers: Array<Int> = arrayOf(5, 6, 7, 8)
val a = integers[0] // a = 5
integers[0] = 1     // теперь массив состоит из элементов 1, 6, 7, 8

// ----

val integers: Array<Int> = arrayOf(5, 6, 7, 8)
integers = arrayOf(1, 2, 3) // ошибка: переменную integers менять нельзя
integers[0] = 1             // корректно: мы меняем не переменную, а содержимое массива

// ----

val integers: Array<Int> = arrayOf(5, 6, 7)
println(integers.size) // 3

// ----

val integers: Array<Int> = arrayOf(5, 6, 7)
integers[-1] = 5 // ошибка! индексы начинаются с 0
integers[3] = 0 // ошибка! в массиве всего 3 элемента и корректные интексы 0, 1, 2

// ----

val numbers = ArrayOf(10, 20, 30, 40)

numbers[0] = numbers[3]

println("${numbers[0]} ${numbers[3]} ${numbers.size}")
