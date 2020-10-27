package playlist;

public class PlayList {
    SongsLibrary songsLibrary = new SongsLibrary();

    public void playLista() {
    songsLibrary.addSong("November Rain", "Gunns", "Gunns and Roses", 1.45);
    songsLibrary.addSong("Nothing else matters", "Black", "Mettalica", 2.00);
    songsLibrary.showSongsList();
    }

    public void playSong() {
        songsLibrary.showSongsList();

    }
}
