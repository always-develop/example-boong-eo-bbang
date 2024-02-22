package util

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY,
)
@Retention(AnnotationRetention.RUNTIME)
annotation class NotEmpty(
    val message: String = "default error message"
)
