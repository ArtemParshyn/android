val str = readln() // Чтение строки введенной пользователем
println(str)       // Печать значения введенной строки

// ----

val str = "Привет Мир!"
println(str.let { it.uppercase() })

// ----

val str = "Привет Мир!"
println(str.let { ourString -> ourString.uppercase() })

// ----

fun main() {
    val str = "Мой номер телефона +700000000   "
    println(str.split(" "))      // Разделит строку. Разделитель знак пробела
    println(str.substring(0,4))  // Создаст подстроку с символа 0 до 3 включительно
    println(str.trim())          // Уберет пробелы вначале и конце строки
    println(str.replace('7','9'))// Заменит символы 7 на 9
    println(str.uppercase())     // Переведет все символы в заглавные
    println(str.substring(19,28).toInt()) // Подстроку с 22 по 30 символ переведет в Int
    println(str.substring(19,28).toFloat()) // Подстроку с 22 по 30 символ переведет в Float
}

// ----

var str = "Мой номер телефона +700000000"
str = str.substring(0,4)

// ----

import kotlin.math.pow // Импорт функции pow из библиотеки kotlin.math, так как kotlin.math отдельный модуль
import kotlin.math.sqrt // Импорт функции sqrt из библиотеки kotlin.math, так как kotlin.math отдельный модуль


fun main() {
    val a = 10.0
    val q = sqrt(a)    // Извлекаем квадратный корень из 10
    println(q)
    val c = a.pow(2.0) // Возводим 10 в квадрат
    println(c)
}

// ----

dependencies {

    ...
    implementation("com.google.code.gson:gson:2.13.1")
    ...
}

// ----

import com.google.gson.JsonObject



fun main() {
    val json = JsonObject()
}
