package com.example.android.musiqapplication;


import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {

    //for logs
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    //background color of the view.
    private int mColorResourceId;

    public SongAdapter(Activity context, ArrayList<Songs> songs,int colorResourceId){
        super(context,0,songs);
        mColorResourceId = colorResourceId;
    }

    /**View method to control ArrayAdapter
     *
     * @param position The position of the item within the adapter's data set of the item whose view we want
     * @param convertView The old view to reuse, if possible.
     * @param parent The parent that this view will eventually be attached to, This value must never be null.
     * @return listItemView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Songs currentSong = getItem(position);

        //set song name in text view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getSongName());

        //set artist in text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtist());

        View songContainer = listItemView.findViewById(R.id.songs_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        songContainer.setBackgroundColor(color);

        return listItemView;
    }
}
