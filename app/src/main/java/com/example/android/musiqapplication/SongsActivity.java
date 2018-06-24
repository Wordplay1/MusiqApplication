package com.example.android.musiqapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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

        songs.add(new Songs("Dance Gavin Dance","Midnight Crusade"));
        songs.add(new Songs("Post Malone","I Fall Apart"));
        songs.add(new Songs("David Axelrod","Holy Thursday"));
        songs.add(new Songs("NAV","TTD"));
        songs.add(new Songs("J Cole","ATM"));
        songs.add(new Songs("A$AP Rocky","Bad Company"));
        songs.add(new Songs("Jay Critch","Did it Again"));
        songs.add(new Songs("Moby","Porcelain"));
        songs.add(new Songs("Tupac","Changes"));
        songs.add(new Songs("Lil Wayne","Right Above It"));
        songs.add(new Songs("Bryson Tiller","Self Made"));

        SongAdapter songAdapter = new SongAdapter(this,songs,R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}