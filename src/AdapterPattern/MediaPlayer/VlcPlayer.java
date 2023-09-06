package AdapterPattern.MediaPlayer;

public class VlcPlayer implements AdavncedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name : "+ filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
