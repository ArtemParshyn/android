fun main() {
    // Спрашиваем имя
    println("Введите ваше имя:")


    // Считываем ответ пользователя и сохраняем в переменную
    var input = readln()

    // Показываем ASCII-котика и ввод пользователя
    println(
        """
    /_/\
    ( o.o )
    > ^ < Запомнил $input!
    """.trimIndent()
    )

    // Спрашиваем фамилию
    println("Введите вашу фамилию:")

    // Снова считываем ввод (перезаписываем переменную input)
    input = readln()

    // Ещё раз показываем кота с новой фразой
    println(
        """
    /_/\
    ( o.o )
    > ^ < Запомнил $input!
    """.trimIndent()
    )
}

// ----

fun main() {
    println("Введите ваше имя:")
    var input = readln()
    println("Привет, $input!")
}

// ----

fun main() {
    println("Введите ваше имя:")
    printCat() // Вызываем функцию fun printCat()
    println("Введите вашу фамилию:")
    printCat() // Еще раз вызываем функцию fun printCat()
}

fun printCat() { // вынесли котэ в функцию
    var input = readln()
    println(
        """
        /\_/\
       ( o.o )
        > ^ < Запомнил $input!
    """.trimIndent()
    )
}

// ----

fun main() {
    greet("Саша") // Передаём имя в функцию
}

fun greet(name: String) {
    println("Привет, $name!")
}

// ----

fun main() {
    println("Как тебя зовут?")
    val userName = readln() // Сохраняем то, что ввёл пользователь

    greet(userName) // Передаём в функцию
}

fun greet(name: String) {
    println("Приятно познакомиться, $name!")
}

// ----

fun main() {
    println("Как тебя зовут?")
    val name = readln()

    println("Сколько тебе лет?")
    val age = readln()

    showInfo(name, age)
}

fun showInfo(name: String, age: Int) {
    println("Привет, $name! Тебе $age лет.")
}

// ----

fun showUserInfo(name: String, age: Int, isStudent: Boolean) {
    println("Имя: $name")
    println("Возраст: $age")
    if (isStudent) {
        println("Статус: студент")
    } else {
        println("Статус: не студент")
    }
}

// ----

fun main() {
    showUserInfo("Оля", 21, true)
}

// ----

fun showUserInfo(name: String, age: Int, isStudent: Boolean) {
    println("Имя: $name, возраст: $age, студент: $isStudent")
}

// ----

showUserInfo("Аня", 20, true)

// ----

showUserInfo(true, "Аня", 20) // ❌ Ошибка! Нарушен порядок и типы не совпадают

// ----

showUserInfo(name = "Игорь", age = 25, isStudent = false)

// ----

showUserInfo(isStudent = true, age = 19, name = "Саша")

// ----

fun showUserInfo(name: String, age: Int, isStudent: Boolean = false) {
    println("Имя: $name")
    println("Возраст: $age")
    println("Статус: ${if (isStudent) "студент" else "не студент"}")
}

// ----

showUserInfo("Марина", 30) // isStudent автоматически будет false

// ----

fun showInfo(name: String, age: Double) {
    println("Имя: $name, возраст: $age")
}

// ----

fun main() {
    val userName = "Катя"
    val userAge = 25
    showInfo(name = userName, age = userAge)
}

// ----

fun makeCatMessage(name: String): String {
    val message = """
/_/\
( o.o )
> ^ < Запомнил $name!
""".trimIndent()

    return message
}

// ----

fun main() {
    println("Введите имя:")
    val name = readln()

    val catText = makeCatMessage(name) // получили строку от функции
    println(catText)
}

// ----

fun getLength(word: String): Int {
    return word.length
}

// ----

fun main() {
    val input = "авокадо"
    val length = getLength(input)
    println("В слове $input — $length букв(ы)")
}

// ----

fun calculate(a: Int, b: Int): Int

// ----

fun main() {
    val sum: String = calculate(a = 67, b = 101)
}

// ----

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("Вы ввели строку: ")
    println(str)
}
