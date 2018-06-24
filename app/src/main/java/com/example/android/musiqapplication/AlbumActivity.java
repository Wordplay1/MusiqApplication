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

        AlbumAdapter albumAdapter = new AlbumAdapter(this,songs,R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}
