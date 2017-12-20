package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LatinSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);

        // Create an ArrayList of Music objects
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Mi Gente", "J Balvin & Willy William Featuring Beyonce", R.drawable.migente));
        musics.add(new Music("Despacito", "Luis Fonsi & Daddy Yankee", R.drawable.luis));
        musics.add(new Music("Echame La Culpa", "Luis Fonsi & Demi Lovato", R.drawable.luisfasoni));
        musics.add(new Music("Mayores", "Becky G Featuring Bad Bunny", R.drawable.becky));
        musics.add(new Music("Escapate Conmigo", "Wisin Featuring Ozuna", R.drawable.wisin));
        musics.add(new Music("Maluma", "Felices Los 4", R.drawable.los));
        musics.add(new Music("Bella y Sensual", "Romeo Santos", R.drawable.bella));
        musics.add(new Music("Criminal", "Natti Natasha x Ozuna", R.drawable.criminal));
        musics.add(new Music("Krippy Kush", "Farruko, Nicki Minaj", R.drawable.farruko));
        musics.add(new Music("Perro Fiel", "Shakira Featuring Nicky Jam", R.drawable.perro));

        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link Music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdapter musicAdapter = new MusicAdapter(this, musics);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_song);
        listView.setAdapter(musicAdapter);

        // Get Button by button ID
        Button button= (Button) findViewById(R.id.buttonl);
        // Set a click listener on that View
        button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(LatinSong.this, MainActivity.class);
                startActivity(englishIntent);
            }
        });
    }
}
