package DecoratorPattern;

public class Pancakes extends Dessert{

    public Pancakes() {
        description = "Pancakes";
    }
    public double cost() {
        return 2.20;
    }
}
