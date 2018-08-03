package com.example.arunlakhera.mmmuzik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GenreAdapter extends BaseAdapter {

    Context context;
    String genreList[];
    LayoutInflater genreInflater;

    public GenreAdapter(Context applicationContext, String[] genreList){
        this.context = applicationContext;
        this.genreList = genreList;
        genreInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return genreList.length;
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

        view = genreInflater.inflate(R.layout.genre_listview,null);

        TextView genre_TextView = view.findViewById(R.id.textView_Genre);
        ImageView icon = view.findViewById(R.id.imageView_Icon);

        genre_TextView.setText(genreList[i]);
        icon.setImageResource(R.drawable.orange);

        return view;
    }
}