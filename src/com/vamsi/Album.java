package com.vamsi;

import java.util.*;

public class Album {
    String Artist;
    double totalDuration;
    int songsCount;
    String albumTitle;
    LinkedList<Song> SongsList;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    Album(){}

    Album(String artist, String albumName){
        setArtist(artist);
        setAlbumTitle(albumName);
        SongsList = new LinkedList<>();
    }
    private boolean isSongPresent (Song checkSong)
    {
        int index = this.SongsList.indexOf(checkSong);
        return index >= 0 && index < this.SongsList.size();
    }
    public void addSong(Song addingSong)
    {
        if(isSongPresent(addingSong)){
            System.out.println("This song is already present in the '"+this.albumTitle+"' album");
        }
        else{
            this.SongsList.add(addingSong);
            this.songsCount++;
            this.totalDuration+= addingSong.getDuration();
            System.out.println("'"+addingSong.getSongTitle()+"' has been added to '"+this.albumTitle+"' album successfully");
        }
    }

    public void removeSong(Song removingSong )
    {
        if(isSongPresent(removingSong))
        {
            this.SongsList.remove(removingSong);
            this.songsCount--;
            this.totalDuration -= removingSong.getDuration();
            System.out.println("'"+removingSong.getSongTitle()+"' has been removed from '"+ this.albumTitle+"' album successfully");
        }
        else{
            System.out.println("This song is not present in the '"+this.albumTitle+"' album");
        }
    }

    public void showSongs(){
        System.out.println("Album: "+ this.albumTitle);
        for(int i=0; i< songsCount; i++){
            System.out.println((i+1)+"."+this.SongsList.get(i).getSongTitle());
        }
        System.out.println();
    }
}
