package customer;

import truck.food.JavaBoongEoBbangType;
import util.JavaCheckInteger;
import util.JavaCheckNull;

import java.util.Optional;

public class OrderItem {

    private final JavaBoongEoBbangType type;
    private final int count;

    private OrderItem(JavaBoongEoBbangType type, int count) {
        this.type = type;
        this.count = count;
    }

    public static OrderItem appendNew(JavaBoongEoBbangType type, int count) {
        JavaCheckNull.ofOne(type);
        JavaCheckInteger.moreThenOne(count);

        return new OrderItem(type, count);
    }

    public JavaBoongEoBbangType type() {
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
