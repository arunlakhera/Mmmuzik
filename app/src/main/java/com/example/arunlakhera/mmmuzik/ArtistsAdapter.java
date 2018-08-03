package com.example.arunlakhera.mmmuzik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtistsAdapter extends BaseAdapter {

    Context context;
    String artistsList[];
    LayoutInflater artistsInflater;

    public ArtistsAdapter(Context applicationContext, String[] artistsList){
        this.context = applicationContext;
        this.artistsList = artistsList;
        artistsInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return artistsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = artistsInflater.inflate(R.layout.artists_listview,null);

        TextView artist_TextView = view.findViewById(R.id.textView_Artist);
        ImageView icon = view.findViewById(R.id.imageView_Icon);

        artist_TextView.setText(artistsList[i]);
        icon.setImageResource(R.drawable.brown);

        return view;
    }
}
