package DecoratorPattern.paninoteca;

public class ExtraKetchupDecorator extends ExtraAdditionDecorator{

    public ExtraKetchupDecorator(Consumation consumation){
        this.consumation = consumation;
    }

    @Override
    public double getPrice() {
        return consumation.getPrice() + 0.20;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " con aggiunta di ketchup";
    }
}
