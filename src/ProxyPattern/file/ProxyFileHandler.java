package ProxyPattern.file;

public class ProxyFileHandler extends FileHandler{

    private RealFileHandler realHandler;
    private int lineNumber;
    private String lineText;

    public ProxyFileHandler(String filename) {
        super(filename);
        System.out.println("Creating a proxy cache ");
    }

    @Override
    public String getContext() {
        if(realHandler == null){
            realHandler = new RealFileHandler(filename);  //variabile ereditata dalla superclasse
        }
        return realHandler.getContext();
    }

    @Override
    public String getLine(int requestedLine) {
        if( requestedLine == lineNumber){
            System.out.println("accessing from proxy cache ");
            return lineText;
        }else{
            if(realHandler == null){
                realHandler = new RealFileHandler(filename);
                lineText = realHandler.getLine(requestedLine);
                lineNumber = requestedLine;

            }
        }
        return lineText;
    }
}
