package truck.food

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NameTest {

    @Test
    fun doTest() {
        assertDoesNotThrow {
            Name("21")
        }

        assertThrows<Exception> {
            Name("")
        }
    }
}