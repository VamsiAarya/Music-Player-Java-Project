package com.vamsi;
import java.util.*;

import static com.vamsi.Main.allPlayLists;

public class playList {
    private int playListId;
    private String playListName;
    private double playListDuration;
    private int songsCount;
    LinkedList<Song> plSongs;

    playList(){    }

    playList(String title){
        plSongs = new LinkedList<>();
        setPlayListName(title);
    }

    public  void setPlayListId(){ this.playListId = allPlayLists.size()+1;}
    public  int getPlayListId(){ return this.playListId; }

    public void setPlayListName(String title){
        this.playListName = title;
    }

    public String getPlayListName(){
        return this.playListName;
    }
    private boolean isSongPresent (Song checkSong)
    {
        int index = this.plSongs.indexOf(checkSong);
        return index >= 0 && index < this.plSongs.size();
    }

    public void addSongToList(Song addingSong){
        if(!isSongPresent(addingSong)){
            plSongs.add(addingSong);
            this.playListDuration+=addingSong.getDuration();
            this.songsCount++;
            System.out.println("'"+addingSong.getSongTitle()+"' has been added to '"+this.getPlayListName()+"' playlist successfully");
        }
        else{
            System.out.println("'"+addingSong.getSongTitle()+"' is already in '"+this.getPlayListName()+"' playlist ");
        }
    }

    public void removeSongFromList(Song remSong){
        if(isSongPresent(remSong)){
            plSongs.remove(remSong);
            this.playListDuration -= remSong.getDuration();
            this.songsCount--;
            System.out.println("'"+remSong.getSongTitle()+"' has been removed from '"+ this.getPlayListName()+"' playlist successfully");
        }
        else{
            System.out.println("'"+remSong.getSongTitle()+"' is not present in '"+this.getPlayListName()+"' playlist ");
        }
    }

    public void showSongsinList(){
        System.out.println("Play List: "+this.getPlayListName());
        for(int i=0; i<songsCount; i++){
            System.out.println((i+1)+"."+this.plSongs.get(i).getSongTitle());
        }
        System.out.println();
    }

}
