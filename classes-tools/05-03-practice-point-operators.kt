class Point(private val x: Int, private val y: Int) {

    // перегрузите оператор plus
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)

    // перегрузите оператор minus
    operator fun minus(other: Point): Point = Point(x - other.x, y - other.y)

    // перегрузите оператор times
    operator fun times(other: Point): Point = Point(x * other.x, y * other.y)

    // перегрузите оператор div
    operator fun div(other: Point): Point = Point(x / other.x, y / other.y)

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}
