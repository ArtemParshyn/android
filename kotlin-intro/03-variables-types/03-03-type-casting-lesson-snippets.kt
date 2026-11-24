val a: Byte = -100
val b: Short = 20
val c: Int = -1
val d: Long = 30000

// ----

val a: Long = 5
val b = a

// ----

val a: Int = 5
val b: Long = a //Компиляция выдаст ошибку Type mismatch: inferred type is Long but Int was expected

// ----

val a: Int = 5
val b: Long = a.toLong() // Код скомпилируется, значение b = 5

// ----

var aLong = 1L // тип Long

val b: Int = 4

val c = aLong + b // Long + Int, получается Long

// ----

val a: Double = 3.9
val b: Int = a.toInt() // получится 3

// ----

val a: Long = 100L
val b: Int = 4
val c = a + b
c += 1

// ----

fun main() {

    val moneyAmount = 0

    println("На вашем счёте: " + moneyAmount)

}

// ----

Денег на вашем счёте: 100000000000

// ----

Для 5 гостей нужно купить 3 шоколадок
