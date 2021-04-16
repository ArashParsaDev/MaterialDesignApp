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
import com.example.materialdesignapp.part3.PlayVideoMusicActivity;
import com.example.materialdesignapp.part3.model.Music;
import com.example.materialdesignapp.part3.model.MusicVideo;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MusicVideoAdapter extends RecyclerView.Adapter<MusicVideoAdapter.MyViewHolder> {

    Context context;
    List<MusicVideo> data;

    public MusicVideoAdapter(Context context, List<MusicVideo> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_music_video,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.iv_musicVideo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayVideoMusicActivity.class);
                intent.putExtra("link_video",data.get(position).getLink_video());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {
        ImageView iv_musicVideo;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_musicVideo=itemView.findViewById(R.id.iv_musicVideo);

        }
    }
}
