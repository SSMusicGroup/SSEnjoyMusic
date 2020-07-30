package com.example.ssenjoymusicapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ssenjoymusicapp.Model.PlaylistToday;
import com.example.ssenjoymusicapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<PlaylistToday> {

    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<PlaylistToday> objects) {
        super(context, resource, objects);
    }
    class ViewHolder
    {
        TextView txtViewTenPlaylist;
        ImageView imgBackGround,imgPLaylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder  viewHolder = null;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.dong_playlist, null);
            viewHolder = new ViewHolder();
            viewHolder.txtViewTenPlaylist = convertView.findViewById(R.id.textViewTenPlaylist);
            viewHolder.imgPLaylist = convertView.findViewById(R.id.imageViewPlaylist);
            viewHolder.imgBackGround = convertView.findViewById(R.id.imageViewBackGroundPlaylist);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        PlaylistToday playlistToday =   getItem(position);
        Picasso.with(getContext()).load(playlistToday.getHinhNen()).into(viewHolder.imgBackGround);
        Picasso.with(getContext()).load(playlistToday.getHinhIcon()).into(viewHolder.imgPLaylist);
        viewHolder.txtViewTenPlaylist.setText(playlistToday.getTen());
        return convertView;

    }
}
