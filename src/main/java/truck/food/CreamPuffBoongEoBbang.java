package truck.food;

public class CreamPuffBoongEoBbang implements BoongEoBbang {

    private static final BoongEoBbangType TYPE = BoongEoBbangType.CREAM_PUFF;
    private final JavaAmount amount;

    private CreamPuffBoongEoBbang(int amount) {
        super();

        this.amount = JavaAmount.of(amount);
    }

    public static CreamPuffBoongEoBbang launchMenu(int amount) {
        return new CreamPuffBoongEoBbang(amount);
    }

    @Override
    public JavaName name() {
        return TYPE.getName();
    }

    @Override
    public BoongEoBbangType type() {
        return TYPE;
    }

    @Override
    public JavaAmount amount() {
        return this.amount;
    }
}
