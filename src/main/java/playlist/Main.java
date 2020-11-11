package playlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean next = true;
        PlayList playList = new PlayList();

        File file = new File("C:\\Users\\Lukasz\\IdeaProjects\\MyProjects\\Playlist\\playlista.txt");
        Scanner in = new Scanner(file);

        String zadanie = in.nextLine();
        System.out.println(zadanie);

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
                    playList.addSong();
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
    }


    private static void printPlayListMenu() {
        System.out.println("1. Show playlist");
        System.out.println("2. Add a song");
        System.out.println("3. Delete a song");
        System.out.println("4. Play a song");
        System.out.println("5. Exit");
    }
}
