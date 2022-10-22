package truck.food;

import util.CheckInteger;

public class Amount {

    private final int amount;

    private Amount(int amount) {
        CheckInteger.moreThenZero(amount);

        this.amount = amount;
    }

    public static Amount of(int amount) {
        return new Amount(amount);
    }
}
