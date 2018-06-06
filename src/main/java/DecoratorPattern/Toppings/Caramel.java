package DecoratorPattern.Toppings;

import DecoratorPattern.Dessert;
import DecoratorPattern.ToppingDecorator;

public class Caramel extends ToppingDecorator {

    Dessert dessert;

    public String getDescription() {
        return dessert.getDescription() + "caramel";
    }
    public double cost() {
        return dessert.cost() + 0.25;
    }

}
