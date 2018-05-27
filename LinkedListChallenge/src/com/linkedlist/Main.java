package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Andrew on 08-May-18.
 */
public class Main {



    public static void main(String[] args){
        Album blackAlbum = new Album();
        Album metropolis = new Album();
        Album francis = new Album();
        Playlist playlist = new Playlist();
        ArrayList<Album> albums = new ArrayList<>();

        blackAlbum.addSong("Enter Sandman","4:55");
        blackAlbum.addSong("Sad But True","2:35");
        blackAlbum.addSong("Fuel","" +"3:55");
        blackAlbum.addSong("Master of Puppets","10:20");

        metropolis.addSong("Overture 1948","12:16");
        metropolis.addSong("Home","16:45");
        metropolis.addSong("Dance of Eternity","15:10");

        francis.addSong("Cicatriz","30:12");
        francis.addSong("The Widow","7:12");

        addAlbum(albums, blackAlbum);
        addAlbum(albums, metropolis);
        addAlbum(albums, francis);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println("Enter the name of the song");
                    String songName = scanner.nextLine();
                    if(checkSong(albums,songName)) {
                        playlist.addSong(findSong(albums, songName));
                    }
                    break;
                case 2:
                    if(!goingForward){
                        playlist.skipSong();
                    }
                    System.out.println(playlist.skipSong());
                    goingForward = true;
                    break;
                case 3:
                    if(goingForward){
                        playlist.skipBackwards();
                    }
                    System.out.println(playlist.skipBackwards());
                    goingForward = false;
                    break;
                case 4:
                    if(!goingForward){
                        playlist.skipSong();
                    }
                    System.out.println(playlist.skipBackwards());
                    goingForward = false;
                    break;
                case 5:
                    System.out.println("Enter name of song to remove");
                    playlist.removeSong(scanner.nextLine());
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To add a song to playlist");
        System.out.println("\t 2 - To skip song");
        System.out.println("\t 3 - To go back a song");
        System.out.println("\t 4 - To replay song");
        System.out.println("\t 5 - To remove song");
        System.out.println("\t 6 - To quit the application");
    }





    public static void addAlbum(ArrayList<Album> albums, Album album){
        albums.add(album);
    }

    public static boolean checkSong(ArrayList<Album> albums, String songTitle){
        for(int i = 0;i<albums.size();i++){
            if(albums.get(i).albumCheck(songTitle)){
                return true;
            }
        }
        System.out.println("Song not found");
        return false;
    }

    public static Song findSong(ArrayList<Album> albums, String songTitle){
        for(int i = 0;i<albums.size();i++){
            if(albums.get(i).albumCheck(songTitle)){
                return albums.get(i).retrieveSong(songTitle);
            }
        }
        return null;
    }

}

