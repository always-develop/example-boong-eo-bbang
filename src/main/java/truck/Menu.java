package truck;

import truck.food.JavaAmount;
import truck.food.JavaBoongEoBbang;
import truck.food.JavaBoongEoBbangType;
import truck.food.JavaName;
import util.JavaCheckNull;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Menu {

    private final Set<Item> items;

    private Menu(Item... items) {
        JavaCheckNull.ofCollections(items);

        checkItemLength(items);

        this.items = new LinkedHashSet<>(List.of(items));
    }

    public static Menu launch(Item... items) {
        return new Menu(items);
    }

    public Set<Item> items() {
        return this.items;
    }

    public int count() {
        return this.items.size();
    }

    public JavaBoongEoBbang takeOrder(JavaBoongEoBbangType type) {
        JavaCheckNull.ofOne(type);

        return findMenu(type)
                .map(Item::boongEoBbang)
                .orElseThrow(IllegalArgumentException::new);
    }

    private Optional<Item> findMenu(JavaBoongEoBbangType type) {
        JavaCheckNull.ofOne(type);

        return items().stream()
                .filter(item -> item.name().equals(type.getName()))
                .findAny();
    }

    private void checkItemLength(Item... items) {
        if (items.length <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static class Item {

        private final JavaBoongEoBbang menu;

        private Item(JavaBoongEoBbang menu) {
            JavaCheckNull.ofOne(menu);

            this.menu = menu;
        }

        public static Item appendNew(JavaBoongEoBbang menu) {
            return new Item(menu);
        }

        public JavaName name() {
            return this.menu.name();
        }

        public JavaAmount amount() {
            return this.menu.amount();
        }

        protected JavaBoongEoBbang boongEoBbang() {
            return this.menu;
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
            return this.menu.type().hashCode();
        }
    }
}
