package util

private const val ZERO: Int = 0
private const val ONE: Int = 1

fun Int.moreThenOne() {
    if (ONE > this) {
        throw IllegalArgumentException()
    }
}

fun Int.moreThenZero() {
    if (ZERO > this) {
        throw IllegalArgumentException()
    }
}