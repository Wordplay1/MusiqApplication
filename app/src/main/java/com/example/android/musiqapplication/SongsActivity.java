package com.example.android.musiqapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        /**
         * Declare ArrayList for Song objects
         */
        ArrayList<Songs> songs = new ArrayList<>();

        songs.add(new Songs("Dance Gavin Dance", "Midnight Crusade"));
        songs.add(new Songs("Post Malone", "I Fall Apart"));
        songs.add(new Songs("David Axelrod", "Holy Thursday"));
        songs.add(new Songs("NAV", "TTD"));
        songs.add(new Songs("J Cole", "ATM"));
        songs.add(new Songs("A$AP Rocky", "Bad Company"));
        songs.add(new Songs("Jay Critch", "Did it Again"));
        songs.add(new Songs("Moby", "Porcelain"));
        songs.add(new Songs("Tupac", "Changes"));
        songs.add(new Songs("Lil Wayne", "Right Above It"));
        songs.add(new Songs("Bryson Tiller", "Self Made"));

        SongAdapter songAdapter = new SongAdapter(this, songs, R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        final TextView mSong =  findViewById(R.id.song_text_view);
        final TextView mArtist = findViewById(R.id.artist_text_view);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Songs song = (Songs)(parent.getItemAtPosition(position));
                Intent playIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                playIntent.putExtra("Songs", song);
                startActivity(playIntent);
            }
        });
    }
}