package truck.food;

import util.JavaCheckInteger;

public class Amount {

    private final int amount;

    private Amount(int amount) {
        JavaCheckInteger.moreThenZero(amount);

        this.amount = amount;
    }

    public static Amount of(int amount) {
        return new Amount(amount);
    }
}
