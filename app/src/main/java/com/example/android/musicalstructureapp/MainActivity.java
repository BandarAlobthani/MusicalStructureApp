package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView englishSong = (TextView) findViewById(R.id.english_song);

// Set a click listener on that View
        englishSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(MainActivity.this, EnglishSong.class);
                startActivity(englishIntent);
            }
        });

        TextView arabicSong = (TextView) findViewById(R.id.arabic_song);

// Set a click listener on that View
        arabicSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent arabicIntent = new Intent(MainActivity.this, ArabicSong.class);
                startActivity(arabicIntent);
            }
        });

        TextView frenshSong = (TextView) findViewById(R.id.french_song);

// Set a click listener on that View
        frenshSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent frenshIntent = new Intent(MainActivity.this, FrenchSong.class);
                startActivity(frenshIntent);
            }
        });

        TextView latinSong = (TextView) findViewById(R.id.latin_song);

// Set a click listener on that View
        latinSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent latinIntent = new Intent(MainActivity.this, LatinSong.class);
                startActivity(latinIntent);
            }
        });

    }
}
