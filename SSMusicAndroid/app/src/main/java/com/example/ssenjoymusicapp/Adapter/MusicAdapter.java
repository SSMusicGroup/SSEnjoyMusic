package com.example.ssenjoymusicapp.Adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.ssenjoymusicapp.model.Music;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {
    private Context myContext;
    int myLayout;
    List<Music> arrayMusic;
    public MusicAdapter(Context context, int layout, List<Music> furnitures)
    {
        super(context,layout,furnitures);
        myContext = context;
        myLayout = layout;
        arrayMusic = furnitures;
    }


}
