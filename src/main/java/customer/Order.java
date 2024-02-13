package customer;

import util.CheckNull;

import java.util.List;
import java.util.stream.Stream;

public class Order {

    private final List<OrderItem> items;

    private Order(OrderItem... items) {
        this.items = Stream.of(items).distinct().toList();
    }

    public static Order add(OrderItem... items) {
        CheckNull.ofCollections(items);

        return new Order(items);
    }

    public List<OrderItem> items() {
        return this.items;
    }
}
