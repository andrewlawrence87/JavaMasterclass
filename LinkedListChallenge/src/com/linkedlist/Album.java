package com.linkedlist;

import java.util.ArrayList;

/**
 * Created by Andrew on 08-May-18.
 */
public class Album {
    ArrayList<Song> album = new ArrayList<>();

    public void addSong(String songTitle, String songDuration){
        if(albumCheck(songTitle)) System.out.println("Song is already in album");
        album.add(createSong(songTitle,songDuration));
    }

    private Song createSong(String songTitle, String songDuration){
        Song song = new Song(songTitle, songDuration);
        return song;
    }

    public Boolean albumCheck(String songTitle){
        for(int i = 0;i<album.size();i++){
            if (album.get(i).getTitle().equals(songTitle)){
                return true;
            }
        }
        return false;
    }

    public Song retrieveSong(String songTitle){
        return album.get(findSongIndex(songTitle));
    }

    private int findSongIndex(String songTitle){
        for(int i=0;i<album.size();i++){
            if (album.get(i).getTitle().equals(songTitle)){
                return i;
            }
        }
        return -1;
    }


}
