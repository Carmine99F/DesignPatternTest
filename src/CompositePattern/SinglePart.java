package CompositePattern;
//Oggetto Leaf
public class SinglePart extends Component {

    public SinglePart(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Nome del singolo componente " + name);
    }
}
