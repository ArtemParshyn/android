class Animal(
    val legs: Int,
    val isHairy: Boolean,
    val canSwim: Boolean
) {
    fun makeNoise() {
        println("Meow!")
    }
}

// ----

// Класс Dog — наследник (подкласс) класса Animal
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
)

// ----

// Ошибка компиляции: от класса Animal нельзя наследоваться
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
)

// ----

open class Animal(
    val legs: Int,
    val isHairy: Boolean,
    val canSwim: Boolean
) {
    fun makeNoise() {
        println("Meow!")
    }
}

// Больше нет ошибки компиляции
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
)

// ----

// Ошибка компиляции: enum не может быть open
open enum class ConfirmationType {
    SMS,
    PHONE,
    FINGER_PRINT
}

// Ошибка компиляции: data и open не могут использоваться вместе
open data class Insect(
    val legs: Int,
    val wings: Int
)

// ----

fun main()  {
    // Создаём объект класса Dog
    val dog = Dog()
    // Просим собаку произнести звук
    dog.makeNoise()
}

// Вывод
Meow!

// ----

class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
) {
    override fun makeNoise() {
        // Пишем ожидаемую от текущего класса реализацию метода
        println("Woof!")
    }
}

// ----

class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
) {
    // Ошибка компиляции: метод makeNoise нельзя переопределить
    override fun makeNoise() {
        println("Woof!")
    }
}

// ----

open class Animal(
    val legs: Int,
    val isHairy: Boolean,
    val canSwim: Boolean
) {
    // Добавьте open к методу
    open fun makeNoise() {
        println("Meow!")
    }
}

// ----

class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
) {
    override fun makeNoise() {
        println("Woof!")
    }
}

fun main()  {
    // Создаём объект класса Dog
    val dog = Dog()
    // Просим собаку произнести звук
    dog.makeNoise()
}

// Вывод
Woof!

// ----

// Если ваша собака выросла среди кошек и считает себя двуязычной, то она может и мяукать
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
) {
    override fun makeNoise() {
        // Через super можно обратиться к родителю и вызвать его метод
        super.makeNoise()
        println("Woof!")
    }
}

// Вывод
Meow!
Woof!

// ----

// При объявлении класса необходимо использовать слово abstract
abstract class Animal(
    val legs: Int,
    val isHairy: Boolean,
    val canSwim: Boolean
) {
    // Метод тоже можно сделать абстрактным, тогда больше не понадобится дефолтная реализация
    abstract fun makeNoise()
}

// В реализации наследников ничего не меняется
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
) {
    override fun makeNoise() {
        println("Woof!")
    }
}

// ----

// Интерфейс создаётся с помощью слова interface
interface Mammal {
    val isFemale: Boolean
}

// Интерфейсы 
interface Domesticated {
    fun livesIndoors(): Boolean
}

// ----

// Ошибка компиляции: класс Dog реализует интерфейс, но не переопределяет его метод livesIndoors(), а в интерфейсах это обязательно
class Dog : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
), Domesticated {
    override fun makeNoise() {
        println("Woof!")
    }
}

// ----

// Класс Dog наследует класс Animal и реализует интерфейсы Domesticated и Mammal
// Так как нам нужно переопределить свойство isFemale, передадим его значение в конструкторе Dog
class Dog(
    isFemale: Boolean
) : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
), Domesticated, Mammal {
    override fun makeNoise() {
        println("Woof!")
    }

    override val isFemale: Boolean = isFemale

    override fun livesIndoors(): Boolean {
        return true
    }
}

// ----

class Dog(
    // Переопределите свойство прямо в конструкторе
    override val isFemale: Boolean = true
) : Animal(
    legs = 4,
    isHairy = true,
    canSwim = true
), Domesticated, Mammal {
    override fun makeNoise() {
        println("Woof!")
    }

    // Убираем переопределение свойства из тела класса

    override fun livesIndoors(): Boolean {
        return true
    }
}

// ----

abstract class Spaceship(val name: String)
class TransportShip : Spaceship("Транспортный корабль")

// ----

abstract class Spaceship(val name: String)
interface SentinelClass

class TransportShip(name: String) : SentinelClass : Spaceship(name)

// ----

class Spaceship {
    open val name: String = "Космический корабль"
}

class MillenniumFalcon : Spaceship() {
    override val name: String = "Тысячелетний сокол"
}

// ----

abstract class Spaceship(val name: String)
class TransportShip(name: String) : Spaceship(name)

// ----

abstract class Spaceship(val name: String)
interface SentinelClass

class TransportShip(name: String) : Spaceship(name), SentinelClass

// ----

open class Spaceship {
    abstract val name: String
}

class MillenniumFalcon : Spaceship() {
    override val name: String = "Тысячелетний сокол"
}

// ----

interface CanSurfThroughSpace {
    val speed: Int
    fun makeHyperJump()
}

class MillenniumFalcon : CanSurfThroughSpace {
    override fun makeHyperJump() {}
}

// ----

interface CanSurfThroughSpace {
    val speed: Int
    fun makeHyperJump()
}

class MillenniumFalcon : CanSurfThroughSpace {
    override val speed: Int = 10
    override fun makeHyperJump() {}
}

// ----

interface CanSurfThroughSpace {
    val speed: Int
    fun makeHyperJump()
}

class MillenniumFalcon(
    override val speed: Int = 10,
    override val makeHyperJump: Unit
) : CanSurfThroughSpace

// ----

interface CanSurfThroughSpace {
    val speed: Int
    fun makeHyperJump()
}

class MillenniumFalcon(override val speed: Int) : CanSurfThroughSpace {
    override fun makeHyperJump() {}
}
