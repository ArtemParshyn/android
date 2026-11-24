interface SomeInterface {
    fun someMethod()
    fun anotherMethod()
}

fun main() {
    // Для создания анонимного экземпляра класса мы как бы создаем анонимный object, который реализует наш интерфейс
    val someInterface = object : SomeInterface {
        // Также нужно объявить методы интерфейса и добавить перед ними слово override 
        override fun someMethod() {}
        override fun anotherMethod() {}
    }
}
// ----

interface ClickListener {
    fun onClick()
}

fun setupButton(listener: ClickListener) {
    // ... логика настройки кнопки
    listener.onClick() // Вызываем обработчик
}

fun main() {
    setupButton(object : ClickListener { // Анонимный класс: написали и сразу использовали! 
        override fun onClick() {
            println("Кнопка нажата!")
        }
    })
}
// ----

abstract class SomeAbstractClass {

    abstract fun someMethod()
}

fun main() {
    // Вызываем конструктор класса SomeAbstractClass.
    val someAbstractClass = object : SomeAbstractClass() {
        override fun someMethod() {}
    }
}
// ----

abstract class SomeAbstractClass(param: Int) {

    abstract fun someMethod()
}

fun main() {
    // Вызываем конструктор класса SomeAbstractClass и передаём в него именованный параметр — 10.
    val someAbstractClass = object : SomeAbstractClass(param = 10) {
        override fun someMethod() {
            // ...
        }
    }
}
// ----

val someAbstractClass = object : SomeInterface {

    // Параметры внутри анонимного класса
    val innerParam: String = "Я люблю Практикум"
    val counter: Int = 100

    override fun someMethod() {}
}
// ----

abstract class SomeAbstractClass(param: Int) {
    abstract fun someMethod()
}

interface SomeInterface {
    fun someMethodFromInterface()
}

interface AnotherInterface {
    fun anotherMethod()
}

fun main() {
    // Анонимный класс наследуется от абстрактного класса SomeAbstractClass и реализует интерфейсы SomeInterface и AnotherInterface
    val someAbstractClass = object : SomeAbstractClass(param = 10), SomeInterface, AnotherInterface {

        // Компилятор обяжет вас реализовать все абстрактные методы из всех классов и интерфейсов
        override fun someMethod() {} // метод абстрактного класса SomeAbstractClass 
        override fun someMethodFromInterface() {} // метод интерфейса SomeInterface
        override fun anotherMethod() {} // метод интерфейса AnotherInterface
    }
}
// ----

interface Domesticated {
    fun livesIndoors(): Boolean
}

fun main() {
    val dog = object : Domesticated {
        override fun livesIndoors(): Boolean {
            return true
        }
    }
}
// ----

abstract class Animal() {
    abstract fun makeNoise()
}

interface Domesticated {
    fun livesIndoors(): Boolean
}

fun main() {
    val dog = object : Domesticated, Animal() {
        override fun livesIndoors(): Boolean {
            return true
        }
    }
}
// ----

abstract class Animal(
    val canSwim: Boolean
) {
    abstract fun makeNoise()
}

interface Domesticated {
    fun livesIndoors(): Boolean
}

fun main() {
    val dog = object : Animal(
        canSwim = true
    ), Domesticated {
        override fun makeNoise() {
            print("Woof!")
        }
    }
}
// ----

abstract class Animal(
    val canSwim: Boolean
) {
    abstract fun makeNoise()
}

fun main() {
    val dog = object : Animal(canSwim = true) {

        fun makeNoise() {
            print("Woof!")
        }
    }
}
// ----

abstract class Animal(
    val canSwim: Boolean
) {
    abstract fun makeNoise()
}

interface Domesticated {
    fun livesIndoors(): Boolean
}

fun main() {
    val dog = object : Animal(
        canSwim = true
    ), Domesticated {
        override fun makeNoise() {
            print("Woof!")
        }

        override fun livesIndoors(): Boolean {
            return true
        }
    }
}
// ----

fun interface Clickable {
    // Единственный метод
    fun click()
}
// ----

val clicked = object : Clickable {
   override fun click() {
       print("Button is clicked!")
   }
}
// ----

val clicked = Clickable { print("Button is clicked!") }

fun main() {
    clicked.click()
}

// Вывод
Button is clicked!
// ----

val clicked = object : Clickable {
    override fun click() {
        println("Кнопка нажата!")
    }
}
// ----

val clicked = Clickable { println("Кнопка нажата!") }
// ----

// Лямбда без параметров
val greet = { println("Привет, мир!") }
greet() // Вызов лямбды

// Лямбда с одним параметром
val square = { number: Int -> number * number }
println(square(5)) // Выводит 25
// ----

// Объявляем функциональный интерфейс — с ключевым словом fun
fun interface FunInterface {
    fun doSomething()
}
// А это обычный интерфейс — ключевого слова fun нет
interface NoneFunInterface {
    fun doSomething()
}

fun main() {
    // Можно передать лямбду, потому что это fun-интерфейс
    val functionalInterface = FunInterface { /* Ваш код здесь */ }

    // А здесь так не получится — нужно писать реализацию вручную
    val noneFunctionalInterface = object : NoneFunInterface {
        override fun doSomething() {
            // Ваш код здесь
        }
    }
}
// ----

// Ошибка компиляции: функциональный интерфейс может иметь только один абстрактный метод
fun interface FunInterface {
    fun doSomething()
    fun anotherMethod()
}
// ----

fun interface FunInterfaceWithParam {
    fun doSomething(param: String)
}
fun interface FunInterfaceWithDoubleParam {
    fun doSomething(first: Int, second: String)
}

fun main() {
    // Внутри лямбда-выражения мы можем указывать параметры и использовать их
    val funInterfaceWithParam = FunInterfaceWithParam { param -> println(param) }

    // Параметров может быть более одного, и количество выражений внутри лямбды тоже может быть неограниченным
    val funInterfaceWithDoubleParam = FunInterfaceWithDoubleParam { first, second ->
        // Каждый новый вызов метода внутри лямбды должен идти с новой строки
        println(first)
        println(second)
    }
}
// ----

// Поскольку метод функционального интерфейса имеет только один параметр, можем использовать it
// в данной ситуации it будет иметь тип String
val funInterfaceWithParam = FunInterfaceWithParam { println(it) }
// ----

   fun interface MySimpleAction {
       fun execute()
   }
// ----

   fun interface MultiMethodInterface {
       fun methodA()
       fun methodB() 
   }
// ----

   fun interface InterfaceWithCreationalMethod {
       fun createSomeValue: Int
   }
// ----

   fun interface NoAbstractMethodInterface {
       fun defaultMethod() {
           println("Это метод по умолчанию, а не абстрактный")
       }
   }
// ----

class Outer {
    private val outerProperty = "Внешнее свойство"

    class Nested { // Это вложенный класс по умолчанию
        fun printMessage() {
            // println(outerProperty) // Ошибка компиляции: Нельзя получить доступ к outerProperty
            println("Это вложенный класс")
        }
    }
}

fun main() {
    val nested = Outer.Nested() // Создаем экземпляр вложенного класса
    nested.printMessage()
}
// ----

class Outer {
    private val outerProperty = "Внешнее свойство"

    inner class Inner { // Используем ключевое слово 'inner'
        fun printMessage() {
            println("Это внутренний класс. Доступ к внешнему свойству: $outerProperty") // OK
        }
    }
}

fun main() {
    val outer = Outer() // Сначала нужен экземпляр внешнего класса
    val inner = outer.Inner() // Затем создаем экземпляр внутреннего класса
    inner.printMessage()
}
