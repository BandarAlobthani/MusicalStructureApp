package com.example.android.musicalstructureapp;

import android.media.MediaPlayer;
import android.widget.Button;

/**
 * Created by bander on 12/18/2017.
 */
/**
 * {@link Music} represents a single Android platform release.
 * Each object has 3 properties: Song name, Artist Name, and image resource ID.
 */
public class Music {

    // Name of the song (e.g. Starboy, Only You)
    private String mSongName;

    // Artist Name (e.g. Eminem, Ed Sheeran)
    private String mArtistName;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new Music object.
    *
    * @param songName is the songName (e.g. Starboy)
    * @param artistName is the artistName (e.g. Eminem)
    * @param imageResourceId is drawable reference ID that corresponds to the song
    * */
    public Music(String songName, String artistName, int imageResourceId){
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the songName of the Android version
     */
    public String getmSongName(){

        return mSongName;
    }

    /**
     * Get the ArtistName of the Android version
     */
    public String getmArtistName(){
        return mArtistName;
    }

    /**
     * Get the image resource ID
     */
    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
