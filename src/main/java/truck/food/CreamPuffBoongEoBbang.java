package truck.food;

public class CreamPuffBoongEoBbang extends BoongEoBbang {

    private static final BoongEoBbangType TYPE = BoongEoBbangType.CREAM_PUFF;
    private final Amount amount;

    private CreamPuffBoongEoBbang(int amount) {
        super();

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
