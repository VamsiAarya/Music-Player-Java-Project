package com.vamsi;

public class Song {
    private String SongTitle;
    private double duration;
    private String artist;

    Song(){    }

    Song(String title, String Artist, double Duration)
    {
        setSongTitle(title);
        setArtist(Artist);
        setDuration(Duration);
    }

    public void setSongTitle(String songTitle) {
        SongTitle = songTitle;
    }
    public String getSongTitle() {
        return SongTitle;
    }
    public void setArtist(String Artist)
    {
        artist = Artist;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setDuration(double Duration){ duration = Duration;}
    public double getDuration(){return duration;}
}
