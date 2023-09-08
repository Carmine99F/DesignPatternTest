package DecoratorPattern;

public class MainDecorator {

    public static void main(String[] args) {
        Employee thisWillBeFamous = new Engineer("William Gateway", "Programming department" );
        System.out.println("Who are you ? ");
        thisWillBeFamous.whoIs();
        /*
        thisWillBeFamous = new AdministrativeManager(thisWillBeFamous);
        System.out.println("Who are you now? ");
        thisWillBeFamous.whoIs();
        */
        thisWillBeFamous = new ProjectManager(thisWillBeFamous, "Doors Operating System");
        System.out.println("Who are you now? ");
        thisWillBeFamous.whoIs();

        thisWillBeFamous = new ProjectManager(thisWillBeFamous, "EveryoneLoggedToInternet Explorer");
        System.out.println("Who are you now? ");
        thisWillBeFamous.whoIs();
        System.out.println("------------------------------");

        Employee thisWillBeFamous1 = new Engineer("Tom", "ahahababb");
        thisWillBeFamous1 = new ProjectManager(thisWillBeFamous1, "Springboot application test");
        System.out.println("Who are you now? ");
        thisWillBeFamous1.whoIs();
    }
}
