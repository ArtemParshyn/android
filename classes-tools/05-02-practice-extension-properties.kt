class Person(val name: String, val surname: String, val thirdName: String)

// реализуйте свойство firstSymbol для класса String
// "Белка".firstSymbol -> Результат 'Б'
// "автомобиль".firstSymbol -> Результат 'а'
val String.firstSymbol: Char
    get() = this[0]

// реализуйте свойство firstDigit для класса Int
// val a = 435
// a.firstDigit -> Результат 4
val Int.firstDigit: Int
    get() = Math.abs(this).toString()[0].digitToInt()

// реализуйте свойство fio для класса Person
// Person("Андрей", "Стрельцов", "Александрович") -> Результат "Стрельцов Андрей Александрович"
val Person.fio: String
    get() = "$surname $name $thirdName"

// реализуйте свойство biggestDigit для класса Int
// val a = 435
// a.biggestDigit -> Результат 5
val Int.biggestDigit: Int
    get() = Math.abs(this).toString().maxOf { it.digitToInt() }
