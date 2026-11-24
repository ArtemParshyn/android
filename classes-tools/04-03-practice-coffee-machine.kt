import java.util.*

class CoffeeMachine {
    // Эти переменные хранят текущее количество ингредиентов
    // Нужно подумать, какая у них должна быть видимость и какие начальные значения
    var water = 0
    var milk = 0
    var beans = 0

    private var scanner = Scanner(System.`in`)

    private companion object {
        const val MAX_WATER = 2000
        const val MAX_MILK = 1000
        const val MAX_BEANS = 500
    }

    // Рецепты напитков
    private enum class Coffee(val title: String, val water: Int, val milk: Int, val beans: Int) {
        ESPRESSO("Эспрессо", 60, 0, 10),
        AMERICANO("Американо", 120, 0, 10),
        CAPPUCCINO("Капучино", 120, 60, 20),
        LATTE("Латте", 240, 120, 20);

        companion object {
            fun find(name: String): Coffee? = values().firstOrNull { it.title.lowercase() == name }
        }
    }

    fun start() {
        println("Кофемашина готова к работе")
        do {
            println("Введите команду")
            when (readCommand()) {
                "выключить" -> {
                    println("До свидания!")
                    return
                }
                "наполнить" -> refill()
                "статус" -> printStatus()
                "кофе" -> coffeeMenu()
            }
        } while (true)
    }

    private fun readCommand(): String? {
        return if (scanner.hasNextLine()) scanner.nextLine().trim().lowercase() else "выключить"
    }

    // Меню выбора напитка
    private fun coffeeMenu() {
        println("Введите название напитка или \"назад\" для возврата в главное меню")
        val command = readCommand()
        if (command == "назад") return
        val coffee = command?.let { Coffee.find(it) }
        if (coffee == null) {
            println("Рецепт не найден!")
            return
        }
        makeCoffee(coffee)
    }

    // Приготовление напитка по выбранному рецепту
    private fun makeCoffee(coffee: Coffee) {
        if (!isIngredientsEnough(coffee)) return
        water -= coffee.water
        milk -= coffee.milk
        beans -= coffee.beans
        println("${coffee.title.lowercase()} готов")
    }

    // Пополнение ингредиентов до максимума
    private fun refill() {
        water = MAX_WATER
        milk = MAX_MILK
        beans = MAX_BEANS
        println("Ингредиенты пополнены")
    }

    // Вывод текущего состояния кофемашины
    private fun printStatus() {
        println("Ингредиентов осталось:")
        println("$water мл воды")
        println("$milk мл молока")
        println("$beans гр кофе")
    }

    // Проверка, хватает ли ингредиентов для приготовления напитка
    // Выводить нужно только первый недостаточный ингредиент:
    // вода, молоко, кофе
    private fun isIngredientsEnough(coffee: Coffee): Boolean {
        return when {
            water < coffee.water -> {
                println("Недостаточно воды!")
                false
            }
            milk < coffee.milk -> {
                println("Недостаточно молока!")
                false
            }
            beans < coffee.beans -> {
                println("Недостаточно кофе!")
                false
            }
            else -> true
        }
    }
}
