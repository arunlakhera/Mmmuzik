package com.example.arunlakhera.mmmuzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class GenreActivity extends AppCompatActivity {

    ListView genreList;
    String genre[] = {"Genre 1", "Genre 2", "Genre 3", "Genre 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        genreList = findViewById(R.id.listView_Genre);
        GenreAdapter genreAdapter = new GenreAdapter(getApplicationContext(),genre);
        genreList.setAdapter(genreAdapter);
    }
}
