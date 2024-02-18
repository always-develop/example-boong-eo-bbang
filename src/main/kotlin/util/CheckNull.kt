package util

fun <T> collectionIsNotEmpty(vararg collections: T) {
    if (collections.isEmpty()) {
        throw IllegalArgumentException("objects length is 0")
    }
}