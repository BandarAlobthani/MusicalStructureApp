package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ArabicSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);

        // Create an ArrayList of Music objects
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("MUCHAS GRACIAS", "Zouhair Bahaoui", R.drawable.zouhair));
        musics.add(new Music("Ana Alwanait", "Mohammed Alsalim", R.drawable.mohammed));
        musics.add(new Music("LM3ALLEM", "Saad Lamjarred", R.drawable.saad));
        musics.add(new Music("Shedni Ghomorni", "Adham Nabulsi", R.drawable.adham));
        musics.add(new Music("Awal Sana", "Mohammed Alsalim", R.drawable.mohammedsana));
        musics.add(new Music("Negoul Mali", "Fanire", R.drawable.fanire));
        musics.add(new Music("Luv", "Tory Lanez", R.drawable.tory));
        musics.add(new Music("Boshret Kheir", "Hussain Al Jassmi", R.drawable.hussain));
        musics.add(new Music("Yama", "Hatim Ammor", R.drawable.hatim));
        musics.add(new Music("Blach Blach", "Jamila", R.drawable.jamila));

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
            // The code in this method will be executed when the Numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(ArabicSong.this, FrenchSong.class);
                startActivity(englishIntent);
            }
        });
    }
}
