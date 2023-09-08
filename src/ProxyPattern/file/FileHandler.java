package ProxyPattern.file;
//Subject, interfaccia comune per il RealSubject e il Poroxy
public abstract class FileHandler {

    protected String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public String getFilename(){
        return this.filename;
    }

    public abstract String getContext();
    public abstract String getLine(int requestedLine);
}
