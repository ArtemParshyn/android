val a = 10
val b = 20

println(a == b)  // false (a не равно b)
println(a != b)  // true (a не равно b)
println(a > b)   // false (a не больше b)
println(a < b)   // true (a меньше b)
println(a >= b)  // false (a не больше и не равно b)
println(a <= b)  // true (a меньше или равно b)

// ----

val name1 = "Алексей"
val name2 = "Борис"

// ----

println(name1 < name2)

// ----

println("abc" < "abd")  // true

// ----

println("abc" < "abb")  // false

// ----

val a = "abcdefghijklmnopqrstuvwxyz"
val b = "ac"

val result = b > a

// ----

val a = "some string"
println(a is String) // Вывод true. `a` — действительно String.

// ----

val b = 324

println(b !is Int) // Вывод — false. `b` — имеет тип Int.
