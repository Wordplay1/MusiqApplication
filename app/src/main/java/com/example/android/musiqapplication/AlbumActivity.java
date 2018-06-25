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
        songs.add(new Songs("David Axelrod","Song of Innocence",R.drawable.ic_launcher_background));
        songs.add(new Songs("NAV","NAV",R.drawable.ic_launcher_background));
        songs.add(new Songs("J Cole","KOD",R.drawable.ic_launcher_background));
        songs.add(new Songs("A$AP Rocky","Bad Company",R.drawable.ic_launcher_background));
        songs.add(new Songs("Jay Critch","Rich Forever 3",R.drawable.ic_launcher_background));
        songs.add(new Songs("Moby","Play & Play: The B Sides",R.drawable.ic_launcher_background));
        songs.add(new Songs("Tupac","Greatest Hits", R.drawable.ic_launcher_background));
        songs.add(new Songs("Lil Wayne","I Am Not a Human Being",R.drawable.ic_launcher_background));
        songs.add(new Songs("Bryson Tiller","True to Self",R.drawable.ic_launcher_background));

        AlbumAdapter albumAdapter = new AlbumAdapter(this,songs,R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}
