public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advanced;
    private TipoMedia tipo;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {

        if (tipoMedia != TipoMedia.MP3){
            this.advanced = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(String nome, TipoMedia tipo) {
        if (tipo == TipoMedia.MP4){
            advanced.reproduzirMp4(nome);
        }
        else if (tipo == TipoMedia.VLC){
            advanced.reproduzirVlc(nome);
        }
    }
}