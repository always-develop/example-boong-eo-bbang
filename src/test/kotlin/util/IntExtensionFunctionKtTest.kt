package util

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class IntExtensionFunctionKtTest {

    @Nested
    @DisplayName("Int.moreThenOne")
    inner class moreThenOneTest {

        @Test
        fun `숫자가 1보다 크면 예외를 던지지 않는다`() {
            val two = 2

            assertDoesNotThrow {
                two.moreThenOne()
            }
        }

        @Test
        fun `숫자가 1이면 예외를 던지지 않는다`() {
            val one = 1

            assertDoesNotThrow {
                one.moreThenOne()
            }
        }

        @Test
        fun `숫자가 0이면 IllegalArgumentException 을 던진다`() {
            val zero = 0

            assertThrows<IllegalArgumentException> {
                zero.moreThenOne()
            }
        }
    }
}