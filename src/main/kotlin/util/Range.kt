package util

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY,
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Range(
    val min: Int,
    val max: Int
)

