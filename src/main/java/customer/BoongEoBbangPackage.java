package customer;

import truck.food.BoongEoBbang;
import truck.food.Food;
import util.CheckInteger;
import util.CheckNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BoongEoBbangPackage implements Package {

    private final Queue<BoongEoBbang> boongEoBbangs;

    private BoongEoBbangPackage(List<BoongEoBbang> items) {
        this.boongEoBbangs = new LinkedList<>(items);
    }

    public static BoongEoBbangPackage doPackUp(List<BoongEoBbang> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException();
        }

        CheckNull.ofCollections(items);
        CheckInteger.moreThenOne(items.size());

        return new BoongEoBbangPackage(items);
    }

    public int count() {
        return this.boongEoBbangs.size();
    }

    @Override
    public boolean isEmpty() {
        return this.boongEoBbangs.isEmpty();
    }

    @Override
    public Food takeOne() {
        if (isEmpty()) {
            throw new IllegalArgumentException("already finished eating it.");
        }

        return this.boongEoBbangs.poll();
    }
}
