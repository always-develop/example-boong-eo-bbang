package util

private const val ZERO: Int = 0
private const val ONE: Int = 1

fun Int.moreThenOne(value: Int) {
    if (ONE > value) {
        throw IllegalArgumentException()
    }
}

fun Int.moreThenZero(value: Int) {
    if (ZERO > value) {
        throw IllegalArgumentException()
    }
}