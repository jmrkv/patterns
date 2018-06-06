package DecoratorPattern;

public class Milkshake extends Dessert{

    public Milkshake() {
        description = "Milkshake";
    }

    public double cost() {
        return 1.70;
    }
}
