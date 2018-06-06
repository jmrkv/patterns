package DecoratorPattern.Toppings;

import DecoratorPattern.Dessert;
import DecoratorPattern.ToppingDecorator;

public class Jam extends ToppingDecorator {

    Dessert dessert;

    public String getDescription() {
        return dessert.getDescription() + "jam";
    }

    public double cost() {
        return dessert.cost() + 0.15;
    }
}
