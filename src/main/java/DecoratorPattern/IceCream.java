package DecoratorPattern;

public class IceCream extends Dessert {

    public IceCream() {
        description = "Ice Cream";
    }

    public double cost() {
        return 1.50;
    }
}
