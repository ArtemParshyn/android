class AndroidDeveloper

val developers: ArrayList<AndroidDeveloper> = arrayListOf()
// ----

// Объявление обобщённого класса Box с параметром типа T
class Box<T>(val content: T) {
    fun printContent() {
        println("Содержимое коробки: $content")
    }
}

class Apple

// Создаём Box, предназначенный для хранения Apple
val boxOfApples = Box<Apple>(Apple())
// ----

open class Animal

class Dog : Animal()

open class Cat : Animal()

class Tiger : Cat()

class Kitty : Cat()
// ----

fun main() {
    val cat: Cat = Kitty()

    // Присваиваем переменной типа Animal значение типа Cat
    var animal: Animal = cat

    // Переприсваиваем переменной типа Animal значение типа Dog
    animal = Dog()
}
// ----

fun main() {
    val dogs: ArrayList<Dog> = arrayListOf();
    val animals: ArrayList<Animal> = dogs
}
// ----

val dogs: ArrayList<Dog>
// ----

val cats: Array<Cat?> = arrayOfNulls<Cat>(3)
cats[2] = Cat()
// ----

val cats: List<Cat> = listOf(Cat(), Cat(), Cat())
val animals: List<Animal> = cats // ✅ Всё работает!
// ----

interface List<out E>
// ----

val cats: List<Cat> = listOf(Cat(), Cat(), Cat())
// Поскольку интерфейс List<out E> ковариантен (E помечен как 'out'),
// List<Cat> является подтипом List<Animal>.
// Поэтому мы можем присвоить список котов переменной типа List<Animal>.
val animals: List<Animal> = cats
// ----

open class Animal
class Cat : Animal()

class AnimalConsumer {
    fun accept(animal: Animal) {
        println("Принял животное")
    }
}
// ----

interface Consumer<in T> {
    fun consume(item: T)
}
// ----

val dogs: ArrayList<Dog> = ArrayList<Dog>()
// Ошибка компиляции: переменной animals может быть присвоено только значение типа ArrayList<Animal>
val animals: ArrayList<Animal> = dogs
// ----

val dogs: ArrayList<Dog> = ArrayList()
val animals: ArrayList<Animal> = dogs  // гипотетически допустили

// Теперь добавим в "список животных" кошку
animals.add(Cat())
