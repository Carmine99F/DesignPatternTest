package ObserverPattern.match;

public class ObserverMatch implements Observer{

    private String id;
    private String score;

    public ObserverMatch(String id) {
        this.id = id;
    }

    @Override
    public void update(Object score) {
        System.out.println(" (Observer " + this.id +" ) risulatato : " + score);
        this.score = (String) score;
    }
}
