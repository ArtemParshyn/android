val name = "Барсик"
val age = 3
val color = "серый"

// ----

class Cat {
    val name = "Барсик"
    val age = 3
    val color = "серый"
}

// ----

val myCat = Cat()

// ----

class Animal

// ----

class Animal {
    // Тело класса, здесь можно будет описать свойства и поведение
}

// ----

class Animal

val myAnimal = Animal()

// ----

class Programmer(
    // свойство, передаётся при создании
    val name: String
) {
    // ещё одно свойство
    val language: String = "Kotlin" 

    // метод — что умеет делать программист
    fun writeCode() {
        println("$name пишет код на $language")
    }
}

// ----

class Animal constructor(
    name: String,
    age: Int
)

// ----

class Animal(
    name: String, 
    age: Int
)

// ----

val dog = Animal("Тузик", 9)

// ----

class Animal(name: String, age: Int) {

    constructor(name: String) : this(name, -1) {
        // Тут может быть какой-то код
        println("Возраст животного не известен")
    }
}

// ----

val dog = Animal("Тузик", 9)
val cat = Animal("Мурка") // age = -1

// ----

class Animal private constructor(name: String, age: Int) {

    constructor(name: String) : this(name, -1)
}

// ----

// Ошибка компиляции, нельзя вызвать приватный конструктор
val dog = Animal("Тузик", 9)

// ----

// Этот объект с неизвестным возрастом успешно создаётся
val cat = Animal("Мурка") // age = -1

// ----

Уточните имя у студента

// ----

data class Dog(
    val name: String,
    val breed: String
)

// ----

// Создаём объект -- немецкую овчарку по имени Чарли 
val shepardCharlie = Dog("Charlie", "German shepard")

// Так как собаки -- животные социальные, создадим Чарли друга по имени Итчи
val sausageItchy = Dog("Itchy", "Sausage dog")

// ----

val sausageItchy = Dog("Itchy", "Sausage dog")

println(sausageItchy)

// Что выведется в консоль
"Dog(name = "Itchy", breed = "Sausage dog")"

// ----

println(sausageItchy)

// ----

Dog@27716f4

// ----

Dog(name=Itchy, breed=Sausage dog)

// ----

val shepardCharlie = Dog("Charlie", "German shepard")

// Вызовите у существующего объекта метод copy и укажите отличающееся свойство
val shepardRex = shepardCharlie.copy(name = "Rex")

// ----

Programmer(name=Николай, language=java)

Programmer(name=Николай, language=Kotlin)
