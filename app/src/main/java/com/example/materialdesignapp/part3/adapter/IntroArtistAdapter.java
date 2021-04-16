package com.example.materialdesignapp.part3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.model.Music;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class IntroArtistAdapter extends RecyclerView.Adapter<IntroArtistAdapter.MyViewHolder> {

    Context context;
    List<Music> data;

    public IntroArtistAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_intro_artist,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(data.get(position).getName()+"-"+data.get(position).getName_song());
        holder.tv_countSongs.setText("تعداد قطعه ها:"+data.get(position).getSong_count());
        holder.tv_fav.setText("("+data.get(position).getFavorite_count()+")");
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.kenBurnsView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {
        TextView tv_name,tv_fav,tv_countSongs;
        KenBurnsView kenBurnsView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_intro_name);
            tv_fav = itemView.findViewById(R.id.tv_fav);
            tv_countSongs = itemView.findViewById(R.id.tv_intro_countSongs);

            kenBurnsView = itemView.findViewById(R.id.kenView);
        }
    }
}
