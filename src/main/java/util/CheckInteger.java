package util;

public class CheckInteger {

    public static void moreThenOne(int integer) {
        if (1 > integer) {
            throw new IllegalArgumentException();
        }
    }
}
