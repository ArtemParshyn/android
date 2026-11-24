fun greet() {
    println("Привет!")
}

fun greet(name: String) {
    println("Привет, $name!")
}

// ----

class Animal {
    fun setParams(name: String, age: Int, height: Int) {
        // Код
    }

    fun setParams(name: String, age: Int) {
        setParams(name, age, -1)
    }

    fun setParams(name: String) {
        setParams(name, -1, -1)
    }
}

// ----

class Animal {
    fun setParams(name: String, age: Int = -1, height: Int = -1) {
        println("Имя: $name, возраст: $age, высота: $height")
    }
}

// ----

val animal = Animal()
animal.setParams("Тузик", 9, 20) // Вывод: Имя Тузик, возраст 9, высота 20

animal.setParams("Тузик", 9) // Вывод: Имя Тузик, возраст 9, высота -1

animal.setParams("Тузик") // Вывод: Имя Тузик, возраст -1, высота -1

// ----

val animal = Animal()
animal.setParams(
    height = 10,
    name = "Тузик",
    age = 9
)

// ----

val animal = Animal()
animal.setParams(
    "Тузик",
    height = 10
)

// ----

class Animal(
    val name: String,
    val age: Int = -1
)

// ----

val dog = Animal(
    "Тузик"
)
val cat = Animal(
    age = 10,
    name = "Мурка"
)
