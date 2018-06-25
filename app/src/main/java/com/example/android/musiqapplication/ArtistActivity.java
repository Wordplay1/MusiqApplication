package com.example.android.musiqapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Songs> songs = new ArrayList<>();

        songs.add(new Songs("Dance Gavin Dance","Midnight Crusade",R.drawable.ic_launcher_background));
        songs.add(new Songs("Post Malone","I Fall Apart",R.drawable.ic_launcher_background));
        songs.add(new Songs("David Axelrod","Holy Thursday",R.drawable.ic_launcher_background));
        songs.add(new Songs("NAV","TTD",R.drawable.ic_launcher_background));
        songs.add(new Songs("J Cole","ATM",R.drawable.ic_launcher_background));
        songs.add(new Songs("A$AP Rocky","Bad Company",R.drawable.ic_launcher_background));
        songs.add(new Songs("Jay Critch","Did it Again",R.drawable.ic_launcher_background));
        songs.add(new Songs("Moby","Porcelain",R.drawable.ic_launcher_background));
        songs.add(new Songs("Tupac","Changes",R.drawable.ic_launcher_background));
        songs.add(new Songs("Lil Wayne","Right Above It",R.drawable.ic_launcher_background));
        songs.add(new Songs("Bryson Tiller","Self Made",R.drawable.ic_launcher_background));

        ArtistAdapter artistAdapter = new ArtistAdapter(this,songs,R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(artistAdapter);
    }
}