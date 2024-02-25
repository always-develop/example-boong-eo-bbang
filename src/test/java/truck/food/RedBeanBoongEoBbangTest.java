package truck.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("RedBeanBoongEoBbangTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RedBeanBoongEoBbangTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 가격을_지정하여_팥_붕어빵_메뉴를_게시할_수_있다() {
            assertDoesNotThrow(() -> JavaRedBeanBoongEoBbang.launchMenu(1000));
        }
    }

    @Nested
    @DisplayName("Name")
    class NameTest {

        private final JavaRedBeanBoongEoBbang boongEoBbang = JavaRedBeanBoongEoBbang.launchMenu(1000);

        @Test
        void 붕어빵_이름을_얻을_수_있다() {
            assertNotNull(boongEoBbang.name());
        }

        @Test
        void 붕어빵_유형에_지정된_이름과_붕어빵의_이름은_동일하다() {
            assertEquals(boongEoBbang.type().getName(), boongEoBbang.name());
        }
    }
}