public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(String nome, TipoMedia tipo) {
        if (tipo == TipoMedia.MP3){
            System.out.print("Reproduzindo MP3: " + nome);
        }
        else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipo);
            mediaPlayerAdapter.reproduzir(nome, tipo);
        }

    }
}