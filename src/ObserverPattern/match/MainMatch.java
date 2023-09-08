package ObserverPattern.match;

public class MainMatch {

    public static void main(String[] args) {
        ObservableMatch match = new ObservableMatch();
        Observer observer1 = new ObserverMatch("1");
        Observer observer2 = new ObserverMatch("2");

        match.addObserver(observer1);
        match.addObserver(observer2);

        match.setMatchscore("1-0");
        match.removeObserver(observer2);
        match.setMatchscore("2-0");


    }




}
