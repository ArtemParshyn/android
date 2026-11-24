val colorsList = listOf<String>()
val colorsMap = mapOf<String, String>()
val colorsSet = setOf<String>()

// получение итератора для List.
val listIterator = colorsList.iterator()

// получение итератора для Set.
val setIterator = colorsSet.iterator()

// для Map мы сначала получаем сет ключей из свойства keys, а потом из него итератор. Так мы можем итерироваться по всем ключам Map.
val mapIterator = colorsMap.keys.iterator()

// ----

val list = listOf("a", "b", "c")
for (item in list) {
   println(item)
}
// Эквивалентно:
val iterator = list.iterator()
while (iterator.hasNext()) {
   val item = iterator.next()
   println(item)
}

// ----

val colors = mutableListOf<String>()
colors.add("Каждый")
colors.add("охотник")
colors.add("желает")
colors.add("знать")
colors.add("где")
colors.add("сидит")
colors.add("фазан")

println("Список до выполнения цикла: $colors")

for (i in 0 until colors.size) {
    val element = colors[i]
    if (element.contains("а")) { // удаляем слова, которые содержат в себе букву «а»
        colors.removeAt(i)
    }
}

println("Список после выполнения цикла: $colors")

// ----

Список до выполнения цикла: [Каждый, охотник, желает, знать, где, сидит, фазан]
Список после выполнения цикла: [охотник, где, сидит]

// ----

java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 4

// ----

val colors = listOf<String>()
colors.add("Каждый")
colors.add("охотник")
colors.add("желает")
colors.add("знать")
colors.add("где")
colors.add("сидит")
colors.add("фазан")

println("Список до выполнения цикла: $colors")

val iterator = colors.iterator()

while (iterator.hasNext()) { // до тех пор, пока есть непройденный элемент в списке
    val element = iterator.next() // получаем следующий элемент
    if (element.contains("а")) {
        iterator.remove() // для удаления используем метод remove() у итератора (не списка)
    }
}

println("Список после выполнения цикла: $colors")

// ----

Список до выполнения цикла: [Каждый, охотник, желает, знать, где, сидит, фазан]
Список после выполнения цикла: [охотник, где, сидит]

// ----

val map = mapOf(
    "apple" to 5,
    "banana" to 3,
    "orange" to 7
)

// Способ 1: for-in по свойству keys
for (key in map.keys) {
    println("Ключ: $key Значение: ${map[key]}")
}

// Способ 2: итератор по свойству key
val keysIterator = map.keys.iterator()
while (keysIterator.hasNext()) {
    val key = keysIterator.next()
    println("Ключ: $key, Значение: ${map[key]}")
}

// ----

val map = mapOf(
    "apple" to 5,
    "banana" to 3,
    "orange" to 7
)

// Способ 1: for-in по свойству values
for (value in map.values) {
    println("Значение: $value")
}

// Способ 2: итератор по свойству values
val valuesIterator = map.values.iterator()
while (valuesIterator.hasNext()) {
    val value = valuesIterator.next()
    println("Значение: $value")
}

// ----

val map = mapOf(
    "apple" to 5,
    "banana" to 3,
    "orange" to 7
)

// Способ 1: простой for-in
for ((key, value) in map) {
    println("$key -> $value")
}

// Способ 2: for in по полю entries
for (entry in map.entries) {
    println("${entry.key} -> ${entry.value}")
}

// Способ 3: итератор по полю entries
val entriesIterator = map.entries.iterator()
while (entriesIterator.hasNext()) {
    val entry = entriesIterator.next()
    println("${entry.key} -> ${entry.value}")
}

// ----

val mutableMap = mutableMapOf(
    "apple" to 5,
    "banana" to 3,
    "orange" to 7,
    "grape" to 0
)

val iterator = mutableMap.entries.iterator()
while (iterator.hasNext()) {
    val entry = iterator.next()
    if (entry.value == 0) {
        iterator.remove() // Удаляем пары с нулевым значением
    }
}

println(mutableMap) // {apple=5, banana=3, orange=7}
