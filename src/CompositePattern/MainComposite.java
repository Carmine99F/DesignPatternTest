package CompositePattern;

public class MainComposite {

    public static void main(String[] args) {
        //Creo singoli componenti
        Component monitor = new SinglePart("LCD Monitor");
        Component keyboard = new SinglePart("Italian Keyboard");
        Component processor = new SinglePart("Pentium III Processor");
        Component ram = new SinglePart("256 KB RAM");
        Component hardDisk = new SinglePart("40 Gb Hard Disk");

        //Creo un nuovo componente che è al composizione di 3 SinglePart

        Component mainSystem= new CompundPart("Main Sysyem");


        try {
            mainSystem.addComponent(processor);
            mainSystem.addComponent(ram);
            mainSystem.addComponent(hardDisk);
        } catch (SinglePartException e) {
            throw new RuntimeException(e);
        }

        //Creo il componente Computer
        Component computer = new CompundPart("PC");

        try {
            computer.addComponent(monitor);
            computer.addComponent(keyboard);
            computer.addComponent(mainSystem);
        } catch (SinglePartException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Descrizione del componente Monitor ");
        monitor.describe();
        System.out.println("Descrizione del componente Main System ");
        mainSystem.describe();
        System.out.println("Descrizione del componente Computer ");
        computer.describe();



    }
}
