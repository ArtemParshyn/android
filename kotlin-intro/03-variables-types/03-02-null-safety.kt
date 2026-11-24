val distance = 100   // километров
val time = 2         // часа
val speed = distance / time  // теперь speed = 50

// ----

var name: String = "Практикум"
name = null // Ошибка компиляции! String не может содержать null

// ----

var name: String? = "Практикум"
name = null          // Теперь всё работает корректно

val age: Int? = null // корректно
val year: Int = null // ошибка компиляции

// ----

val name: String? = null
val displayName = name ?: "Гость"

// ----

val name: String? = "Практикум"

name?.let {
   val fullName = name + " Андроидов"
   println("Привет, " + fullName)
}

// ----

println("Привет, " + fullName)

// ----

val nullName: String? = null

nullName?.let {
    println("Этот текст не будет выведен")
}

// ----

var name: String? = "Практикум"
name = null

name?.let {
    println(name)
}
