package DecoratorPattern.paninoteca;

public abstract class ExtraAdditionDecorator extends Consumation {

    protected Consumation consumation;

    public abstract String getProductName();
}
