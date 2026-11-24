val number = Random.nextInt()
println(number)

// ----

val number = Random.nextInt(10)  // от 0 до 9

// ----

val number = Random.nextInt(5, 15)  // от 5 до 14

// ----

val age = 20

if (age >= 18) {
    println("Совершеннолетний")
}

// ----

val age = 16

if (age >= 18) {
    println("Совершеннолетний")
} else {
    println("Несовершеннолетний")
}

// ----

if (age >= 18)
    println("Совершеннолетний")
else
    println("Несовершеннолетний")
