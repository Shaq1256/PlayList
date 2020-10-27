package playlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean next = true;
        PlayList playList = new PlayList();

        while (!quit) {
            printPlayListMenu();
            System.out.println("Enter your action:\r");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    playList.playLista();
                    break;

                case 2:
                    System.out.println("case 1");
                    break;

                case 3:
                    System.out.println("case 2");
                    break;

                case 4:
                    playList.playSong();
                    break;

                case 5:
                    quit = true;
                    break;
            }
        }


//        SongsLibrary songsLibrary = new SongsLibrary();
//        songsLibrary.addSong("November Rain", "Gunns", "Gunns and Roses", 1.45);
//        songsLibrary.addSong("Nothing else matters", "Black", "Mettalica", 2.00);
//        songsLibrary.showSongsList();


    }


    private static void printPlayListMenu() {
        System.out.println("1. Show playlist");
        System.out.println("2. Add a song");
        System.out.println("3. Delete a song");
        System.out.println("4. Play a song");
        System.out.println("5. Exit");
    }
}
