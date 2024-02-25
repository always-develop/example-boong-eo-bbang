package truck;

import customer.Order;
import customer.OrderItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.JavaBoongEoBbangType;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Truck")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TruckTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 장사를_개시할_수_있다() {
            assertDoesNotThrow(Truck::open);
        }
    }

    @Nested
    @DisplayName("Buy")
    class BuyTest {

        @Test
        void 주문_정보를_통해_붕어빵을_주문받을_수_있다() {
            Truck truck = Truck.open();

            Order order = Order.add(
                OrderItem.appendNew(JavaBoongEoBbangType.CREAM_PUFF, 1),
                OrderItem.appendNew(JavaBoongEoBbangType.RED_BEAN, 2));

            assertDoesNotThrow(() -> truck.buyBoongEoBbang(order));
            assertNotEquals(truck.buyBoongEoBbang(order).count(), 0);
        }
    }
}