package ProxyPattern.file.internet;

public class MainInternetProxy {

    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        try {
            internet.connectTo("www.google.com");
            internet.connectTo("www.sitobannato1.it");
            internet.connectTo("www.yahoo.com");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
