data class Person(val name: String, val age: Int)
// ----

val person = Person("Коля", 12)
val name = person.name
val age = person.age

println("Имя = $name")
println("Возраст = $age")
// ----

val person = Person("Коля", 12)
val (name, age) = person // мы объявляем мульти-декларацию для полей класса Person

println("Имя = $name")
println("Возраст = $age")
// ----

val personsList: ArrayList<Person> = ArrayList()
personsList.add(Person("Коля", 12))
personsList.add(Person("Алена", 17))
personsList.add(Person("Настя", 11))

// в цикле for мы можем напрямую использовать параметры из объекта класса Person

for ((name, age) in personsList) {
    println("Имя = $name")
    println("Возраст = $age")
}
// ----

data class Person(val name: String, val age: Int)
fun getGoodPerson(): Person = Person("Хороший персонаж", 22)

// теперь можем использовать деструктурирующее присваивание:
val (name, age) = getGoodPerson()
// ----

data class Person(val name: String, val age: Int)

fun interface Worker {

    fun doWork(person: Person)
}

// лямбда для интерфейса Worker без деструктурирующего присваивания
val workerWithoutDestructuring = Worker { person ->
    println("person with name = ${person.name}, age = ${person.age}")
}

// лямбда для интерфейса Worker с деструктурирующим присваиванием
val workerWithDestructuring = Worker { (name, age) ->
    println("person with name = $name, age = $age")
}
// ----

class Person(val name: String, val age: Int)
val (name, age) = Person("Коля", 12) 

println("Имя = $name, возраст = $age")
// ----

Destructuring declaration initializer of type Person must have a 'component1()' function
Destructuring declaration initializer of type Person must have a 'component2()' function
// ----

class Person(val name: String, val age: Int) {
    fun component1(): String = name
    fun component2(): Int = age
}
val (name, age) = Person("Коля", 12)

println("Имя = $name, возраст = $age")
// ----

'operator' modifier is required on 'component1' in 'Person'
'operator' modifier is required on 'component2' in 'Person'
// ----

class Person(val name: String, val age: Int) {
    operator fun component1(): String = name
    operator fun component2(): Int = age
}
val (name, age) = Person("Коля", 12)

println("Имя = $name, возраст = $age")
