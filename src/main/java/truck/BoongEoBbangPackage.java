package truck;

import truck.food.BoongEoBbang;
import util.CheckInteger;
import util.CheckNull;

import java.util.ArrayList;
import java.util.List;

public class BoongEoBbangPackage {

    private final List<BoongEoBbang> boongEoBbangs;

    private BoongEoBbangPackage(List<BoongEoBbang> items) {
        this.boongEoBbangs = new ArrayList<>(items);
    }

    public static BoongEoBbangPackage toGo(List<BoongEoBbang> items) {
        CheckNull.ofCollections(items);

        if (items.isEmpty()) {
            throw new IllegalArgumentException();
        }

        CheckInteger.moreThenOne(items.size());

        return new BoongEoBbangPackage(items);
    }

    public List<BoongEoBbang> boongEoBbangs() {
        return this.boongEoBbangs;
    }

    public int count() {
        return this.boongEoBbangs().size();
    }
}
