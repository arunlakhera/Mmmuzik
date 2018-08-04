package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class GenreActivity extends AppCompatActivity {

    // Varaiable Declaration
    ListView genreList;
    String genre[] = {"Genre 1", "Genre 2"};
    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        // Initialize Views
        genreList = findViewById(R.id.listView_Genre);
        back_Button = findViewById(R.id.button_Back);

        GenreAdapter genreAdapter = new GenreAdapter(getApplicationContext(), genre);
        genreList.setAdapter(genreAdapter);

        // Action to perform when Genre is selected
        genreList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String genreName = genre[i];

                Intent albumIntent = new Intent(GenreActivity.this, TracksActivity.class);
                albumIntent.putExtra("albumName", "NA");
                albumIntent.putExtra("artistName", "NA");
                albumIntent.putExtra("genreName", genreName);
                startActivity(albumIntent);
            }
        });

        // Action to perform when back button is clicked
        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GenreActivity.this, MainActivity.class));
            }
        });
    }
}
