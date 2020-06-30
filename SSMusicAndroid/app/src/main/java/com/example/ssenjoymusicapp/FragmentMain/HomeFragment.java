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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        arrayList = getData();
        musicAdapter = new MusicAdapter(getContext(), R.layout.music_view_adapter, arrayList);
        listView.setAdapter(musicAdapter);
        final int[] n = new int[getData().size()];
        for (int i = 0; i < n.length; i++) {
            n[i] = -1;
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (n[position] == -1){
                    n[position] = 1;
                    Toast.makeText(getContext(), position + "", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public ArrayList<Music> getData()
    {
        ArrayList<Music> tmp = new ArrayList<>();
        tmp.add(new Music(getString(R.string.M_1_Trieu_Like), getString(R.string.TG_Den_Vau),
                Music.convertStringToBitmapFromAccess(getContext(), "DenVau.jpg") ));
        tmp.add(new Music(getString(R.string.M_10_Nam), getString(R.string.TG_Den_Vau),
                Music.convertStringToBitmapFromAccess(getContext(), "DenVau.jpg") ));
        tmp.add(new Music(getString(R.string.M_Con_mua_ngang_qua), getString(R.string.TG_MTP),
                Music.convertStringToBitmapFromAccess(getContext(), "MTP.jpg") ));
        return tmp;
    }
}