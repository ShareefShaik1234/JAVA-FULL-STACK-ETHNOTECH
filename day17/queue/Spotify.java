package day17.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();

        q.add("song1");
        q.add("song2");
        q.add("song3");
        q.add("song4");
        q.add("song5");
        q.add("song6");
        q.add("song7");
        q.add("song8");
        q.add("song9");
        q.add("song10");

        int choice;

        do {
            System.out.println("\nSpotify Queue");
            System.out.println("==============");
            System.out.println("1. Add song");
            System.out.println("2. Remove song");
            System.out.println("3. Play current song");
            System.out.println("4. Current playlist");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter song name: ");
                    String songName = sc.next();
                    q.add(songName);
                    System.out.println(songName + " added to queue");
                    break;

                case 2:
                    if (!q.isEmpty()) {
                        System.out.println(q.poll() + " removed from queue");
                    } else {
                        System.out.println("Spotify queue is empty");
                    }
                    break;

                case 3:
                    if (!q.isEmpty()) {
                        System.out.println("Now Playing: " + q.peek());
                    } else {
                        System.out.println("Spotify queue is empty");
                    }
                    break;

                case 4:
                    System.out.println("Playlist: " + q);
                    break;

                case 5:
                    System.out.println("Exiting Spotify...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}