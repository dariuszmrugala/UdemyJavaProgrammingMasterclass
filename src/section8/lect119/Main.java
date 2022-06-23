package section8.lect119;

import java.util.*;

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
            printMenu();
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
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                    }
                    break;
                default:

            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        System.out.println("===============================");
        for(Song song : playList) {
            System.out.println(song);
        }
        System.out.println("===============================");
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - remove the current song from the playlist");
    }
}
