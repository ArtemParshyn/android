class Animal(
    name: String,
    age: Int
) {
    init {
        println("Создаём класс Animal с именем $name и возрастом $age")
    }
}

// ----

class Animal(
    name: String,
    age: Int
) {
    init {
        print("Создаём класс Animal с именем $name ")
    }
    init {
        println("и возрастом $age")
    }
}

// ----

Animal("Тузик", 9)
// Вывод: создаём класс Animal с именем Тузик и возрастом 9

// ----

class Animal(
    name: String,
    age: Int
) {
    constructor(name: String) : this(name, name.length) {
        // Тут может быть код
    }
}

// ----

class Animal(
    name: String,
    age: Int
) {
    init {
        println("Блок init 1")
    }
    constructor(name: String) : this(name, name.length) {
        println("Вторичный конструктор")
    }
    init {
        println("Блок init 2")
    }
}

// ----

Блок init 1
Блок init 2
Вторичный конструктор

// ----

Animal("Тузик", 8) // Ожидаемый вывод: ТУЗИК
Animal("Мура", 3) // Ожидаемый вывод: мура
Animal("мУхТаР") // Ожидаемый вывод: мУхТаР

// ----

class Animal(
    name: String,
    age: Int
) {
    val animalName = name
    val animalAge = age
}

// ----

class Animal(
    val name: String,
    val age: Int
)

// ----

val myAnimal = Animal("Тузик", 8)
println(myAnimal.name) // Вывод: Тузик

// ----

class Animal() {
    var count = 0
    val name: String
        get() {
            println("Привет, меня вызвали!")
            count = count + 1
            return "Тузик номер $count"
        }
}

// ----

val animal = Animal()

println(animal.name)
println(animal.name)
println(animal.name)

// ----

Привет, меня вызвали!
Тузик номер 1
Привет, меня вызвали!
Тузик номер 2
Привет, меня вызвали!
Тузик номер 3

// ----

class Animal() {
    var name: String = ""
        set(value) {
            field = value.lowercase()
        }
}

// ----

class Animal() {
    var name: String = ""
        set(value) {
            field = value.lowercase()
        }
        get() {
            return "Поле: $field"
        }
}

// ----

val animal = Animal()

animal.name = "Тузик"
println(animal.name) // Вывод: Поле: Тузик
