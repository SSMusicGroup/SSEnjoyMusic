package com.example.ssenjoymusicapp.FragmentMain;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ssenjoymusicapp.Adapter.MusicAdapter;
import com.example.ssenjoymusicapp.R;
import com.example.ssenjoymusicapp.model.Music;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ListView listView;
    ArrayList<Music> arrayList;
    MusicAdapter musicAdapter;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("create_home", "khoi tao thanh cong!");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.listViewHomeMusic);

    }

    public ArrayList<Music> getData()
    {
        return null;
    }
}