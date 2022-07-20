package com.vamsi;
import java.util.*;

public class Main {
    static ArrayList<Album> allAlbums = new ArrayList<>();
    static ArrayList<playList> allPlayLists = new ArrayList<>();
    public static void main(String[] args) {

        Song song1 = new Song("Tu hai", "AR Rahman", 3.45);
        Song song2 = new Song("Tere Bina", "AR Rahman", 4.23);
        Song song3 = new Song("Masakali", "Mohit chauhan", 5.01);
        Song song4 = new Song("Kun faya Kun", "Mohit chauhan", 7.34);
        Song song5 = new Song("Jash-e-bahaara", "Javed ali", 4.76);
        Song song6 = new Song("Tum tak", "Javed ali", 4.12);
        Song song7 = new Song ("Ranjhanna", "Nakash aziz", 5.43 );
        Song song8 = new Song("Rap God", "Eminem", 7.65);
        Song song9 = new Song("Stay", "Justin Bieber", 3.32);
        Song song10 = new Song("Patakha guddi", "Nooran sisters", 4.55);


        Album arhits = new Album("Ar rahman", "Rahman hits");
        arhits.addSong(song3);
        arhits.addSong(song5);
        arhits.addSong(song4);
        arhits.addSong(song6);

        Album EnglishSongs = new Album("EMB", "English hit songs");
        EnglishSongs.addSong(song8);
        EnglishSongs.addSong(song9);

        playList bedTime = new playList("Bed time Songs");
        bedTime.addSongToList(song1);
        bedTime.addSongToList(song2);
        bedTime.addSongToList(song10);
        bedTime.addSongToList(song7);
        bedTime.addSongToList(song6);

        arhits.showSongs();
        bedTime.showSongsinList();

//        Album album = new Album("AR Rahman","Rahman hits");
//        Song song = new Song("Tu hai", "AR Rahman", 3.45);
//        album.addSong(song);
//        song = new Song("Masakali", "Mohit Chauhan", 4.23);
//        album.addSong(song);
//        song = new Song("Mehabooba", "Sunidhi chauhan", 4.00);
//        album.addSong(song);
//
//        allAlbums.add(album);
//        System.out.println(allAlbums.get(0).albumTitle +" -- "+allAlbums.get(0).totalDuration+" -- "+allAlbums.get(0).getArtist());
//        System.out.println("Songs in this album : "+allAlbums.get(0).songsCount);
//
//        allAlbums.get(0).removeSong(album.SongsList.get(1));
//        System.out.println("Songs in this album : "+allAlbums.get(0).songsCount);
    }
}
