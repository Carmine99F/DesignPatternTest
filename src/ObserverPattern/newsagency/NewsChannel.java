package ObserverPattern.newsagency;

public class NewChannel implements Channel{
    private String news;
    @Override
    public void update(Object obj) {
        this.setNews((String)obj );
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
