package ProxyPattern.file.internet;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connesso a " + serverHost);
    }
}
