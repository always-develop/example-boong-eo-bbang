package truck.food;

public class Amount {

    private final int amount;

    private Amount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }

    public static Amount of(int amount) {
        return new Amount(amount);
    }
}
