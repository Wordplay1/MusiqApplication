package com.example.android.musiqapplication;


import android.os.Parcel;
import android.os.Parcelable;

public class Songs implements Parcelable {

    private String mArtist;

    private String mSongName;

    private String mAlbumName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Songs(String artist, String songName) {
        mArtist = artist;
        mSongName = songName;
    }

    public Songs(String artist, String albumName, int imageResourceId) {
        mArtist = artist;
        mAlbumName = albumName;
        mImageResourceId = imageResourceId;
    }

    public Songs(Parcel in) {
        mSongName = in.readString();
        mArtist = in.readString();
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public int getResourceImageId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public static final Parcelable.Creator<Songs> CREATOR = new Parcelable.Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        @Override
        public Songs[] newArray(int size) {
            return new Songs[0];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSongName);
        parcel.writeString(mArtist);
    }
}
