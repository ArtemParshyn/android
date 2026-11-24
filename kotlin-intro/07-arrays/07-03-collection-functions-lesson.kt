val list = listOf("Один", "Два", "Три")

for (item in list) {
    println(item) 
}

// ----

val list = listOf("Один", "Два", "Три")

list.forEach { element -> println(element) }

// ----

Один
Два
Три

// ----

val list = listOf("Один", "Два", "Три")

// здесь у лямбда-выражения два параметра: index — текущий индекс, element — элемент из списка по заданному индексу
list.forEachIndexed { index, element -> println("'$element' находится на позиции $index") }

// ----

'Один' находится на позиции 0
'Два' находится на позиции 1
'Три' находится на позиции 2

// ----

fun main(){
    val list = listOf("Один", "Два", "Три")

    list.forEach { element -> println(element) }
    list.forEachIndexed { index, element -> println("'$element' находится на позиции $index") }

    // Set также имеет методы forEach() и forEachIndexed()
    val stringsSet = setOf("Один", "Два", "Три")
    stringsSet.forEach { element -> println(element) }
    stringsSet.forEachIndexed { index, element -> println("'$element' находится на позиции $index") }
}

// ----

val numbers = listOf(1, 3, 4, 8, 7)
val result = numbers.map { number -> if (number % 2 == 0) number * 2 else number * 3 }

// выводим состояние коллекции до изменения
println("numbers = $numbers")
// выводим состояние коллекции после изменения
println("result = $result")

// ----

numbers = [1, 3, 4, 8, 7]
result = [3, 9, 8, 16, 21]

// ----

val numbers = listOf(1, 3, 4, 8, 7)
// для каждого элемента списка будет вызван метод toString(), который из объекта типа Int создаёт объект типа String
val result = numbers.map { number -> number.toString() }

// ----

fun main(){
    val numbers: List<Int> = listOf(1, 3, 4, 8, 7)

    // в качестве параметра лямбда-выражения нам доступен индекс текущего элемента
    val stringsWithIndexes = numbers.mapIndexed { index, element -> "индекс = $index - элемент: $element" }

    // все нечётные числа будут исключены из коллекции
    val onlyEvens = numbers.mapNotNull { element -> if (element % 2 == 0) element else null }

    println(stringsWithIndexes)
    println(onlyEvens)
}

// ----

val persons = mapOf(
    "Катя" to 17,
    "Ольга" to 21,
    "Кирилл" to 21,
    "Ян" to 15
)

println(persons.mapKeys { person -> person.key.length })  // теперь ключи — длина имени {2=15, 4=17, 5=21, 6=21}
println(persons.mapValues { person -> person.value * 2 }) // значения увеличились вдвое {Катя=34, Ольга=42, Кирилл=42, Ян=30}

// ----

val numbers = listOf(1, 3, 4, 8, 7)
// оставляем только нечётные значения
val onlyOds = numbers.filter { element -> element % 2 != 0 }

println(onlyOds)

// ----

[1, 3, 7]

// ----

fun main(){
    val numbers = listOf(1, 3.1f, 4.2, 8L, null, 7, null)

    // оставляем только те элементы, которые являются объектами класса Int (в том числе null) или число с индексом 1
    val filterIndexed = numbers.filterIndexed { index, number -> number is Int? || index == 1 }

    // исключаем все null из коллекции
    val withoutNulls = numbers.filterNotNull()

    // оставляем только значения типа Int (без null)
    val onlyInts = numbers.filterIsInstance<Int>()

    println(filterIndexed)
    println(withoutNulls)
    println(onlyInts)
}

// ----

val persons = mapOf(
    "Катя" to 17, // ключ — имя, значение — возраст
    "Ольга" to 21,
    "Кирилл" to 21,
    "Андрей" to 15
)
val adults = persons.filter { person -> person.value >= 18 }
val names = adults.map { person -> person.key }
val sortedNames = names.sorted()
println(sortedNames)

// ----

[Кирилл, Ольга]

// ----

val persons = mapOf(
    "Катя" to 17,
    "Ольга" to 21,
    "Кирилл" to 21,
    "Андрей" to 15
)

val result = persons.filter { person -> person.value >= 18 }
    .map { person -> person.key }
    .sorted()

println(result)

// ----

[Кирилл, Ольга]
