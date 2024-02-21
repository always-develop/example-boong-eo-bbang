package truck.food;

public class RedBeanBoongEoBbang implements BoongEoBbang {

    private static final BoongEoBbangType TYPE = BoongEoBbangType.RED_BEAN;
    private final JavaAmount amount;

    private RedBeanBoongEoBbang(int amount) {
        super();

        this.amount = JavaAmount.of(amount);
    }

    public static RedBeanBoongEoBbang launchMenu(int amount) {
        return new RedBeanBoongEoBbang(amount);
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

