package truck;

import truck.food.BoongEoBbang;
import util.CheckInteger;

import java.util.ArrayList;
import java.util.List;

public class BoongEoBbangPackage {

    private final List<BoongEoBbang> boongEoBbangs;

    private BoongEoBbangPackage(List<BoongEoBbang> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException();
        }

        CheckInteger.moreThenOne(items.size());

        this.boongEoBbangs = new ArrayList<>(items);
    }

    public static BoongEoBbangPackage toGo(List<BoongEoBbang> items) {
        return new BoongEoBbangPackage(items);
    }

    public List<BoongEoBbang> boongEoBbangs() {
        return this.boongEoBbangs;
    }
}
