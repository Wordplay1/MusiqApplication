package com.example.android.musiqapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.android.musiqapplication.R;
import com.example.android.musiqapplication.Songs;

import java.util.ArrayList;


public class NowPlayingActivity extends AppCompatActivity {

    MediaPlayer mp;

    ImageButton play, pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);






    }
}