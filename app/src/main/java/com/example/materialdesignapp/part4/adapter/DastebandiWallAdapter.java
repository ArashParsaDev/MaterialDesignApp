package com.example.materialdesignapp.part4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.model.Wallpaper;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DastebandiWallAdapter extends RecyclerView.Adapter<DastebandiWallAdapter.MyViewHolder> {

    Context context;
    List<Wallpaper> data;

    public DastebandiWallAdapter(Context context, List<Wallpaper> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_home_wallpaper_dastebandi,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.img);

        holder.textView.setText(data.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {

        RoundedImageView img;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.iv_homeWallpaper_dastebandi);
            textView=itemView.findViewById(R.id.tv_homeWallpaper_dastebandi);

        }
    }
}
