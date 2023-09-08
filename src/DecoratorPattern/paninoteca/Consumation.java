package DecoratorPattern.paninoteca;
//Component
public abstract class Consumation {

    protected String productName = "";

    public String getProductName(){
        return  this.productName;
    }

    public abstract double getPrice();

}
