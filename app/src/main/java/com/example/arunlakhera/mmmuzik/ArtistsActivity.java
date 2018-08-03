package com.example.arunlakhera.mmmuzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ArtistsActivity extends AppCompatActivity {

    ListView artistsList;
    String artists[] = {"Artist 1", "Artist 2", "Artist 3", "Artist 4", "Artist 5", "Artist 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        artistsList = findViewById(R.id.listView_Artists);
        AlbumsAdapter artistsAdapter = new AlbumsAdapter(getApplicationContext(),artists);
        artistsList.setAdapter(artistsAdapter);

    }
}
