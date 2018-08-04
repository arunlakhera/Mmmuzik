package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ArtistsActivity extends AppCompatActivity {

    // Varaiable Declaration
    ListView artistsList;
    String artists[] = {"Artist 1", "Artist 2"};
    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Initialize Variables
        artistsList = findViewById(R.id.listView_Artists);
        back_Button = findViewById(R.id.button_Back);

        AlbumsAdapter artistsAdapter = new AlbumsAdapter(getApplicationContext(), artists);
        artistsList.setAdapter(artistsAdapter);

        // Action to perform when an Aritist is selected
        artistsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String artistName = artists[i];

                Intent albumIntent = new Intent(ArtistsActivity.this, TracksActivity.class);
                albumIntent.putExtra("albumName", "NA");
                albumIntent.putExtra("artistName", artistName);
                albumIntent.putExtra("genreName", "NA");
                startActivity(albumIntent);

            }
        });

        // Action to perform when back button is clicked
        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ArtistsActivity.this, MainActivity.class));
            }
        });
    }
}
