package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("CheckInteger")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CheckIntegerTest {

    @Nested
    @DisplayName("MoreThenOne")
    class MoreThenOneTest {

        @Test
        void 인자가_1보다_작으면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> CheckInteger.moreThenOne(0));
        }

        @Test
        void 인자가_1이면_예외를_던지지_않는다() {
            assertDoesNotThrow(() -> CheckInteger.moreThenOne(1));
        }

        @Test
        void 인자가_1보다_크면_예외를_던지지_않는다() {
            assertDoesNotThrow(() -> CheckInteger.moreThenOne(2));
            assertDoesNotThrow(() -> CheckInteger.moreThenOne(Integer.MAX_VALUE));
        }
    }

    @Nested
    @DisplayName("MoreThenZero")
    class MoreThenZeroTest {

        @Test
        void 인자가_0보다_작으면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> CheckInteger.moreThenZero(-1));
        }

        @Test
        void 인자가_0이면_예외를_던지지_않는다() {
            assertDoesNotThrow(() -> CheckInteger.moreThenZero(0));
        }

        @Test
        void 인자가_0보다_크면_예외를_던지지_않는다() {
            assertDoesNotThrow(() -> CheckInteger.moreThenZero(1));
            assertDoesNotThrow(() -> CheckInteger.moreThenZero(Integer.MAX_VALUE));
        }
    }
}