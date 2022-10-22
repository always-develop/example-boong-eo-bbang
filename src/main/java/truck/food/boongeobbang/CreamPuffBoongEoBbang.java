package truck.food.boongeobbang;

import truck.food.Amount;
import truck.food.Name;

public class CreamPuffBoongEoBbang implements BoongEoBbang {

    private static final BoongEoBbangType TYPE = BoongEoBbangType.CREAM_PUFF;
    private final Amount amount;

    private CreamPuffBoongEoBbang(int amount) {
        this.amount = Amount.of(amount);
    }

    public static CreamPuffBoongEoBbang launchMenu(int amount) {
        return new CreamPuffBoongEoBbang(amount);
    }

    @Override
    public Name name() {
        return TYPE.getName();
    }

    @Override
    public BoongEoBbangType type() {
        return TYPE;
    }

    @Override
    public Amount amount() {
        return this.amount;
    }
}
