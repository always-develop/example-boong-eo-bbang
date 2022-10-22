package truck;

import customer.BuyBoongEoBbangs;
import truck.food.boongeobbang.CreamPuffBoongEoBbang;
import truck.food.boongeobbang.RedBeanBoongEoBbang;

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

    public BoongEoBbangPackage sellBoongEoBbang(BuyBoongEoBbangs buyRequest) {
        return new BoongEoBbangPackage();
    }
}
