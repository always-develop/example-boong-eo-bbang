package truck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.JavaBoongEoBbangType;
import truck.food.JavaCreamPuffBoongEoBbang;
import truck.food.JavaRedBeanBoongEoBbang;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Menu")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MenuTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 메뉴_아이템을_가변인자로_전달하여_메뉴를_게시할_수_있다() {
            assertDoesNotThrow(() ->
                    Menu.launch(
                            Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                            Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000))));
        }

        @Test
        void 메뉴의_아이템을_생성할_때_null을_인자로_보낸다면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Menu.launch(Menu.Item.appendNew(null)));
        }

        @Test
        void 중복된_메뉴를_추가하면_한_개만_유효하다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)));

            assertEquals(menu.count(), 1);
        }

        @Test
        void 메뉴를_게시할_때_항목이_없다면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Menu.launch());
        }

        @Test
        void 메뉴를_게시할_때_null을_인자로_보낸다면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> Menu.launch((Menu.Item) null));
        }
    }

    @Nested
    @DisplayName("Items")
    class ItemsTest {

        @Test
        void 생성한_인스턴스에서_컬렉션_아이템을_얻을_수_있다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000)));

            assertNotNull(menu.items());
        }
    }

    @Nested
    @DisplayName("Count")
    class CountTest {

        @Test
        void 생성한_인스턴스에서_컬렉션_아이템의_개수를_얻을_수_있다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000)));

            assertEquals(menu.count(), 2);
        }
    }

    @Nested
    @DisplayName("Make")
    class Maketest {

        @Test
        void 붕어빵_종류를_전달받아_메뉴에_존재하는_붕어빵의_주문을_접수할_수_있다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000)));

            assertDoesNotThrow(() -> menu.takeOrder(JavaBoongEoBbangType.CREAM_PUFF));

            assertEquals(
                    menu.takeOrder(JavaBoongEoBbangType.CREAM_PUFF).type(),
                    JavaBoongEoBbangType.CREAM_PUFF);

            assertNotEquals(
                    menu.takeOrder(JavaBoongEoBbangType.CREAM_PUFF).type(),
                    JavaBoongEoBbangType.RED_BEAN);
        }

        @Test
        void null을_인자로_전달받으면_IllegalArgumentException을_던진다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000)));

            assertThrows(
                    IllegalArgumentException.class,
                    () -> menu.takeOrder(null));
        }
    }
}