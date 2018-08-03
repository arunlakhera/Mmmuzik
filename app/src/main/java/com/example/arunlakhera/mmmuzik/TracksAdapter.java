package com.example.arunlakhera.mmmuzik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TracksAdapter extends BaseAdapter {

    Context context;
    String tracksList[];
    LayoutInflater tracksInflater;

    public TracksAdapter(Context applicationContext, String[] tracksList){
        this.context = applicationContext;
        this.tracksList = tracksList;
        tracksInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return tracksList.length;
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

        view = tracksInflater.inflate(R.layout.tracks_listview,null);

        TextView tracks_TextView = view.findViewById(R.id.textView_Tracks);
        ImageView icon = view.findViewById(R.id.imageView_Icon);

        tracks_TextView.setText(tracksList[i]);
        icon.setImageResource(R.drawable.black);

        return view;
    }
}
