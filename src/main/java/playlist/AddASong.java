package playlist;

import java.util.Scanner;

public class AddASong {
    String title, album, artist;
    double duration;
    Scanner scanner = new Scanner(System.in);

    public String enterTitle() {
        System.out.println("Enter title of a song:\r");
        title = scanner.nextLine();
        return title;
    }
    public String enterAlbum() {
        System.out.println("Enter album of a song:\r");
        album = scanner.nextLine();
        return album;
    }
    public String enterArtist() {
        System.out.println("Enter artist of a song:\r");
        artist = scanner.nextLine();
        return artist;
    }
    public double enterDuration() {
        System.out.println("Enter duration of a song:\r");
        duration = scanner.nextDouble();
        return duration;
    }

}
