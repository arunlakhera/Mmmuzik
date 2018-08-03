package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    ListView albumsList;
    String albums[] = {"Album 1", "Album 2", "Album 3", "Album 4", "Album 5", "Album 6"};

    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        albumsList = findViewById(R.id.listView_Albums);
        back_Button = findViewById(R.id.button_Back);

        AlbumsAdapter albumsAdapter = new AlbumsAdapter(getApplicationContext(),albums);
        albumsList.setAdapter(albumsAdapter);

        albumsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String albumName = albums[i];

                Intent albumIntent = new Intent(AlbumsActivity.this, TracksActivity.class);
                albumIntent.putExtra("albumName", albumName);
                startActivity(albumIntent);

            }
        });

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlbumsActivity.this,MainActivity.class));
            }
        });
    }
}
