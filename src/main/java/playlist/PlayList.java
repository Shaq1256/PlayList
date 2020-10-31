package playlist;

import java.util.Scanner;

public class PlayList {
    SongsLibrary songsLibrary = new SongsLibrary();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean next = true;
    boolean prev = true;

    public void playLista() {
        songsLibrary.addSong("November Rain", "Gunns", "Gunns and Roses", 1.45);
        songsLibrary.addSong("Nothing else matters", "Black", "Mettalica", 2.00);
        songsLibrary.showSongsList();
    }

    public void playSong() {
        songsLibrary.addSong("November Rain", "Gunns", "Gunns and Roses", 1.45);
        songsLibrary.addSong("Nothing else matters", "Black", "Mettalica", 2.00);
        System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(0));

        while (!quit) {
            printPlaySongMenu();
            System.out.println("Enter your action:\r");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(1));
                    break;

                case 2:
                    System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(0));
                    break;

                case 3:
                    quit = true;
                    break;
            }
        }

    }

    public void printPlaySongMenu() {
        System.out.println("1. Next song");
        System.out.println("2. Previous song");
        System.out.println("3. Exit to main menu");
    }
}
