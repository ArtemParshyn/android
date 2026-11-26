// Переменная с типом Int
val myHappyNumber: Int = 7
// Переменная с типом String
val myNameAndLastName: String = "Andrey Breslav"

class Cat

// Переменная с типом Cat (нуллабельная, поэтому потенциально в переменную можно записать null)
val myCat: Cat? = Cat()

// Благодаря способности компилятора выводить типы из конкретных значений, в большинстве случаев явное указание типа можно опустить.
val someNumber = 789

// ----

val someNumber: Any = 8

val someString: Any = "string"

val someCat: Any = Cat()

// ----

val someNumber: Any? = 8

val someNullValue: Any? = null

// ----

val any: Any? = Any()

// ----

class Cat

fun main() {
    val cat = Cat()
    cat.equals(cat)
    cat.hashCode()
    cat.toString()
}

// ----

val a = Person("Alice", 30)
val b = Person("Alice", 30)
println(a == b) // false, хотя данные одинаковые

// ----

class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)
    val person3 = Person("Bob", 25)

    println(person1 == person2) // По умолчанию: false (разные ссылки)
    println(person1 == person1) // true (одна и та же ссылка)
}

// ----

class Person(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true // Если это один и тот же объект
        if (other !is Person) return false // Если сравниваемый объект не Person

        return name == other.name && age == other.age // Сравниваем по содержимому полей
    }

    // hashCode() также должен быть переопределен, если переопределен equals()
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)
    val person3 = Person("Bob", 25)

    println(person1 == person2) // Теперь: true
    println(person1 == person3) // false
}

// ----

// Пример без переопределения
class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 30)
    println(person) // Выведет что-то вроде: Person@1a2b3c4d
}

// ----

class Person(val name: String, val age: Int) {
    // ... equals() и hashCode() ...

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    val person = Person("Alice", 30)
    println(person) // Выведет: Person(name='Alice', age=30)
}

// ----

data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)
    val person3 = Person("Bob", 25)

    println(person1 == person2) // true (автоматически сгенерированный equals())
    println(person1)           // Person(name=Alice, age=30) (автоматически сгенерированный toString())

    val setOfPeople = hashSetOf(person1)
    println(setOfPeople.contains(person2)) // true (автоматически сгенерированный hashCode())
}

// ----

class Cat(
    val name: String,
    val color: String,
    val age: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cat) return false
        if (name != other.name) return false
        if (color != other.color) return false
        if (age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + color.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "Cat(name='$name', color='$color', age=$age)"
    }
}

// ----

fun main() {
    val catA = Cat("Мурзик", "рыжий", 3)
    val catB = Cat("Мурзик", "рыжий", 3)
    val catC = Cat("Барсик", "черный", 5)
    val catD = Cat("Мурзик", "рыжий", 4) // Только возраст отличается
    val catE = Cat("Мурзик", "рыжий", 3) // Аналогичен catA и catB

    val catSet = hashSetOf<Cat>()
    catSet.add(catA)
}

// ----

import kotlin.random.Random

// Возвращает Int
fun getRandomInt(): Int {
    return Random.nextInt()
}

// На самом деле возвращает Unit
fun printSomething() {
    print("Something")
}

// ----

val printSeven: Unit = print(7)

// ----

// Буквой T обозначается тип, который будет передан на этапе вызова функции/использования класса
internal interface Processor<T> {
    fun process(): T
}

class ProcessorWithoutResult : Processor<Unit> {

    // обратите внимание, что функция возвращает тип Unit, но в объявлении этого не указано
    override fun process() {
        // не нужно писать ключевое слово return и возвращать какое-то значение
    }
}
