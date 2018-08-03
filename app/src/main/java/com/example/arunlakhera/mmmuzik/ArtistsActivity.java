package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ArtistsActivity extends AppCompatActivity {

    ListView artistsList;
    String artists[] = {"Artist 1", "Artist 2"};

    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        artistsList = findViewById(R.id.listView_Artists);
        back_Button = findViewById(R.id.button_Back);

        AlbumsAdapter artistsAdapter = new AlbumsAdapter(getApplicationContext(),artists);
        artistsList.setAdapter(artistsAdapter);

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

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ArtistsActivity.this,MainActivity.class));
            }
        });
    }
}
