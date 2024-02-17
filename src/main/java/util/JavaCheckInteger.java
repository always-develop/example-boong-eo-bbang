package util;

public class JavaCheckInteger {

    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void moreThenOne(int integer) {
        if (ONE > integer) {
            throw new IllegalArgumentException();
        }
    }

    public static void moreThenZero(int integer) {
        if (ZERO > integer) {
            throw new IllegalArgumentException();
        }
    }
}
