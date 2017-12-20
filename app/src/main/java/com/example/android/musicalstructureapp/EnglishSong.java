package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);

        // Create an ArrayList of Music objects
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Like Home Ft Alicia Keys", "Eminem", R.drawable.eminem));
        musics.add(new Music("Perfect Symphony Ft Andrea Bocelli", "Ed Sheeran", R.drawable.edsheeran));
        musics.add(new Music("No Hearts, No Love", "Big Sean", R.drawable.bigsean));
        musics.add(new Music("Feed These Streets", "Juicy J", R.drawable.juicy));
        musics.add(new Music("Let Me Love You", "DJ Snake Ft Justin Bieber", R.drawable.djsnake));
        musics.add(new Music("Nevada (feat. Cozi Zuehlsdorff)", "Rihanna", R.drawable.rihanna));
        musics.add(new Music("I m The One", "DJ Khaled", R.drawable.djkhaled));
        musics.add(new Music("Only You", "Selena Gomez", R.drawable.selena));
        musics.add(new Music("Starboy", "The Weekend", R.drawable.theweekend));
        musics.add(new Music("How Long", "Charlie Puth", R.drawable.charlie));

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
                Intent englishIntent = new Intent(EnglishSong.this, ArabicSong.class);
                startActivity(englishIntent);
            }
        });


    }

}
