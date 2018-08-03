package com.example.arunlakhera.mmmuzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TracksActivity extends AppCompatActivity {

    ListView tracksList;
    String tracks[] = {"Track 1", "Track 2", "Track 3", "Track 4","Track 5","Track 6","Track 7","Track 8","Track 9","Track 10","Track 11","Track 12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        tracksList = findViewById(R.id.listView_Tracks);
        TracksAdapter tracksAdapter = new TracksAdapter(getApplicationContext(),tracks);
        tracksList.setAdapter(tracksAdapter);

    }
}
