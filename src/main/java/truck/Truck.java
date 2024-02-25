package truck;

import customer.BoongEoBbangPackage;
import customer.Order;
import truck.food.JavaBoongEoBbang;
import truck.food.JavaCreamPuffBoongEoBbang;
import truck.food.JavaRedBeanBoongEoBbang;
import util.JavaCheckNull;

import java.util.List;
import java.util.stream.Collectors;

public class Truck {

    private final Menu menu;

    public Truck(Menu menu) {
        this.menu = menu;
    }

    public static Truck open() {
        return new Truck(
            Menu.launch(
                Menu.Item.appendNew(JavaCreamPuffBoongEoBbang.launchMenu(1000)),
                Menu.Item.appendNew(JavaRedBeanBoongEoBbang.launchMenu(1000))
            )
        );
    }

    public BoongEoBbangPackage buyBoongEoBbang(Order order) {
        JavaCheckNull.ofOne(order);

        return BoongEoBbangPackage.doPackUp(doMake(order));
    }

    private List<JavaBoongEoBbang> doMake(Order order) {
        return order.items()
                .stream()
                .map(orderItem -> menu.takeOrder(orderItem.type()))
                .collect(Collectors.toList());
    }
}
