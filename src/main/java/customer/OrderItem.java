package customer;

import truck.food.BoongEoBbangType;
import util.CheckInteger;
import util.CheckNull;

import java.util.Optional;

public class OrderItem {

    private final BoongEoBbangType type;
    private final int count;

    private OrderItem(BoongEoBbangType type, int count) {
        this.type = type;
        this.count = count;
    }

    public static OrderItem appendNew(BoongEoBbangType type, int count) {
        CheckNull.ofOne(type);
        CheckInteger.moreThenOne(count);

        return new OrderItem(type, count);
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
