package com.example.android.musiqapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Songs> songs = new ArrayList<>();

        songs.add(new Songs("Dance Gavin Dance","Artificial Intelligence",R.drawable.dancegavindancecover));
        songs.add(new Songs("Post Malone","Stoney",R.drawable.stoneyalbumcover));
        songs.add(new Songs("David Axelrod","Song of Innocence",R.drawable.songofinnocence));
        songs.add(new Songs("NAV","NAV",R.drawable.navalbumcover));
        songs.add(new Songs("J Cole","KOD",R.drawable.kodalbumcover));
        songs.add(new Songs("A$AP Rocky","Bad Company",R.drawable.asaprockyalbumcover));
        songs.add(new Songs("Jay Critch","Rich Forever 3",R.drawable.jaycritchalbumcover));
        songs.add(new Songs("Moby","Play & Play: The B Sides",R.drawable.mobyalbumcover));
        songs.add(new Songs("Tupac","Greatest Hits", R.drawable.tupacalbumcover));
        songs.add(new Songs("Lil Wayne","I Am Not a Human Being",R.drawable.lilwaynealbumcover));
        songs.add(new Songs("Bryson Tiller","Self Made",R.drawable.brysontiller));

        AlbumAdapter albumAdapter = new AlbumAdapter(this,songs,R.color.category_color);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}
