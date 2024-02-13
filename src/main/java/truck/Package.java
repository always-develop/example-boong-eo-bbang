package truck;

import truck.food.Food;

public interface Package {

    Food takeOne();
    boolean isEmpty();
}
