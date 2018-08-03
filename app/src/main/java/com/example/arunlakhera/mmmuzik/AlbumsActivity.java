package com.example.arunlakhera.mmmuzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    ListView albumsList;
    String albums[] = {"Album 1", "Album 2", "Album 3", "Album 4", "Album 5", "Album 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        albumsList = findViewById(R.id.listView_Albums);
        AlbumsAdapter albumsAdapter = new AlbumsAdapter(getApplicationContext(),albums);
        albumsList.setAdapter(albumsAdapter);
    }
}
