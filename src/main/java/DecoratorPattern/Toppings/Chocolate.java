package DecoratorPattern.Toppings;

import DecoratorPattern.Dessert;
import DecoratorPattern.ToppingDecorator;

public class Chocolate extends ToppingDecorator {

    Dessert dessert;

    public String getDescription() {
        return dessert.getDescription() + "chocolate";
    }

    public double cost() {
        return dessert.cost() + 0.40;
    }
}
