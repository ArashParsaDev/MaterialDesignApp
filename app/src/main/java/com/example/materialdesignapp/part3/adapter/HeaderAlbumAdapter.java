package com.example.materialdesignapp.part3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.model.Music;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HeaderAlbumAdapter extends RecyclerView.Adapter<HeaderAlbumAdapter.MyViewHolder> {
    Context context;
    List<Music> data;

    public HeaderAlbumAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_header_album,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.iv_header_music);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_header_music;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_header_music = itemView.findViewById(R.id.iv_itemHeaderFrHome_album);
        }
    }
}
