package truck.food.boongeobbang;

import truck.food.Amount;
import truck.food.Name;

public class RedBeanBoongEoBbang implements BoongEoBbang {

    private static final BoongEoBbangType TYPE = BoongEoBbangType.RED_BEAN;
    private final Amount amount;

    private RedBeanBoongEoBbang(int amount) {
        this.amount = Amount.of(amount);
    }

    public static RedBeanBoongEoBbang launchMenu(int amount) {
        return new RedBeanBoongEoBbang(amount);
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

