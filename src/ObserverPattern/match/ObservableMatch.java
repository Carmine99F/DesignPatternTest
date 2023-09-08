package ObserverPattern.match;

import java.util.ArrayList;
import java.util.List;

// Subject o Observable
public class ObservableMatch {
    private String matchscore;
    private List<Observer> observers = new ArrayList<>();

    public ObservableMatch(){
        this.matchscore="0-0";
    }

    public void addObserver(Observer channel){
        //Notifichiamo il risultato iniziale appena un channel si sottoscrive e poi lo aggiungiamo alla lista degli osservatori
        channel.update(this.matchscore);
        observers.add(channel);
    }

    public void removeObserver(Observer channel){
        observers.remove(channel);
    }

    public void setMatchscore(String newScore){
        this.matchscore = newScore;
        for(Observer channale : observers){
            channale.update(this.matchscore);
        }
    }


}
