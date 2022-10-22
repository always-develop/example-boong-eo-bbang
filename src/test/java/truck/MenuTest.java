package truck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.CreamPuffBoongEoBbang;
import truck.food.RedBeanBoongEoBbang;

import static org.junit.jupiter.api.Assertions.*;

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
                            Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                            Menu.Item.appendNew(RedBeanBoongEoBbang.launchMenu(1000))));
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
                    Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)));

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
                    Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(RedBeanBoongEoBbang.launchMenu(1000)));

            assertNotNull(menu.items());
        }
    }

    @Nested
    @DisplayName("Count")
    class CountTest {

        @Test
        void 생성한_인스턴스에서_컬렉션_아이템의_개수를_얻을_수_있다() {
            Menu menu = Menu.launch(
                    Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                    Menu.Item.appendNew(RedBeanBoongEoBbang.launchMenu(1000)));

            assertEquals(menu.count(), 2);
        }
    }
}