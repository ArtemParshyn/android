fun calculateRabbits(): Int {
    var previous = 1
    var current = 1
    for (month in 1..12) {
        val next = previous + current
        previous = current
        current = next
    }
    return previous
}
