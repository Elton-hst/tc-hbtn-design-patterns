public class Program {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.reproduzir("The Weeknd - Blinding Lights.mp3", TipoMedia.MP3);

        System.out.println();

        VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();
        videoMediaPlayer.reproduzirMp4("Uncharted.mp4");

        System.out.println();

        audioPlayer.reproduzir("Moon Knight S01E01.vlc", TipoMedia.VLC);
    }
}