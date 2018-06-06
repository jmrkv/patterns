package DecoratorPattern.Toppings;

import DecoratorPattern.Dessert;
import DecoratorPattern.ToppingDecorator;

public class Nuts extends ToppingDecorator {

    Dessert dessert;

    public String getDescription() {
        return dessert.getDescription() + "nuts";
    }
    public double cost() {
        return dessert.cost() + 0.20;
    }

}
