package com.example.android.musiqapplication;

public class Songs {

    private String mArtist;

    private String mSongName;

    private String mAlbumName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Songs(String artist, String songName){
        mArtist = artist;
        mSongName = songName;
    }

    public Songs(String artist, String albumName, int imageResourceId){
        mArtist = artist;
        mAlbumName = albumName;
        mImageResourceId = imageResourceId;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getSongName(){
        return mSongName;
    }

    public String getAlbumName(){
        return mAlbumName;
    }
    public int getResourceImageId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
