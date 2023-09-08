package DecoratorPattern;

//ConcreteComponent
public class Engineer implements Employee{
    private String name;
    private String office;
    public Engineer(String name, String office) {
        this.name = name;
        this.office = office;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getOffice() {
        return this.office;
    }
    @Override
    public void whoIs() {
        System.out.println( "I am " + getName() + ", and I am with the "
                + getOffice() +".");
    }
}
