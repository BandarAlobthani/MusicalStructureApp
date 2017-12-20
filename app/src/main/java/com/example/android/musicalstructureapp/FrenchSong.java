package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FrenchSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);

        // Create an ArrayList of Music objects
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Comme Des Enfants", "Cœur De Pirate", R.drawable.curdepirate));
        musics.add(new Music("Papaoutai", "Stromae", R.drawable.stromae));
        musics.add(new Music("Coups et Blessures", "BB Brunes", R.drawable.bb));
        musics.add(new Music("Je Me Tire", "Maître Gims", R.drawable.maitre));
        musics.add(new Music("Je Te Donne", "Génération Goldman", R.drawable.jetedonne));
        musics.add(new Music("Dernière Danse", "Indila", R.drawable.derniere));
        musics.add(new Music("Cosmo", "Soprano", R.drawable.cosmo));
        musics.add(new Music("Ma Direction", "Sexion D’assault", R.drawable.madirection));
        musics.add(new Music("Je Me Lâche", "Christophe Mae", R.drawable.christophe));
        musics.add(new Music("Elle Me Dit", "Mika", R.drawable.elleme));

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
                Intent englishIntent = new Intent(FrenchSong.this, LatinSong.class);
                startActivity(englishIntent);
            }
        });
    }
}
