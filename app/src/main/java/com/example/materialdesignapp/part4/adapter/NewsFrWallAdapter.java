package com.example.materialdesignapp.part4.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.DetailsWallpaperActivity;
import com.example.materialdesignapp.part4.model.Wallpaper;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsFrWallAdapter extends RecyclerView.Adapter<NewsFrWallAdapter.MyViewHolder> {

    Context context;
    List<Wallpaper> data;

    public NewsFrWallAdapter(Context context, List<Wallpaper> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_newsfr_news,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, DetailsWallpaperActivity.class);
                intent.putExtra("link_img",data.get(position).getLink_img());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {

        RoundedImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.iv_FrNews_news);

        }
    }
}
