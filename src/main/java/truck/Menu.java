package truck;

import truck.food.Amount;
import truck.food.Name;
import truck.food.boongeobbang.BoongEoBbang;
import util.CheckNull;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Menu {

    private final Set<Item> items;

    private Menu(Item... items) {
        CheckNull.ofCollections((Object) items);

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

    private void checkItemLength(Item... items) {
        if (items.length <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static class Item {

        private final BoongEoBbang menu;

        private Item(BoongEoBbang menu) {
            CheckNull.ofOne(menu);

            this.menu = menu;
        }

        public static Item appendNew(BoongEoBbang menu) {
            return new Item(menu);
        }

        public Name name() {
            return this.menu.name();
        }

        public Amount amount() {
            return this.menu.amount();
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