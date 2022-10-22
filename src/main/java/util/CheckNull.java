package util;

import java.util.Optional;

public class CheckNull {

    public static void ofCollections(Object... objects) {
        for (Object object : objects) {
            ofOne(object);
        }
    }

    public static void ofOne(Object object) {
        if (Optional.ofNullable(object).isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
