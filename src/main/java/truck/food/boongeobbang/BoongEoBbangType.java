package truck.food.boongeobbang;

import truck.food.Name;

public enum BoongEoBbangType {

    CREAM_PUFF("슈붕"),
    RED_BEAN("팥붕");

    private final String description;

    BoongEoBbangType(String description) {
        this.description = description;
    }

    public Name getName() {
        return Name.of(this.description);
    }
}
