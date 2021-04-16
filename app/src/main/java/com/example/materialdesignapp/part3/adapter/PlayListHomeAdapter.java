package com.example.materialdesignapp.part3.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.PlayListMusicActivity;
import com.example.materialdesignapp.part3.model.Music;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlayListHomeAdapter extends RecyclerView.Adapter<PlayListHomeAdapter.MyViewHolder> {
    Context context;
    List<Music> data;

    public PlayListHomeAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_home_music,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(data.get(position).getName());
        holder.tv_nameSong.setText(data.get(position).getName_song());
        holder.tv_time.setText(data.get(position).getTime());
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.iv_list);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayListMusicActivity.class);
                intent.putExtra("name",data.get(position).getName());
                intent.putExtra("song_name",data.get(position).getName_song());
                intent.putExtra("link_img",data.get(position).getLink_img());
                intent.putExtra("time",data.get(position).getTime());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_nameSong,tv_time;
        ImageView iv_list;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_itemHome_name);
            tv_nameSong = itemView.findViewById(R.id.tv_itemHome_nameSong);
            tv_time = itemView.findViewById(R.id.tv_itemHome_time);
            iv_list = itemView.findViewById(R.id.iv_itemHome_list);
        }
    }
}
