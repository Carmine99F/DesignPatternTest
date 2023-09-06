package MediaPlayer;

public class MediaAdapter implements MediaPlayer{
    AdavncedMediaPlayer adavncedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            adavncedMusicPlayer = new VlcPlayer();
        if(audioType.equalsIgnoreCase("mp4"))
            adavncedMusicPlayer = new VlcPlayer();
    }


    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc"))
           adavncedMusicPlayer.playVlc(filename);
        if(audioType.equalsIgnoreCase("mp4"))
            adavncedMusicPlayer.playMp4(filename);
    }
}
