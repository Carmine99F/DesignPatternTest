package ProxyPattern.file.internet;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{

    private Internet realInternet;
    private List<String> bannedSite;

    public InternetProxy(){
        realInternet = new RealInternet();
        bannedSite = new ArrayList<>();
        bannedSite.add("www.sitobannato1.it");
        bannedSite.add("www.sitobannato2.it");
    }


    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSite.contains(serverHost))
            System.out.println("Accesso a " + serverHost +" negato");
        else
            System.out.println(serverHost);
    }
}
