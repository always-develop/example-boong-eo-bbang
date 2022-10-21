package truck.item;

import java.util.Optional;

public class MenuName {

    private final String name;

    private MenuName(String name) {
        this.name = name;
    }

    public static MenuName of(String name) {
        return new MenuName(name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (Optional.ofNullable(object).isEmpty()) {
            return false;
        }

        if (this.getClass().equals(object.getClass())) {
            return this.hashCode() == object.hashCode();
        }

        if (this.toString().getClass().equals(object.getClass())) {
            return this.hashCode() == object.hashCode();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
