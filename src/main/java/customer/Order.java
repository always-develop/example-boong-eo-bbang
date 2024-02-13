package customer;

import truck.food.BoongEoBbangType;
import util.CheckInteger;
import util.CheckNull;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Order {

    private final Set<Item> items;

    private Order(Item... items) {
        CheckNull.ofCollections(items);

        checkItemLength(items);

        this.items = new LinkedHashSet<>(List.of(items));
    }

    public static Order add(Item... items) {
        return new Order(items);
    }

    public Set<Item> items() {
        return this.items;
    }

    private void checkItemLength(Item... items) {
        if (items.length <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static class Item {

        private final BoongEoBbangType type;
        private final int count;

        private Item(BoongEoBbangType type, int count) {
            CheckNull.ofOne(type);
            CheckInteger.moreThenOne(count);

            this.type = type;
            this.count = count;
        }

        public static Item appendNew(BoongEoBbangType type, int count) {
            return new Item(type, count);
        }

        public BoongEoBbangType type() {
            return this.type;
        }

        public int count() {
            return this.count;
        }

        @Override
        public boolean equals(Object object) {
            if (Optional.ofNullable(object).isEmpty()) {
                return false;
            }

            if (this.getClass().equals(object.getClass())) {
                return this.hashCode() == object.hashCode();
            }

            return false;
        }

        @Override
        public int hashCode() {
            return this.type.hashCode();
        }
    }
}
