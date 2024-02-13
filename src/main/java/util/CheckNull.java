package util;

import java.util.Optional;

public class CheckNull {

    public static <T> void ofCollections(T... objects) {
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
