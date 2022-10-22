package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CheckNull")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CheckNullTest {

    @Test
    void null을_인자로_보내면_IllegalArgumentException을_던진다() {
        assertThrows(IllegalArgumentException.class, () -> CheckNull.ofOne(null));
    }

    @Test
    void 가변_인자에_null이_포함되어_있어도_IllegalArgumentException을_던진다() {
        assertThrows(IllegalArgumentException.class, () -> CheckNull.ofCollections("1", null));
    }
}