package com.example.arunlakhera.mmmuzik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumsAdapter extends BaseAdapter {

    // Variable Declaration
    Context context;
    String albumsList[];
    LayoutInflater albumsInflater;

    // Constructor to initialize values
    public AlbumsAdapter(Context applicationContext, String[] albumsList) {
        this.context = applicationContext;
        this.albumsList = albumsList;
        albumsInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return albumsList.length;
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

        view = albumsInflater.inflate(R.layout.albums_listview, null);

        TextView album_TextView = view.findViewById(R.id.textView_Album);
        ImageView icon = view.findViewById(R.id.imageView_Icon);

        album_TextView.setText(albumsList[i]);
        icon.setImageResource(R.drawable.green);

        return view;
    }
}
