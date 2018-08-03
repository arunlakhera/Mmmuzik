package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class TracksActivity extends AppCompatActivity {

    ListView tracksList;
    String[] allTracks = {"Track1","Track2","Track3","Track 4","Track 5","Track 6"};

    Button back_Button;
    TracksAdapter tracksAdapter;

    Bundle songBundle;
    String albumName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        tracksList = findViewById(R.id.listView_Tracks);
        back_Button = findViewById(R.id.button_Back);

        songBundle = getIntent().getExtras();

        albumName = String.valueOf(songBundle.getString("albumName",""));

        if(albumName.equals("Album 1")){
            String[] albumTracks = {"Track 1", "Track 2"};

            tracksAdapter = new TracksAdapter(getApplicationContext(), albumTracks);
            tracksList.setAdapter(tracksAdapter);

        }else if(albumName.equals("Album 2")){
            String[] albumTracks = {"Track 1", "Track 2","Track 3"};

            tracksAdapter = new TracksAdapter(getApplicationContext(), albumTracks);
            tracksList.setAdapter(tracksAdapter);
        }else{
            String[] albumTracks = allTracks;

            tracksAdapter = new TracksAdapter(getApplicationContext(), albumTracks);
            tracksList.setAdapter(tracksAdapter);
        }

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TracksActivity.this,MainActivity.class));
            }
        });

    }
}
