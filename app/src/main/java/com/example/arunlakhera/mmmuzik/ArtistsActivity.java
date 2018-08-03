package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ArtistsActivity extends AppCompatActivity {

    ListView artistsList;
    String artists[] = {"Artist 1", "Artist 2", "Artist 3", "Artist 4", "Artist 5", "Artist 6"};

    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        artistsList = findViewById(R.id.listView_Artists);
        back_Button = findViewById(R.id.button_Back);

        AlbumsAdapter artistsAdapter = new AlbumsAdapter(getApplicationContext(),artists);
        artistsList.setAdapter(artistsAdapter);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArtistsActivity.this,MainActivity.class));
            }
        });
    }
}
