package ObserverPattern.newsagency;

public class MainAgency {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.addObserver(observer);
        observable.setNews("news");
    }


}
