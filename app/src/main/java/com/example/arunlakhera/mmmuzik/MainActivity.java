package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout albums_Layout;
    LinearLayout artistsLayout;
    LinearLayout genre_Layout;
    LinearLayout tracks_Layout;

    Boolean albumsFlag;
    Boolean artistsFlag;
    Boolean genreFlag;
    Boolean tracksFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        albumsFlag = false;
        artistsFlag = false;
        genreFlag = false;
        tracksFlag = false;

        albums_Layout = findViewById(R.id.layout_Albums);
        artistsLayout = findViewById(R.id.layout_Artists);
        genre_Layout = findViewById(R.id.layout_Genre);
        tracks_Layout = findViewById(R.id.layout_Tracks);

        albums_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                albumsFlag = true;
                callIntent();
            }
        });

        artistsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artistsFlag = true;
                callIntent();
            }
        });

        genre_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genreFlag = true;
                callIntent();
            }
        });

        tracks_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tracksFlag = true;
                callIntent();
            }
        });

    }

    public void callIntent(){

        Intent activityIntent;
        activityIntent = new Intent(this, MainActivity.class);

        if (albumsFlag){

            activityIntent = new Intent(this,AlbumsActivity.class);

        }else if (artistsFlag){

            activityIntent = new Intent(this,ArtistsActivity.class);

        }else if (genreFlag){

            activityIntent = new Intent(this,GenreActivity.class);

        }else if (tracksFlag){

            activityIntent = new Intent(this,TracksActivity.class);

        }

        startActivity(activityIntent);
    }
}
