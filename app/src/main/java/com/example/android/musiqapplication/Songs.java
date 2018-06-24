package com.example.android.musiqapplication;

public class Songs {

    private String mArtist;

    private String mSongName;

    public Songs(String artist, String songName){
        mArtist = artist;
        mSongName = songName;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getSongName(){
        return mSongName;
    }
}
