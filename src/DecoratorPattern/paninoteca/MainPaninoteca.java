package DecoratorPattern.paninoteca;

public class MainPaninoteca {

    public static void main(String[] args) {
        Consumation hamburger = new Hamburger();
        System.out.println("Prodotto " + hamburger.getProductName() + " con prezzo " + hamburger.getPrice() + "$");
        Consumation cheeseBurger = new CheeseBurger();

        //Aggiungiamo la maionse al Burger
        Consumation hamburgerWhithMaiones = new ExtraMaioneseDecorator(hamburger);
        System.out.println("Prodotto  " + hamburgerWhithMaiones.getProductName() +" con prezzo " +hamburgerWhithMaiones.getPrice()+"$");

        //Aggiungiamo Maionese e katchup
        Consumation hamburgerWithMaionseKetchup = new ExtraKetchupDecorator( new ExtraMaioneseDecorator( hamburger));
        System.out.println("Prodotto  " + hamburgerWithMaionseKetchup.getProductName() +" con prezzo " +hamburgerWithMaionseKetchup.getPrice()+"$");


    }
}
