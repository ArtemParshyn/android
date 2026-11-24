var счётчик = 0 
счётчик = счётчик + 1  // теперь в переменной значение 1

// ----

var counter = 0        // Счётчик будет меняться
counter = counter + 1  // Меняем значение

val pi = 3.14          // Математическая константа
pi = 3.15              // Ошибка! Значение val нельзя изменить

// ----

fun main(){
val a = 10 // Здесь мы объявили переменную и написали однострочный комментарий
/*
Здесь уже используется многострочный комментарий,
который может состоять из нескольких строк
*/
var b = 20
}

// ----

val name = "Алиса"
val message = "Привет, мир!"

// ----

val isLightOn = true
val isUserRegistered = false

// ----

val age: Int = 25
val name: String = "Алексей"
val isStudent: Boolean = true
val height: Double = 1.85

// ----

var age: Int = 25
age = "hi" // ошибка: age типа Int, строку записать нельзя
age = 25.5 // ошибка: age типа Int, допустимы только целые числа

val myString: String = "aaa" * "bbb" // ошибка: строки перемножать нельзя

// ----

val age = 25            // Компилятор понимает, что это Int
val bigNumber = 1L      // Компилятор понимает, что это Long, для отличия Long от Int в конце числа ставят L
val name = "Алексей"    // Компилятор понимает, что это String
val isStudent = true    // Компилятор понимает, что это Boolean
val height = 1.85       // Компилятор понимает, что это Double
val float = 1.2F        // Компилятор понимает, что это Float, для отличия Float от Double в конце числа ставят F

// ----

val result: Int  // Указали, что это Int, хотя пока нет значения
if (isSuccess) {
result = 1
} else {
result = 0
}

// ----

val age = 25
age = 31

// ----

const val APP_NAME = "Мое приложение"
