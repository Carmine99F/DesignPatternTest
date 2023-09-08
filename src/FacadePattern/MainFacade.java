package FacadePattern;

public class MainFacade {

    public static void main(String[] args) {
        ConsoleReader consoleReader= new ConsoleReader(true);
        Integer num = consoleReader.readInteger();
        System.out.println("Ho letto " + num);
    }
}
