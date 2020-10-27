package playlist;

import java.util.ArrayList;

public class SongsLibrary {
    private ArrayList<Song> songsList;

    public SongsLibrary() {
        this.songsList = new ArrayList<Song>();
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public boolean addSong(String title, String album, String artist, double duration) {
        if (findSong(title) == null) {
            this.songsList.add(new Song(title, album, artist, duration));
            System.out.println(title + " song added.");
            return true;
        }

        System.out.println(title + " song is already in the list.");
        return false;
    }

    public void showSongsList() {
        System.out.println("Playlist size: " + songsList.size());
        songsList.stream()
                .forEach(System.out::println);
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songsList) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
}
