val catName = "Альберт"
val what = "сосиски"
val place = "со стола"

println("Кот " + catName + " берёт " + what + " " + place)

// ----

val major = 1
val minor = 6
val patch = 3

val version = major + "." + minor + "." + patch

// ----

val major = 1
val minor = 6
val patch = 3

val version = "$major.$minor.$patch"

// ----

val catName = "Albert"
val what = "vegetable"
val place = "со стола"

// Обратите внимание на переменную: whats (нами объявлена what, без окончания s).
println("Кот $catName берёт $whats $place")

// ----

val catName = "Albert"
val what = "vegetable"
val place = "со стола"

println("Кот $catName берёт ${what}s $place")

// ----

val catName = "Albert"
val what = "vegetable"
val place = "со стола"

println("Кот $catName берёт ${what.replace("vegetable", "meat")} $place")
