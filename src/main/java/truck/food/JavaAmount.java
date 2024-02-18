package truck.food;

import util.JavaCheckInteger;

public class JavaAmount {

    private final int amount;

    private JavaAmount(int amount) {
        JavaCheckInteger.moreThenZero(amount);

        this.amount = amount;
    }

    public static JavaAmount of(int amount) {
        return new JavaAmount(amount);
    }
}
