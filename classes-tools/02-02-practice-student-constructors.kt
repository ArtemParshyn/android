fun main() {
    Student(10, "Никита")
    Student(10)
}

class Student(
    age: Int,
    name: String
) {
    constructor(age: Int) : this(age, "Безымянный") {
        println("Уточните имя у студента")
    }
}
