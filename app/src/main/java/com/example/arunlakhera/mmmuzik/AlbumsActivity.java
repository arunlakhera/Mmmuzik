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

    //Variable Declaration
    ListView albumsList;
    String albums[] = {"Album 1", "Album 2"};
    Button back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Initialize views
        albumsList = findViewById(R.id.listView_Albums);
        back_Button = findViewById(R.id.button_Back);

        AlbumsAdapter albumsAdapter = new AlbumsAdapter(getApplicationContext(), albums);
        albumsList.setAdapter(albumsAdapter);

        // Action to perform when an album is selected
        albumsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String albumName = albums[i];

                Intent albumIntent = new Intent(AlbumsActivity.this, TracksActivity.class);
                albumIntent.putExtra("albumName", albumName);
                albumIntent.putExtra("artistName", "NA");
                albumIntent.putExtra("genreName", "NA");
                startActivity(albumIntent);
            }
        });

        // Action to perform when back button is clicked
        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlbumsActivity.this, MainActivity.class));
            }
        });
    }
}
