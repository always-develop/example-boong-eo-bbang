package truck;

import customer.BoongEoBbangPackage;
import customer.Order;
import truck.food.BoongEoBbang;
import truck.food.CreamPuffBoongEoBbang;
import truck.food.RedBeanBoongEoBbang;
import util.CheckNull;

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
                Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                Menu.Item.appendNew(RedBeanBoongEoBbang.launchMenu(1000))
            )
        );
    }

    public BoongEoBbangPackage buyBoongEoBbang(Order order) {
        CheckNull.ofOne(order);

        return BoongEoBbangPackage.doPackUp(doMake(order));
    }

    private List<BoongEoBbang> doMake(Order order) {
        return order.items()
                .stream()
                .map(orderItem -> menu.takeOrder(orderItem.type()))
                .collect(Collectors.toList());
    }
}
