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
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class NewSongAdapter extends RecyclerView.Adapter<NewSongAdapter.MyViewHolder> {

    Context context;
    List<Music> data;

    public NewSongAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_new_song,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(data.get(position).getName());
        holder.tv_nameSong.setText(data.get(position).getName_song());
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.iv_song);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {
        TextView tv_name,tv_nameSong;
        ImageView iv_song;
        BlurView blurView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_newSong_name);
            tv_nameSong = itemView.findViewById(R.id.tv_newSong_nameSong);
            iv_song = itemView.findViewById(R.id.iv_newSong);


            blurView =itemView.findViewById(R.id.blurview);
            ViewGroup rootView = itemView.findViewById(R.id.rootView);
            blurView.setupWith(rootView)
                    .setBlurAlgorithm(new RenderScriptBlur(context))
                    .setHasFixedTransformationMatrix(true)
                    .setBlurRadius(25f);
        }
    }
}
