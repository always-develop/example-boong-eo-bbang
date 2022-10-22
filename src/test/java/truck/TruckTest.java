package truck;

import customer.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.BoongEoBbangType;

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
                    Order.Item.appendNew(BoongEoBbangType.CREAM_PUFF, 1),
                    Order.Item.appendNew(BoongEoBbangType.RED_BEAN, 2));

            assertDoesNotThrow(() -> truck.buy(order));
            assertNotEquals(truck.buy(order).count(), 0);
        }
    }
}