package DecoratorPattern;

public abstract class Dessert {

    public enum Serving {HERE, TAKE_AWAY}

    Serving serving = Serving.HERE;

    String description = "Unknown dessert";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public Serving getServing() {
        return serving;
    }

    public void setServing(Serving serving) {
        this.serving = serving;
    }



}
