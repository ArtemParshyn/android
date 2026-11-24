val temperatures = arrayOf(22, 25, 18, 30, 27, 19, 23)
val days = arrayOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс")

var maxIndex = 0
for (i in temperatures.indices) {
    if (temperatures[i] > temperatures[maxIndex]) {
        maxIndex = i
    }
}
println("Максимальная температура: ${temperatures[maxIndex]}°C")
println("День с максимальной температурой: ${days[maxIndex]}")
