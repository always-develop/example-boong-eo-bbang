package truck;

import customer.Order;
import customer.OrderItem;
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

    private BoongEoBbang make(OrderItem item) {
        return menu.takeOrder(item.type());
    }
}
