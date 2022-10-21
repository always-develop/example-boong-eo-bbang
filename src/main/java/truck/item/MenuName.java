package truck.item;

import java.util.Optional;

public class MenuName {

    private static final int MAX_LENGTH = 12;
    private static final int MIN_LENGTH = 1;
    private final String name;

    private MenuName(String name) {
        checkArgument(name);

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

    private void checkArgument(String argument) {
        checkEmpty(argument);
        checkLength(argument);
    }

    private void checkEmpty(String argument) {
        if (Optional.ofNullable(argument).isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (argument.length() == 0) {
            throw new IllegalArgumentException();
        }
    }

    private void checkLength(String argument) {
        if (MIN_LENGTH >= argument.length()) {
            throw new IllegalArgumentException();
        }

        if (MAX_LENGTH <= argument.length()) {
            throw new IllegalArgumentException();
        }
    }
}
