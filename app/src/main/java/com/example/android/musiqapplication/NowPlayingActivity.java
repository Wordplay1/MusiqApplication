package com.example.android.musiqapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        TextView mSongName = (TextView)findViewById(R.id.song_playing_textview);
        TextView mArtist = (TextView)findViewById(R.id.artist_playing_textview);

        Intent intent = getIntent();
        Songs songs = intent.getParcelableExtra("Songs");

        mSongName.setText(songs.getSongName());
        mArtist.setText(songs.getArtist());




    }
}