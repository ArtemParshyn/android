// Поля класса, которые должны быть переданы при создании класса
class MobilePhone(
    private val model: String,
    private val processor: String,
    private val memory: Int
) {

    // Поля, которые могут быть заданы и изменены во время работы программы
    var isSilenceMode = false
    var battery = 74

    // Методы
    fun call(number: String?) {
        // Позвонить по номеру [number]
    }

    fun takePhoto() {
        // Сделать фото
    }
}
// ----

class Movie(
    val title: String,
    val rating: Int,
    val ageLimit: Int
) {
    // Метод isOnlyForAdult помогает определить, можно ли такие фильмы показывать детям
    // и не выполняет никакой логики (сравните это с методом call() у класса MobilePhone)
    fun isOnlyForAdult(): Boolean = ageLimit >= 18
}
// ----

class HoneyBadger(
    val color: String,
    val weight: Int
) {
    // Медоеду плевать, у него нет страха!!!
    val hasFear: Boolean = false
    var isWellFed: Boolean = true

    fun eatEverything() {
        if (!isWellFed) {
            // Съесть мышь, а может быть кобру? Голодный медоед съест всё!
        }
    }

    fun digHole() {
        // Рыть яму
    }
}
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
)
// ----

val darthVader: User = User(
    name = "Энакин",
    surname = "Скайуокер",
    age = 44,
    userInfo = "Я твой отец"
)

val lukeSkywalker: User = User(
    name = "Люк",
    surname = "Скайуокер",
    age = 23,
    userInfo = "И да пребудет с тобой сила"
)
// ----

println("${darthVader.name} ${darthVader.surname}")
println("${lukeSkywalker.name} ${lukeSkywalker.surname}")
// ----

Энакин Скайуокер
Люк Скайуокер
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    fun fullName(): String = "$name $surname"
}

println(darthVader.fullName())
println(lukeSkywalker.fullName())
// ----

Энакин Скайуокер
Люк Скайуокер
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    fun fullName(): String = "$name $surname"
}
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    fun fullName(): String = "$name $surname"
   
    override fun equals(other: Any?): Boolean {
        // в Kotlin для сравнения ссылок используется тройное "равно" (===)
        if (this === other) return true
        if (other !is User) return false

        // двойное равно (==) сравнивает объекты, используя метод equals()
        if (name != other.name) return false
        if (surname != other.surname) return false
        if (age != other.age) return false
        if (userInfo != other.userInfo) return false

        return true
    }
}
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    fun fullName(): String = "$name $surname"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (name != other.name) return false
        if (surname != other.surname) return false
        if (age != other.age) return false
        if (userInfo != other.userInfo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + age
        result = 31 * result + userInfo.hashCode()
        return result
    }
}
// ----

println(darthVader)
println(lukeSkywalker)
// ----

...$User@541e3a7b
...$User@3535d028
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {

    fun fullName(): String = "$name $surname"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (name != other.name) return false
        if (surname != other.surname) return false
        if (age != other.age) return false
        if (userInfo != other.userInfo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + age
        result = 31 * result + userInfo.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(name='$name', surname='$surname', age=$age, userInfo='$userInfo')"
    }
}
// ----

class Ship(val name: String, val speed: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ship) return false

        if (name != other.name) return false
        if (speed != other.speed) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + speed
        return result
    }

    override fun toString(): String {
        return "Ship(name='$name', speed=$speed)"
    }
}
// ----

data class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    fun fullName(): String = "$name $surname"
}
// ----

val lukeSkywalker: User = User(
    name = "Люк",
    surname = "Скайуокер",
    age = 23,
    userInfo = "Я твой отец"
)
val lukeSkywalkerCopy: User = User(
    name = "Люк",
    surname = "Скайуокер",
    age = 23,
    userInfo = "Я твой отец"
)

// Классы идентичны, но если бы метод equals() был не переопределён, то сравнивались бы ссылки, а они разные.
// Но, как мы видим, вывод возвращает true, а значит, сравнение корректно.
println(lukeSkywalker == lukeSkywalkerCopy)

// Здесь тоже возвращается true, если его не переопределить, то метод hashCode() будет возвращать разные хеш-коды для разных объектов.
println(lukeSkywalker.hashCode() == lukeSkywalkerCopy.hashCode())

// Метод toString возвращает читаемый текст, а не просто адрес в памяти, как это происходит по умолчанию.
println(lukeSkywalker)
// ----

true

true

User(name=Люк, surname=Скайуокер, age=23, userInfo=Я твой отец)
// ----

data class User(val name: String, val surname: String) {
    var age: Int = 23
}

val lukeSkywalker: User = User("Люк", "Скайуокер")
println(lukeSkywalker)
// ----

User(name=Люк, surname=Скайуокер)
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
) {
    // так выглядела бы функция copy(), если бы мы реализовывали её самостоятельно
    fun copy(
        name: String = this.name,
        surname: String = this.surname,
        age: Int = this.age,
        userInfo: String = this.userInfo
    ): User = User(name, surname, age, userInfo)
}
// ----

val darthVader: User = User(
    name = "Энакин",
    surname = "Скайуокер",
    age = 44,
    userInfo = "Я твой отец"
)

// Мы копируем объект lukeSkywalker из darthVader и не указываем поле surname. В таком случае оно 
// будет взято из копируемого объекта, в нашем случае это darthVader

val lukeSkywalker: User = darthVader.copy(
    name = "Люк",
    age = 23,
    userInfo = "И да пребудет с тобой сила"
)

println(darthVader)
println(lukeSkywalker)
// ----

User(name=Энакин, surname=Скайуокер, age=44, userInfo=Я твой отец)
// Поле surname указано "Скайуокер", хотя при копировании мы его не указывали
User(name=Люк, surname=Скайуокер, age=23, userInfo=И да пребудет с тобой сила)
// ----

abstract data class Animal(
    val name: String,
    val isPredator: Boolean
)
// ----

data class Animal(
    val name: String,
    val isPredator: Boolean,
    var age: Int
)
// ----

data class Animal
// ----

data class Animal {
    val name: String? = null
    val isPredator: Boolean? = null
    var age: Int? = null
}
// ----

data class Animal(
    val name: String,
    val isPredator: Boolean
) {
    var age: Int? = null
}
// ----

data class Animal(
    val name: String? = null,
    val isPredator: Boolean? = null,
    var age: Int? = null
)
// ----

data class Animal(
    name: String,
    isPredator: Boolean,
    age: Int
)
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
)

// свойство, определённое за пределами тела класса
val skywalker: String = "Скайуокер"

// функция, определённая за пределами тела класса
fun isAdult(user: User): Boolean = user.age >= 18
// ----

fun main() {
    val darthVader: User = User(
        name = "Энакин",
        surname = skywalker, // обратились к переменной, объявленной за пределами класса 
        age = 44,
        userInfo = "Я твой отец"
    )

    // вызываем функцию isAdult(), которая определена за пределами класса
    println("Персонаж ${darthVader.name} ${isAdult(darthVader)}")
}
// ----

class User(
    val name: String,
    val surname: String,
    val age: Int,
    val userInfo: String
)

// свойство, определённое за пределами тела класса
val skywalker: String = "Скайуокер"

// функция, определённая за пределами тела класса
fun isAdult(user: User): Boolean = user.age >= 18
// ----

fun main() {
    val darthVader: User = User(
        name = "Энакин",
        surname = skywalker, // обратились к переменной, объявленной за пределами класса 
        age = 44,
        userInfo = "Я твой отец"
    )

    // вызываем функцию isAdult(), которая определена за пределами класса
    println("Персонаж ${darthVader.name} ${isAdult(darthVader)}")
}
// ----

import java.time.LocalDate

import java.time.format.TextStyle

import java.util.Locale

private fun getLocale() = Locale("ru", "RUS")
// возвращает строку, содержащую название текущего дня недели
fun getCurrentDayOfWeek() : String {
    val today = LocalDate.now()
    val dayOfWeek = today.dayOfWeek
    return dayOfWeek.getDisplayName(TextStyle.FULL, getLocale())
}
// возвращает строку, содержащую текущую дату
fun getCurrentDate() : String {
    val today = LocalDate.now()
    val month = today.month.getDisplayName(TextStyle.FULL, getLocale())
    return "${today.dayOfMonth} $month ${today.year}"
}
// ----

fun main() {
    println(getCurrentDayOfWeek())
    println(getCurrentDate())
}
