package section8.lect119;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("First album", "First artist");
        album.addSong("1. song", 3.2);
        album.addSong("2. song", 2.2);
        album.addSong("3. song", 1.2);
        album.addSong("4. song", 3.1);
        album.addSong("5. song", 3.4);
        album.addSong("6. song", 1.3);

        albums.add(album);

        album = new Album("Second album", "Second artist");
        album.addSong("1. song", 1.2);
        album.addSong("2. song", 2.2);
        album.addSong("3. song", 3.2);
        album.addSong("4. song", 4.1);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("1. song", playList);
        albums.get(0).addToPlayList("3. song", playList);
        albums.get(0).addToPlayList("5. song", playList);
        albums.get(0).addToPlayList("fake song", playList);
        albums.get(1).addToPlayList("1. song", playList);
        albums.get(1).addToPlayList("4. song", playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playList");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are at the start of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    printMenu();
                default:

            }
        }
    }

    private static void printMenu() {
    }
}
