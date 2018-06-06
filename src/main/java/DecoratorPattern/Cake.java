package DecoratorPattern;

public class Cake extends Dessert {


    public Cake() {
        description = "Cake";
    }

    public double cost() {
        return 3.99;
    }
}
