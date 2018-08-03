package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class GenreActivity extends AppCompatActivity {

    ListView genreList;
    String genre[] = {"Genre 1", "Genre 2", "Genre 3", "Genre 4"};

    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        genreList = findViewById(R.id.listView_Genre);
        back_Button = findViewById(R.id.button_Back);

        GenreAdapter genreAdapter = new GenreAdapter(getApplicationContext(),genre);
        genreList.setAdapter(genreAdapter);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GenreActivity.this,MainActivity.class));
            }
        });
    }
}
