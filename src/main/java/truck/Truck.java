package truck;

import customer.Order;
import truck.food.BoongEoBbang;
import truck.food.CreamPuffBoongEoBbang;
import truck.food.RedBeanBoongEoBbang;
import util.CheckNull;

import java.util.List;
import java.util.stream.Collectors;

public class Truck {

    private final Menu menu;

    private Truck() {
        // TODO use reflection, auto launched menu with Foods annotation
        this.menu = Menu.launch(
                Menu.Item.appendNew(CreamPuffBoongEoBbang.launchMenu(1000)),
                Menu.Item.appendNew(RedBeanBoongEoBbang.launchMenu(1000)));
    }

    public static Truck open() {
        return new Truck();
    }

    public BoongEoBbangPackage buy(Order order) {
        CheckNull.ofOne(order);

        return BoongEoBbangPackage.toGo(makesForCount(order));
    }

    private List<BoongEoBbang> makesForCount(Order order) {
        return order.items()
                .stream()
                .map(this::make)
                .collect(Collectors.toList());
    }

    private BoongEoBbang make(Order.Item item) {
        return menu.takeOrder(item.type());
    }
}
