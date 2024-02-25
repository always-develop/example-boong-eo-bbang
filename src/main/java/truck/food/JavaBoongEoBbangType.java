package truck.food;

public enum JavaBoongEoBbangType {

    CREAM_PUFF("슈붕"),
    RED_BEAN("팥붕");

    private final String description;

    JavaBoongEoBbangType(String description) {
        this.description = description;
    }

    public JavaName getName() {
        return JavaName.of(this.description);
    }
}
