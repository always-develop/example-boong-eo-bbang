package truck.food;

public class JavaRedBeanBoongEoBbang implements JavaBoongEoBbang {

    private static final JavaBoongEoBbangType TYPE = JavaBoongEoBbangType.RED_BEAN;
    private final JavaAmount amount;

    private JavaRedBeanBoongEoBbang(int amount) {
        super();

        this.amount = JavaAmount.of(amount);
    }

    public static JavaRedBeanBoongEoBbang launchMenu(int amount) {
        return new JavaRedBeanBoongEoBbang(amount);
    }

    @Override
    public JavaName name() {
        return TYPE.getName();
    }

    @Override
    public JavaBoongEoBbangType type() {
        return TYPE;
    }

    @Override
    public JavaAmount amount() {
        return this.amount;
    }
}

