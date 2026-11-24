fun main() { 
    Animal("Тузик", 8) // Ожидаемый вывод: ТУЗИК 
    Animal("Мура", 3) // Ожидаемый вывод: мура 
    Animal("мУхТаР") // Ожидаемый вывод: мУхТаР 
} 
 
class Animal(name: String, age: Int) {
    constructor(name: String) : this(name, -1)

    init {
        if (age > 6) {
            println(name.uppercase())
        } else if (age >= 0) {
            println(name.lowercase())
        } else {
            println(name)
        }
    }
}
