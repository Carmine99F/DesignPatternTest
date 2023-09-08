package DecoratorPattern.paninoteca;

public class Hamburger extends Consumation{

    public Hamburger() {
        productName = "Hamburger";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}
