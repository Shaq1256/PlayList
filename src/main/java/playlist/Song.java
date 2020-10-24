package playlist;

public class Song {
    private String title;
    private String album;
    private String artist;
    private double duration;

    public Song(String title, String album, String artist, double duration) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (Double.compare(song.duration, duration) != 0) return false;
        if (title != null ? !title.equals(song.title) : song.title != null) return false;
        if (album != null ? !album.equals(song.album) : song.album != null) return false;
        return artist != null ? artist.equals(song.artist) : song.artist == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
