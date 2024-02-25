package truck;

import customer.BoongEoBbangPackage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import truck.food.JavaBoongEoBbang;
import truck.food.JavaCreamPuffBoongEoBbang;
import truck.food.JavaRedBeanBoongEoBbang;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("BoongEoBbangPackageTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BoongEoBbangPackageTest {

    @Nested
    @DisplayName("Initialize")
    class InitializeTest {

        @Test
        void 붕어빵_컬렉션을_받아_초기화할_수_있다() {
            List<JavaBoongEoBbang> boongEoBbangs = new ArrayList<>();
            boongEoBbangs.add(JavaCreamPuffBoongEoBbang.launchMenu(1000));
            boongEoBbangs.add(JavaRedBeanBoongEoBbang.launchMenu(1000));

            assertDoesNotThrow(() -> BoongEoBbangPackage.doPackUp(boongEoBbangs));
        }

        @Test
        void null을_전달받으면_IllegalArgumentException을_던진다() {
            assertThrows(IllegalArgumentException.class, () -> BoongEoBbangPackage.doPackUp(null));
        }

        @Test
        void 붕어빵_컬렉션_요소가_비어있으면_IllegalArgumentException을_던진다() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> BoongEoBbangPackage.doPackUp(new ArrayList<>()));
        }
    }
}