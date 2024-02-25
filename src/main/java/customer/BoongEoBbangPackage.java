package customer;

import truck.food.JavaBoongEoBbang;
import truck.food.JavaFood;
import util.JavaCheckInteger;
import util.JavaCheckNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BoongEoBbangPackage implements Package {

    private final Queue<JavaBoongEoBbang> boongEoBbangs;

    private BoongEoBbangPackage(List<JavaBoongEoBbang> items) {
        this.boongEoBbangs = new LinkedList<>(items);
    }

    public static BoongEoBbangPackage doPackUp(List<JavaBoongEoBbang> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException();
        }

        JavaCheckNull.ofCollections(items);
        JavaCheckInteger.moreThenOne(items.size());

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
    public JavaFood takeOne() {
        if (isEmpty()) {
            throw new IllegalArgumentException("already finished eating it.");
        }

        return this.boongEoBbangs.poll();
    }
}
