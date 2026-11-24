import kotlin.random.Random

fun main() {
    // Создаем каталог товаров
    val catalog = mapOf(
        "Конструкторы" to listOf(
            "LEGO City",
            "LEGO Technic",
            "Магнитный конструктор",
            "Деревянные кубики",
            "Металлический конструктор"
        ),
        "Куклы" to listOf(
            "Барби",
            "Пупс",
            "Кукла-принцесса",
            "Интерактивная кукла",
            "Кукла-балерина"
        ),
        "Машинки" to listOf(
            "Гоночная машина",
            "Грузовик",
            "Полицейская машина",
            "Пожарная машина",
            "Трансформер"
        )
    )

    // цены товаров от 500 до 5000 руб.
    val prices = mutableMapOf<String, Int>()
    for (items in catalog.values) {
        for (item in items) {
            prices[item] = Random.nextInt(500, 5001)
        }
    }

    // корзина без дубликатов — Set
    val cart = mutableSetOf<String>()
    cart.add("LEGO City")
    cart.add("Барби")
    cart.add("Барби") // дубликат не добавится

    println("=== КОРЗИНА ===")
    println("Товары в корзине:")
    var totalSum = 0
    for (item in cart) {
        val price = prices[item] ?: 0
        println("- $item ($price руб.)")
        totalSum += price
    }
    println()
    println("Общая сумма: $totalSum руб.")
    println("Количество товаров: ${cart.size}")
}
