package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    // Varaiable Declaration
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

        // Initialize the views
        albums_Layout = findViewById(R.id.layout_Albums);
        artistsLayout = findViewById(R.id.layout_Artists);
        genre_Layout = findViewById(R.id.layout_Genre);
        tracks_Layout = findViewById(R.id.layout_Tracks);

        // Action to perform when Album option is selected
        albums_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                albumsFlag = true;
                artistsFlag = false;
                genreFlag = false;
                tracksFlag = false;
                callIntent();
            }
        });

        // Action to perform when Artist option is selected
        artistsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artistsFlag = true;
                albumsFlag = false;
                genreFlag = false;
                tracksFlag = false;
                callIntent();
            }
        });

        // Action to perform when Genre option is selected
        genre_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genreFlag = true;
                albumsFlag = false;
                artistsFlag = false;
                tracksFlag = false;
                callIntent();
            }
        });

        // Action to perform when Tracks option is selected
        tracks_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tracksFlag = true;
                albumsFlag = false;
                artistsFlag = false;
                genreFlag = false;
                callIntent();
            }
        });

    }

    // Function to move to next activity based on user selected option
    public void callIntent() {

        Intent activityIntent;
        activityIntent = new Intent(this, MainActivity.class);

        if (albumsFlag) {

            activityIntent = new Intent(this, AlbumsActivity.class);

        } else if (artistsFlag) {

            activityIntent = new Intent(this, ArtistsActivity.class);

        } else if (genreFlag) {

            activityIntent = new Intent(this, GenreActivity.class);

        } else if (tracksFlag) {

            activityIntent = new Intent(MainActivity.this, TracksActivity.class);
            activityIntent.putExtra("albumName", "NA");
            activityIntent.putExtra("artistName", "NA");
            activityIntent.putExtra("genreName", "NA");
        }

        startActivity(activityIntent);
    }
}
