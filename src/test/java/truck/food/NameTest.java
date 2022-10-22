package truck.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.Name;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Name")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NameTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 문자열로_초기화할_수_있다() {
            assertDoesNotThrow(() -> Name.of("메뉴"));
        }

        @Test
        void 빈_문자열로_초기화하면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> Name.of(""));
        }

        @Test
        void Null로_초기화하면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> Name.of(""));
        }

        @Test
        void 열_두자_이내의_문자열로_초기화하면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Name.of("123456789012"));
        }

        @Test
        void 열_두자_이상의_문자열로_초기화하면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Name.of("1234567890123"));
        }
    }
}