package customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.BoongEoBbangType;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Order")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class OrderTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 주문_정보를_가변인자로_전달하여_주문_객체를_만들_수_있다() {
            assertDoesNotThrow(() ->
                    Order.add(Order.Item.appendNew(BoongEoBbangType.CREAM_PUFF, 1)));
        }

        @Test
        void 주문_정보를_생성할_때_붕어빵_종류가_null이라면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Order.add(Order.Item.appendNew(null, 1)));
        }

        @Test
        void 주문_정보를_생성할_때_붕어빵_개수가_0보다_작다면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Order.add(Order.Item.appendNew(BoongEoBbangType.RED_BEAN, 0)));

            assertThrows(
                    IllegalArgumentException.class,
                    () -> Order.add(Order.Item.appendNew(BoongEoBbangType.RED_BEAN, -1)));
        }

        @Test
        void 주문_정보를_생성할_때_항목이_없다면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> Order.add());
        }

        @Test
        void 주문_정보를_생성할_때_null을_인자로_보낸다면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> Order.add((Order.Item) null));
        }
    }
}