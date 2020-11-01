package playlist;

import java.security.spec.RSAOtherPrimeInfo;
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
        songsLibrary.addSong("Sen o Victorii", "Dzem", "Dzem", 2.20);
        songsLibrary.addSong("Marchewkowe pole", "Punk", "Lady Pank", 2.45);
        songsLibrary.addSong("Nothing else matters", "Black", "Mettalica", 2.15);
        songsLibrary.showSongsList();
    }

    public void playSong() {
        int play = 0;
        playLista();
        System.out.println("");
        System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(play));

        while (!quit) {
            printPlaySongMenu();
            System.out.println("Enter your action:\r");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    if (play < songsLibrary.getSongsList().size()) {
                        System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(play++));
                        break;
                    } else {
                        play = 0;
                        System.out.println("End of play list.");
                        break;
                    }

                case 2:
                    if (play >= 0) {
                        System.out.println("Now playing: " + "\n" + songsLibrary.getSongsList().get(play--));
                        break;
                    } else {
                        play = 0;
                        System.out.println("End of play list.");
                        break;
                    }

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
