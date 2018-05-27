package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Andrew on 08-May-18.
 */
public class Playlist {
    LinkedList<Song> playlist = new LinkedList<>();
    ListIterator<Song> itr = playlist.listIterator();

    public void addSong(Song song){
        while(itr.hasNext()){
            itr.next();
        }
        itr.add(song);
        while(itr.hasPrevious()){
            itr.previous();
        }
        System.out.println("Added " + song.getTitle() + " to playlist");
    }

    public String skipSong(){
        if(itr.hasNext()){
            return (itr.next().getTitle());
        }
        return "At the end of playlist";
    }

    public String skipBackwards(){
        if (itr.hasPrevious()) {
            return (itr.previous().getTitle());
        }
        return "At start of playlist";

    }

    public void removeSong(String songTitle){
        while (itr.hasPrevious()) {
            itr.previous();
        }
        while (itr.hasNext()){
            if (itr.next().getTitle().equals(songTitle)){
                itr.remove();
                System.out.println("Removing " + songTitle + ". Returning to start of playlist");
            }
        }
        while (itr.hasPrevious()) {
            itr.previous();
        }
    }






}
