package util;

import java.util.Optional;

public class CheckNull {

    @SafeVarargs
    public static <T> void ofCollections(T... objects) {
        if (objects.length == 0) {
            throw new IllegalArgumentException("objects length is 0");
        }

        ofOne(objects);

        for (T object : objects) {
            ofOne(object);
        }
    }

    public static <T> void ofOne(T object) {
        if (Optional.ofNullable(object).isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
