package truck;

import truck.food.BoongEoBbang;
import util.CheckNull;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BoongEoBbangPackage {

    private final Set<BoongEoBbang> boongEoBbangs;

    private BoongEoBbangPackage(BoongEoBbang... items) {
        CheckNull.ofCollections((Object[]) items);

        this.boongEoBbangs = new LinkedHashSet<>(List.of(items));
    }

    public static BoongEoBbangPackage toGo(BoongEoBbang... items) {
        return new BoongEoBbangPackage(items);
    }

    public Set<BoongEoBbang> boongEoBbangs() {
        return this.boongEoBbangs;
    }
}
