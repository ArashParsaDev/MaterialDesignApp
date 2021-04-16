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

public class HeaderMusicAdapter extends RecyclerView.Adapter<HeaderMusicAdapter.MyViewHolder> {
    Context context;
    List<Music> data;

    public HeaderMusicAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_header_music,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_header_music.setText(data.get(position).getName());
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.iv_header_music);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_header_music;
        TextView tv_header_music;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_header_music = itemView.findViewById(R.id.iv_itemHeaderFrHome_music);
            tv_header_music = itemView.findViewById(R.id.tv_itemHeaderFrHome_music);
        }
    }
}
