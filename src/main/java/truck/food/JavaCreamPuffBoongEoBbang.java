package truck.food;

public class JavaCreamPuffBoongEoBbang implements JavaBoongEoBbang {

    private static final JavaBoongEoBbangType TYPE = JavaBoongEoBbangType.CREAM_PUFF;
    private final JavaAmount amount;

    private JavaCreamPuffBoongEoBbang(int amount) {
        super();

        this.amount = JavaAmount.of(amount);
    }

    public static JavaCreamPuffBoongEoBbang launchMenu(int amount) {
        return new JavaCreamPuffBoongEoBbang(amount);
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
