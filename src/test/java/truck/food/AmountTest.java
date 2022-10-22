package truck.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.Amount;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Amount")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AmountTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 금액이_0보다_적으면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> Amount.of(-1));
        }

        @Test
        void 금액은_0일_수_있다() {
            assertDoesNotThrow(() -> Amount.of(0));
        }

        @Test
        void 금액은_0보다_클_수_있다() {
            assertDoesNotThrow(() -> Amount.of(1));
        }
    }
}