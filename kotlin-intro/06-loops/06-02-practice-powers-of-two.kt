fun calculate(max: Int) {
    var value = 1
    val result = StringBuilder()
    while (value <= max) {
        result.append(value).append(' ')
        value *= 2
    }
    println(result.toString().trim())
}
