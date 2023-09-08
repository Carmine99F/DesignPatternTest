package ProxyPattern.file;

import java.io.FileInputStream;

public class RealFileHandler extends FileHandler{

    private byte [] content;
    //Il costruttore segue le operazioni per il caricamento del file di testo in memoria
    public RealFileHandler(String filename) {
        super(filename);
        System.out.println("creating a real handler with file content ");
        FileInputStream file;
        try{
            file = new FileInputStream(filename);
            int numByte = file.available(); // restituisce il numero di byte non letti disponibili per la lettura
            content = new byte[numByte];
            file.read(content);
        }catch (Exception e){
            System.out.println(e.getMessage().toString());
        }
    }

    @Override
    public String getContext() {
        return new String(content);
    }

    @Override
    public String getLine(int requestedLine) {
        System.out.println( "(accessing from real handler)" );
        int numBytes = content.length;
        int currentLine = 1;
        int startingPos = -1;
        int lineLength = 0;
        for(int i=0;i<numBytes; i++) {
            if( ( currentLine == requestedLine ) &&
                    ( content[i] != 0x0A ) ) {
                if( startingPos == -1)
                    startingPos = i;
                lineLength++;
            }
            if( content[i] == 0x0D )
                currentLine++;
        }
        String lineText = "";
        if(startingPos != -1)
            lineText = new String( content, startingPos, lineLength-1 );
        return "\"" + lineText + "\"";
    }
}
