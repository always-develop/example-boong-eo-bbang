package truck.food

data class Name(private val name: String) {
    companion object {
        private const val MAX_LENGTH: Int = 12
        private const val MIN_LENGTH: Int = 1
    }

    init {
        if (MIN_LENGTH >= name.length) {
            throw IllegalArgumentException("Name length is must be more then $MIN_LENGTH")
        }
        if (MAX_LENGTH <= name.length) {
            throw IllegalArgumentException("Name length is must be less then $MAX_LENGTH")
        }
    }
}