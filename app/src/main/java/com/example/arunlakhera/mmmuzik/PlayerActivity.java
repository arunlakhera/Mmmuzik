package com.example.arunlakhera.mmmuzik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    Bundle songBundle;
    String trackName;
    Button backButton;
    Button buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        songBundle = getIntent().getExtras();

        TextView playing_TextView = findViewById(R.id.textView_Playing);
        backButton = findViewById(R.id.button_Back);
        buyButton = findViewById(R.id.button_Buy);

        trackName = playing_TextView.getText() + " " + String.valueOf(songBundle.getString("trackName",""));
        playing_TextView.setText(trackName);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(PlayerActivity.this, TracksActivity.class);
                backIntent.putExtra("albumName", "NA");
                backIntent.putExtra("artistName", "NA");
                backIntent.putExtra("genreName", "NA");
                startActivity(backIntent);
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Paypal
                
            }
        });

    }
}
