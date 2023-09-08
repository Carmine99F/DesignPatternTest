package CompositePattern;

public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }
    public abstract void describe();

    public void addComponent(Component component) throws SinglePartException {
        if(this instanceof SinglePart)
            throw new SinglePartException("Non puoi aggiungere compoenti a un leaf");
    }

    public void removeComponent(Component component) throws SinglePartException {
        if(this instanceof SinglePart)
            throw new SinglePartException("Non puoi aggiungere compoenti a un leaf");
    }

    public Component getChild(int n){
        return  null;
    };
}
