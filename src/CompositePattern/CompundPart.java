package CompositePattern;

import java.util.Vector;

public class CompundPart extends Component{

    private Vector children;

    public CompundPart(String name) {
        super(name);
        children = new Vector();
    }

    @Override
    public void describe() {
        System.out.println("Component: " + name);
        System.out.println("Composed by:");
        System.out.println("{");
        int vLength = children.size();
        for( int i=0; i< vLength ; i ++ ) {
            Component c = (Component) children.get( i );
            c.describe();
        }
        System.out.println("}");
    }

    @Override
    public void addComponent(Component component) throws SinglePartException {
        children.add(component);
    }

    @Override
    public void removeComponent(Component component) throws SinglePartException {
        children.remove(component);
    }

    @Override
    public Component getChild(int n) {
        return (Component) children.elementAt(n);
    }
}
