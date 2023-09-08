package DecoratorPattern;

public class AdministrativeManager extends ResponsibleWorker{
    public AdministrativeManager(Employee employee) {
        super(employee);
    }
    public void whoIs(){
        super.whoIs();
        sayImBoss();
    }
    private void sayImBoss(){
        System.out.println("I am a boss. ");
    }
}
