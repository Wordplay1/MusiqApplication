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

public class AlbumAdapter extends ArrayAdapter<Songs> {

    //for logs
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    //background color of the view.
    private int mColorResourceId;

    public AlbumAdapter(Activity context, ArrayList<Songs> songs, int colorResourceId){
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
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list,parent,false);
        }
        Songs currentAlbum = getItem(position);

        //set song name in text view
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText(currentAlbum.getAlbumName());

        //set artist in text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentAlbum.getArtist());

        //declare ImageView to set image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        //if condition for if view contains image or not
        if(currentAlbum.hasImage()){
            iconView.setImageResource(currentAlbum.getResourceImageId());
            iconView.setVisibility(View.VISIBLE);
        }else{
            iconView.setVisibility(View.GONE);
        }


        View songContainer = listItemView.findViewById(R.id.album_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        songContainer.setBackgroundColor(color);

        return listItemView;
    }
}
